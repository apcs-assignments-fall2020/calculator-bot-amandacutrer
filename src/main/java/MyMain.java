import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        int big = Math.max(a, b);
        int max = Math.max(big, c);
        int small = Math.min(a, b);
        int min = Math.min(small, c);
        if (a != min && a != max){
            return a; 
        }
        if (b != min && b != max){
            return b; 
        }
        else{
            return c;
        }  
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if (Math.abs(a) > Math.abs(b)){
            return a; 
        }
        else{
            return b; 
        }
        
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        int a2 = a*a;
        int b2 = b*b;
        return Math.sqrt(a2 + b2); 
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        System.out.print("Which command would you like to run? ");
        String command = scan.next(); 
        if (command.equals("median")){
            System.out.print("What is the first number? ");
            String n1 = scan.next(); 
            int a = Integer.parseInt(n1);
            System.out.println("What is the second number? ");
            String n2 = scan.next();
            int b = Integer.parseInt(n2);
            System.out.println("What is the third number? ");
            String n3 = scan.next();
            int c = Integer.parseInt(n3);
            System.out.println(median(a, b, c));
        }
        if (command.equals("magnitude")){
            System.out.print("What is the first number? ");
            String n1 = scan.next(); 
            int a = Integer.parseInt(n1);
            System.out.println("What is the second number? ");
            String n2 = scan.next();
            int b = Integer.parseInt(n2);
            System.out.println(magnitude(a, b));
        }
        if (command.equals("pythagoras")){
            System.out.print("What is the first number? ");
            String n1 = scan.next(); 
            int a = Integer.parseInt(n1);
            System.out.println("What is the second number? ");
            String n2 = scan.next();
            int b = Integer.parseInt(n2);
            System.out.println(pythagoras(a, b));
        }


        scan.close();
    }
}
