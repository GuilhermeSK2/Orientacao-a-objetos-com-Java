public class User {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName(String firstName) {
        return firstName;
    }

    public String getLastName(String lastName) {
        return lastName;
    }

    public String output() {
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    //Sobrecarga de metodo
    public String output(boolean showLastName) {
        if (showLastName){
            return output();
        }
        return firstName;
    }
}