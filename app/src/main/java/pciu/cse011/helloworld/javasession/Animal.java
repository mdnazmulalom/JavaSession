package pciu.cse011.helloworld.javasession;

public class Animal {
    private String name;
    private String Color;
    private int legs;
    private boolean hasTale;

    public Animal(String name, String color, int legs, boolean hasTale) {
        this.name = name;
        Color = color;
        this.legs = legs;
        this.hasTale = hasTale;
    }
    public void eat (String food){
        System.out.println("Eating" + food);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isHasTale() {
        return hasTale;
    }

    public void setHasTale(boolean hasTale) {
        this.hasTale = hasTale;
    }
}
