package Exercitiul4.CustomException;

public class MisMatchPasswordException extends RuntimeException {
    public String getMassage() {
        return "Parolele nu corespund! ";
    }
}
