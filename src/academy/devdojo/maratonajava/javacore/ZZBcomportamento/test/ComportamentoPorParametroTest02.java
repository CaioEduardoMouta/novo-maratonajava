package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(
            new Car("green",2011),
            new Car("black",2012),
            new Car("red",2020)
    );

    public static void main(String[] args) {

    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> oldCars = new ArrayList<>();
        for (Car car:cars){
            if(car.getColor().equals(cor)){
                oldCars.add(car);
            }
        }
        return oldCars;
    }
}
