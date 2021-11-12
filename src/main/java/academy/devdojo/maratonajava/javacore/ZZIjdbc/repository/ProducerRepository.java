package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {

    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Database rows affected", producer.getName(), rowsAffected);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            log.error("Erro ao tentar inserir o produto '{}'", producer.getName(), e);

        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');\n".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("delete producer '{]' rows affected", id, rowsAffected);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            log.error("Erro ao tentar inserir o produto '{}'", id, e);

        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d');"
                .formatted(producer.getName(), producer.getId());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Update producer '{]' rows affected", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Erro ao tentar inserir o produto '{}'", producer.getId(), e);

        }
    }

    public static List<Producer> findAll() {
        log.info("Procurando todos o produtos");
        return findByName("");
//        String sql = "SELECT id, name FROM anime_store.producer;";
//        List<Producer> producers = new ArrayList<>();
//        try (Connection conn = ConnectionFactory.getConnection();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(sql)) {
//
//            while (rs.next()) {
//                Producer producer = Producer
//                        .builder()
//                        .id(rs.getInt("id"))
//                        .name(rs.getString("name"))
//                        .build();
//                producers.add(producer);
//            }
//        } catch (SQLException e) {
//            log.error("Erro ao tentar inserir o produto", e);
//        }
//        return producers;
        }

    public static List<Producer> findByName(String name) {
        log.info("Procurando todos o produtos por nome");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';"
                    .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Erro ao tentar inserir o produto", e);
        }
        return producers;
    }

    public static void showProducerMetaData() {
        log.info("Mostrando produtos");
        String sql = "SELECT * FROM anime_store.producer";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData rsMetaData = rs.getMetaData();
            rs.next();
            int columnCount = rsMetaData.getColumnCount();
            log.info("Columns count '{}'", columnCount);
            for (int i = 1; i <= columnCount; i++) {
                log.info("Table name '{}'",rsMetaData.getTableName(i));
                log.info("Column name '{}'",rsMetaData.getColumnName(i));
                log.info("Column size '{}'",rsMetaData.getColumnDisplaySize(i));
                log.info("Column type '{}'",rsMetaData.getColumnType(i));
                log.info("Column type '{}'",rsMetaData.getColumnTypeName(i));

            }
        } catch (SQLException e) {
            log.error("Erro ao tentar inserir o produto", e);
        }

    }
    public static void showDriveMetaData() {
        log.info("Mostrando Drive");
        String sql = "SELECT * FROM anime_store.producer";
        try (Connection conn = ConnectionFactory.getConnection()) {
            DatabaseMetaData dbmetaData = conn.getMetaData();
            if(dbmetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)){
                log.info("Support TYPE_FORWARD_ONLY");
                if(dbmetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)){
                    log.info("And Supports CONCUR-UPDATABLE");
                }
            }
            if(dbmetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                log.info("Support TYPE_SCROLL_INSENSITIVE");
                if(dbmetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    log.info("And Supports CONCUR-UPDATABLE");
                }
            }
            if(dbmetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
                log.info("Support TYPE_SCROLL_SENSITIVE");
                if(dbmetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    log.info("And Supports CONCUR-UPDATABLE");
                }
            }
        } catch (SQLException e) {
            log.error("Erro ao tentar procurar todos os produtos ",e);
        }


    }
    public static void showTypeScrollWorking() {
        String sql = "SELECT * FROM anime_store.producer;";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            log.info("Last row '{}'",rs.last());
            log.info("Row num '{}'",rs.getRow());
            log.info(Producer
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());

            log.info("First row '{}'",rs.first());
            log.info("Row number '{}'",rs.getRow());
            log.info(Producer
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());

            log.info("Row Absolute? '{}'",rs.absolute(2));
            log.info("Row number '{}'",rs.getRow());
            log.info(Producer
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());

            log.info("Row Absolute? '{}'",rs.relative(-1));
            log.info("Row number '{}'",rs.getRow());
            log.info(Producer
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());

            log.info("is last? '{}'",rs.isLast());
            log.info("Row number '{}'",rs.getRow());

            log.info("is last? '{}'",rs.isFirst());
            log.info("Row number '{}'",rs.getRow());

            log.info("Last row? '{}'",rs.last());
            log.info("-----------------");
            rs.next();
            log.info("After Last row? '{}'",rs.isAfterLast());
            while(rs.previous()){
                log.info(Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build());
            }
        } catch (SQLException e) {
            log.error("Erro ao tentar inserir o produto", e);
        }

    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        log.info("Procurando o nome");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            if(!rs.next()){
                rs.moveToInsertRow();
                rs.updateString("name",name);
                rs.insertRow();
            }
            while (rs.next()) {
                rs.updateString("name",rs.getString("name").toUpperCase());
                rs.updateRow();
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Erro ao tentar inserir o produto", e);
        }
        return producers;
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {
        log.info("Procurando o nome");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                rs.updateString("name",rs.getString("name").toUpperCase());
                rs.updateRow();
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Erro ao tentar inserir o produto", e);
        }
        return producers;
    }

    public static List<Producer> findNameAndInsertWhenNotFound(String name) {
        log.info("Procurando o nome");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) return producers;

            insertNewProducer(name, rs);

            producers.add(getProducer(rs));

        } catch (SQLException e) {
            log.error("Erro ao tentar inserir o produto", e);
        }
        return producers;
    }

    private static void insertNewProducer(String name, ResultSet rs) throws SQLException {
        rs.moveToInsertRow();
        rs.updateString("name", name);
        rs.updateRow();
    }

    private static Producer getProducer(ResultSet rs) throws SQLException {
        rs.beforeFirst();
        rs.next();
        Producer producer = Producer
                .builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .build();
        return producer;
    }


}
