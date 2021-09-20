package pciu.cse011.helloworld.javasession;

public class main {
    public static void main(String[] args) {
        Phone iphone = new Phone(5,"iphone x",8,8);
        System.out.println("Name: "+ iphone.getName());
        iphone.playMusic("Nazmul check the oop");
        Phone pixel = new Phone(16);
        System.out.println("Ram " + pixel.getMymoryRam());

        

    }
}
