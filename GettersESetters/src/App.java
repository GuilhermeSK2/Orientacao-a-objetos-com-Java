public class App {
    public static void main (String[] args) {
        User userA = new User();
        userA.setFirstName("Guilherme");
        userA.setLastName("Freitas");

        User userB = new User();
        userB.setFirstName("Apple");
        userB.setLastName("Incorporation");

        System.out.println(userA.getFirstName());
        System.out.println(userA.getLastName());
        System.out.println(userB.getFirstName());
        System.out.println(userB.getLastName());
    }
}
