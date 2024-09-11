import java.util.Scanner;

public class youth_checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String separator = "-----------------------------";

        while(true){
            System.out.println(separator);
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

                if (age >= 12 && age <= 30) {
                    System.out.println("You are a youth.");
                }

                else {
                    System.out.println("You are not a youth.");
                }      
        }
    }
}
