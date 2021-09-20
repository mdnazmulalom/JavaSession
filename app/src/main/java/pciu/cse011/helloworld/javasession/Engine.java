package pciu.cse011.helloworld.javasession;

public class Engine {
    private String model;
    private int rpm;
    //constructior generate shutcut // command+N


    public Engine(String model, int rpm) {
        this.model = model;
        this.rpm = rpm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
}
