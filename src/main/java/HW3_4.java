public class HW3_4 {

    public static void main (String[] args){

        // TASK 1
       int a = 15;
       int b = -2;
       if ( a == b ) {
           System.out.println ("a == b");
       } else if (a < b) {
           System.out.println("a < b");
       } else {
           System.out.println("a > b");
       }

       //TASK 2

        int a1 = 45;
        int b1 = 34;
        if ( (a1 + b1) % 2 == 1 ) {
            System.out.println("some variable is odd");
        } else {
            System.out.println("maybe a and b are even");
        }

        //TASK 3
        int i = 4;
        if (i > 10) {
            System.out.println("> 10");
        }
        if (i < 100) {
            System.out.println("< 100");
        }
        if ( i / 2.0 > 20 ) {
            System.out.println("результат деления на 2 больше 20");
        }
        if ( i >= 5 && i <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }

        // TASK 4

        for (int u = 0; u < 16; u++) {
            System.out.print(u + " ");
        }
        System.out.println(" ");
         // TASK 5

        for (int y = 5; y < 10_000; y = y*y) {
            System.out.print(y + " ");
        }
        System.out.println(" ");

        // TASK 6 v1
        for (int f = 40; f <= 60; f++) {
            if ( f % 4 == 0) {
                System.out.print( f + " ");
            }
        }
        System.out.println(" ");

        // TASK 6 v2
        for (int s = 40; s <= 60; s = s + 4) {
            System.out.print( s + " ");
        }





        }












    }

