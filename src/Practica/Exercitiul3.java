package Practica;

public class Exercitiul3 {


    public static void main(String[] args) {
        String text = "Java";

        try  {
            System.out.println(text.charAt(4));
        } finally {
            System.out.println("I am still running");
        }

    }
}
