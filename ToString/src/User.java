public class User {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName() {
        this.firstName = firstName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
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
    public String toString(){
        return "User {" +
                "firstName=" +firstName + "," +
                "lastName=" + lastName + "}";
    }
}