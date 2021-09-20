package pciu.cse011.helloworld.javasession;

public class javaexception {
    public void main(String[]args) {
        try {
            int[] mynumber = {1, 2, 3, 4};
            System.out.println(mynumber[10]);

        } catch (Exception e){
            System.out.println("some thing is wrong");
        }
    }
}
