public class App {
    public static void main(String[] args){
        User userA = new User();
        userA.firstName = "Guilherme";
        userA.lastName = "Freitas";
        String fullName = userA.getFullName();

        System.out.println(fullName);
    }
}
