public class HW2 {

        public static void main (String [] args) {

            int a = 15;
            int b = 4;
            System.out.println("a + b = " + (a + b));
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(1.0 * a / b);
            System.out.println(a % b);

            if (a % 2 == 0) {
                System.out.println ("a is even" );
            } else {
                System.out.println ("a is odd" );
            }

            if (b % 2 == 0) {
                System.out.println ("b is even" );
            } else {
                System.out.println ("b is odd" );
            }

            System.out.println("(◕‿◕)");
            System.out.println("\uD83D\uDE00");

            // char is digit or letter
            char symbol = '1';
            if (symbol >= '0' && symbol <= '9') {
                System.out.println(symbol + " is a digit");
            }else{
                if (symbol >= 'A' && symbol <= 'Z' || symbol >= 'a' && symbol <= 'z');
                System.out.println(symbol + " is a latter");
            }

        }


}
