import java.util.Objects;

public class User {
    private String firstName;
    private String lastName;

    private static int count = 0; //Dessa forma a variável é utilizada por todos os objetos instanciados(é uma variável da classe), ou seja o mesmo valor será para todos.

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setCount(int count){
        this.count = this.count + count;
    }

    public int getCount(){
        return count;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
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
        } else {
            return firstName;
        }
    }
    public String toString(){
        return "User {" +
                "firstName=" + firstName + "," +
                "lastName=" + lastName + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}