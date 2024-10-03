public class User {
    private String firstName;
    private String lastName;


    // Setter
    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase(); // Torna todos os caracteres de "firstName" maiúsculos
    }

    // Getter
    public String getFirstName() {
        return firstName;
    }

    // Setter
    public void setLastName(String lastName) {
        this.lastName = lastName.toLowerCase(); // Torna todos os caracteres de "lastName" maiúsculos
    }

    // Getter
    public String getLastName() {
        return lastName;
    }
}
