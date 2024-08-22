import java.util.Scanner; // to read an input, include the scanner class.......

public class HalfDiamondPattern { // declare the public class name
    public static void main(String[] args) { // do not forget the main method, it is necessary
        Scanner scanner = new Scanner(System.in); // create a new scanner to read the inputs
        System.out.print("Enter number: "); // print or display "Enter number: "
        int n = scanner.nextInt(); // reads the input variable 

        // print the top half of the pattern
        for (int d = 0; d <= n; d++) { // this is where the loop starts
            System.out.print("*"); // print the leading star
            for (int i = 1; i <= d; i++) { 
                System.out.print(i); // print ascending numbers
            }
            for (int e = d - 1; e >= 1; e--) {
                System.out.print(e); // print descending numbers
            }
            if (d > 0) {
                System.out.print("*"); // print the trailing star
            }
            System.out.println(); // move to the next line
        }
         // print the bottom half of the pattern
         for (int a = n - 1; a >= 0; a--) {
            System.out.print("*"); // print the leading star
            for (int b = 1; b <= a; b++) {
                System.out.print(b); // print ascending numbers
            }
            for (int c = a - 1; c >= 1; c--) {
                System.out.print(c); // print descending numbers
            }
            if (a > 0) {
                System.out.print("*"); // print the trailing star
            }
            System.out.println(); // move to the next line
        }

        scanner.close();
    }
}

