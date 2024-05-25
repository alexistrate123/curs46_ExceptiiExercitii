package Practica;

public class Exercitiul2 {
    public static void main(String[] args) {
        String text = "Java";

        try  {
            System.out.println(text.charAt(4));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Evita eroarea.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Mai lasa-ma.");
        } finally {
            System.out.println("I am still running");
        }

    }
}
