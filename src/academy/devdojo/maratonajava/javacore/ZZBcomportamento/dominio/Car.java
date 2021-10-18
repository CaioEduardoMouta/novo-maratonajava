package academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio;

public class Car {
    private String name= "TORO";
    private String color;
    private int year;

    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
