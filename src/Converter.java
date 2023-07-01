import java.util.InputMismatchException;
import java.util.Scanner;

public class Converter {
    private int dogAge;
    private int humanAge;

    public void ageConverter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Type your dog age");
                int age = scanner.nextInt();
                if (age < 0) {
                    throw new IllegalArgumentException("Negative number's not allowed");
                }
                this.setDogAge(age);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input make sure you enter a valid input");
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
        System.out.println("Dogs Age: " + this.getDogAge());
        System.out.println("Dogs Age Converted To Human: " + this.getHumanAge());
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    public int getHumanAge() {
        return humanAge;
    }

    public void setHumanAge(int humanAge) {
        this.humanAge = humanAge;
    }
}
