package Practica;

public class Exercitiul1 {
    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 0;

        System.out.println("Man are the great.");
        try {
            System.out.println("Rezultatul impartirii este: " + number1 / number2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("I am still running.");

        System.out.println("Who are you?");
    }
}
