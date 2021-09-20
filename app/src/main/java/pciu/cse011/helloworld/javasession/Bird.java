package pciu.cse011.helloworld.javasession;

public class Bird extends Animal{
    private boolean hasFur;

    public Bird(String name, String color, int legs, boolean hasTale, boolean hasFur) {
        super(name, color, legs, hasTale);
        this.hasFur = hasFur;
    }

    @Override
    public void eat(String food) {
        super.eat(food);
    }
    public void Fly(){
        System.out.println(this.getName() + " " + "Flying.....");
    }
}
