import java.util.InputMismatchException;
import java.util.Scanner;

public class Converter {
    private int dogAge;
    private int humanAge;
    private boolean invalid = false;

    public void ageConverter() {
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Type your dog age");
                this.dogAge = scanner.nextInt();
                if (this.dogAge < 0) {
                    throw new IllegalArgumentException("Negative number's not allowed");
                }
                invalid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input make sure you enter a valid input");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        } while (!invalid);
        scanner.close();
        this.humanAge = this.dogAge * 7;
        System.out.println("Dogs Age: " + this.dogAge);
        System.out.println("Dogs Age Converted To Human: " + this.humanAge);
    }

}
