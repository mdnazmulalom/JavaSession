package pciu.cse011.helloworld.javasession;

public class mainClass {
    public static void main(String[] args) {

        /// this is for Animal ,dog,bird,Shepherd
       /* Dog dog = new Dog("Roland","Brown",4,true);
        System.out.println(dog.getName());
        dog.eat(" Meat");
        Bird bird = new Bird("nina","white",2,true,true);
        bird.Fly(); */
       //Composition object means on object in difference object


        //this is for car and engine
      /*  Engine engine = new Engine("Renault", 6000);
        Car car = new Car("Marchedies",4,new Engine("Renault", 6000));
        System.out.println("Name " + car.getName());
        System.out.println("Engine model "+ car.getEngine().getModel());
*/

        try {
            int[] mynumber = {1, 2, 3, 40};
            System.out.println("Output is array = "+mynumber[3]);

        } catch (Exception e){
            System.out.println("some thing is wrong");
        }


    }
}
