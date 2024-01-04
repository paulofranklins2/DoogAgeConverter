import lombok.Getter;
import lombok.Setter;

import java.util.InputMismatchException;
import java.util.Scanner;

@Getter
@Setter
public class Converter {
    private int dogAge;
    private int humanAge;

    public void ageConverter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Type your Dog's age");
                int age = scanner.nextInt();
                if (age < 0) {
                    throw new IllegalArgumentException("Negative numbers are not allowed");
                }
                this.setDogAge(age);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Make sure you enter a valid integer.");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
        ageCalc();
        printAge();
    }

    public void ageCalc() {
        this.setHumanAge(this.getDogAge() * 7);
    }

    public void printAge() {
        System.out.println("Dog's Age: " + this.getDogAge());
        System.out.println("Dog's Age Converted To Human: " + this.getHumanAge());
    }
}
