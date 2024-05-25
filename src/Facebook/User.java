package Facebook;

public class User {
  private String firstName;
  private String lastName;
  private String email;
  private String pasword;

    public User(String firstName, String lastName, String email, String pasword) throws Exception {
        setFirstName("Manuela");
        setLastName("Betonela");
        setEmail("ManuelaBetonela@yahoo.com");
        this.pasword = pasword;


    }

    public void setFirstName(String firstName) throws Exception {
        if (firstName.length() > 2) {
            this.firstName = firstName;
        } else {
            throw new Exception("Numele trebuie sa contina mai mult de 2 caractere.");
        }
    }

    public void setLastName (String lastName) throws Exception {
        if (lastName.length() > 2) {
            this.lastName = lastName;
        } else {
            throw new Exception("Prenumele trebuie sa contina mai mult de 2 caractere.");
        }
    }

    public void setEmail (String email) throws Exception {
        if (email.contains("@")) {
            this.email = email;
        } else {
            throw new Exception("Daca nu contine @ , reincercati.");
        }

    }

}
