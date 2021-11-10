package academy.devdojo.maratonajava.javacore.ZZIjdbc.teste;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {

    public static void main(String[] args) {
       Producer producer = Producer.builder().name("Studio Dean").build();
    //   ProducerService.save(producer);
        ProducerService.delete(4);


//        log.info("INFO");
//        log.debug("INFO");
//        log.warn("INFO");
//        log.error("INFO");
//        log.trace("INFO");
    }
}
