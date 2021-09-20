package pciu.cse011.helloworld.javasession;

public class Car {
    private String name;
    private int doors;
    private Engine engine; // this is called Composition

    public Car(String name, int doors, Engine engine) {
        this.name = name;
        this.doors = doors;
        this.engine = engine;// this is called
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
