package academy.devdojo.maratonajava.javacore.ZZIjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

public class ProducerService {

    public static void save(Producer producer) {
        ProducerRepository.save(producer);

    }

    public static void delete(int id) {
        if (id <= 0){
            throw new IllegalArgumentException("Número invalido");
        }
        ProducerRepository.delete(id);
    }
}
