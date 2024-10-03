public class App {
    public static void main (String[] args) {

        User[] users = new User[] {
                new User("Guilherme", "Freitas"),
                new User("Nicolas", "Souza"),
        };


        System.out.println(users[0].getFirstName());
        System.out.println(users[1].getLastName());
    }
}
