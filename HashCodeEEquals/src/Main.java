public class Main {
    public static void main(String[] args) {
        User userA = new User("Guilherme", "Freitas");
        User userB = new User("Guilherme", "Freitas");

        System.out.println(userA);
        System.out.println(userA.hashCode());
        System.out.println(userB);
        System.out.println(userB.hashCode());
        System.out.println(userA.equals(userB)); //Equals utiliza o fundamento hashcode
    }
}
