import java.util.Scanner;

public class elifprac {

    public static void separator() {
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Scanner age_input = new Scanner(System.in);

        while (true){
        separator();
        System.out.print("Enter age: ");
        int age = age_input.nextInt();

            if (age < 18) {
                separator();
                System.out.println("You are a minor.");
                separator();
            }
        
            else if (age >= 18) {
                separator();
                System.out.println("You can enter");
            }

            else {
                separator();
                System.out.println("Invalid input.");
            }
        }
    }
}
