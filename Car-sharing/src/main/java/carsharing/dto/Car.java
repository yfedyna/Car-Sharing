package carsharing.dto;

public class Car {

    private int id;
    private String name;


    public Car(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
