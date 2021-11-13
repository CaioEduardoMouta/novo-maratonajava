package academy.devdojo.maratonajava.javacore.ZZIjdbc.teste;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {

    public static void main(String[] args) {
       Producer producer = Producer.builder().name("Studio Dean").build();
       Producer producerToUpdate = Producer.builder().id(1).name("Caio Mouta").build();
    //   ProducerService.save(producer);
//       ProducerService.delete(4);
        //ProducerService.update(producerToUpdate);
     //   List<Producer> producers = ProducerService.findAll();
        //List<Producer> producers = ProducerService.findByName("Cai");
       // log.info("Producers found '{}'",producers);

        //ProducerService.showProducerMetadata();
       // ProducerService.showDriveMetaData();
       // ProducerService.showTypeScrollWorking();
        //List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Dean");
       // List<Producer> producers = ProducerService.findNameAndInsertWhenNotFound("Caio Mouta");
      //  log.info("Producers found '{}'", producers);

       //ProducerService.findByNameAndDelete("NHK");
        List<Producer> producers = ProducerService.findByNamePreparedStatement("Caio Mouta");
        log.info("Producers found '{}'", producers);
//        log.info("INFO");
//        log.debug("INFO");
//        log.warn("INFO");
//        log.error("INFO");
//        log.trace("INFO");
    }
}
