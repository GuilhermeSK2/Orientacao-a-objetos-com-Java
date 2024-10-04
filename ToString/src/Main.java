public class Main {

    public static void main (String[] args){

        User userA = new User("Guilherme", "Freitas");
        User userB = new User("Nicolas", "Souza");

        //toString poderia ser substituida por output ou vice-versa
        System.out.println(userA.toString());
        System.out.println(userB.toString());
    }
}
