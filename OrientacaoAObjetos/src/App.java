public class App {
    public static void main(String[] args){
        int x = 0;
        User userA = new User();
        userA.firstName = "Guilherme";
        userA.lastName = "Freitas";

        User userB = new User();
        userB.firstName = "Nicolas";
        userB.lastName = "Souza";

        System.out.println(userA.firstName);
        System.out.println(userB.firstName);
    }
}
