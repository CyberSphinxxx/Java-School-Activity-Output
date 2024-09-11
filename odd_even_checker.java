import java.util.Scanner;

public class odd_even_checker {
    public static void separator(){
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) { 
            separator();
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
            }

            else {
                System.out.println(number + " is an odd number.");
            }
        }
    }
}