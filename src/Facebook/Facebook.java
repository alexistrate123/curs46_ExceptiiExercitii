package Facebook;

import Exercitiul4.CustomException.MisMatchPasswordException;

public class Facebook {
    public void createAccount(String firstName, String lastname, String email, String password, String confirmPassword) throws Exception {
        if (password.equals(confirmPassword)) {
            System.out.println("Felicitari, contul a fost creat cu succes.");
        } else {
            throw new MisMatchPasswordException();
        }
    }
}
