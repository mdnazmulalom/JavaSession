package pciu.cse011.helloworld.javasession;

public class Dog extends Animal{
    public Dog(String name, String color, int legs, boolean hasTale) {
        super(name, color, legs, hasTale);
    }

    @Override
    public void eat(String food) {
        super.eat(food);
    }
}
