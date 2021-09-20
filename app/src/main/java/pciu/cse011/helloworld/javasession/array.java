package pciu.cse011.helloworld.javasession;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
      /*  String[] names = new String[5];
        names[0] = "Meisam";
        names[1] = "remo";
        names[2] = "Mishu";
        names[3] = "kawsar";
        names[4] = "Reza";
        //System.out.println(names[4]);

       for (int i=0;i<names.length;i++){
           System.out.println(names[i]);
       }
*/
      String[] names = {"mamun", "masud", "kawsar", "reza", "totul"};
      int[] numbers = {12345, 23232, 23232, 23232, 232326};
        System.out.println("Please Enter a name : ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        for (int i=0; i<names.length; i++ ){
            if (names[i].equals(name)){
                System.out.println(numbers[i]);
                System.out.println(names.length);
            }
        }




    }
}
