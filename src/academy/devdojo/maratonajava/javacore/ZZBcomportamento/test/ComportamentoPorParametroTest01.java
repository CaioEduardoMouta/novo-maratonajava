package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(
            new Car("green",2011),
            new Car("black",2012),
            new Car("red",2020)
    );

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterCarByColor(cars,"green"));
        System.out.println(filterCarByColor(cars,"red"));
        System.out.println("-----");
        System.out.println(filterByYear(cars,2018));
    }
    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> greenCars = new ArrayList<>();
        for (Car car:cars){
            if(car.getColor().equals("green")){
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars,String cor){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car:cars){
            if(car.getColor().equals(cor)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterByYear(List<Car> cars,int year){
        List<Car> oldCars = new ArrayList<>();
        for (Car car:cars){
            if(car.getYear() < year){
                oldCars.add(car);
            }
        }
        return oldCars;
    }
}
