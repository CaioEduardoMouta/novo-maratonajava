package academy.devdojo.maratonajava.javacore.ZZIjdbc.teste;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import java.util.List;
public class ConnectionFactoryTest03 {
    public static void main(String[] args) {
        Producer producer1 = Producer.builder().name("Lisboa").build();
        Producer producer2 = Producer.builder().name("Porto").build();
        Producer producer3 = Producer.builder().name("Benfica").build();
        ProducerService.saveTransaction(List.of(producer1,producer2,producer3));
    }

}
