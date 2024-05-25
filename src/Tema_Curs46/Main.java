package Tema_Curs46;

import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Ex 1;
        int a = 42, b = 0;
        try {
            System.out.println("Rezultatul calculului este: " + a / b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("I shall be back");
        System.out.println();
        // Ex 2;
        String s = null;
        try {
            System.out.println(s.toLowerCase());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("I am eating");
        System.out.println();

        // Ex 3;

        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Continua sa alergi.");
        System.out.println();

        // Ex 4;

        try {
            ArrayList<String> list = new ArrayList<String>();
            String st = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("I am going to eat something.");

    }
}
