public class Main {
    public static void main(String[] args){
        User guilherme = new User("Guilherme", "Freitas");
        User nicolas = new User("Nicolas", "Souza");

        nicolas.setCount(1);
        nicolas.setCount(1);
        nicolas.setCount(1);

        guilherme.setCount(2);
        guilherme.setCount(2);
        guilherme.setCount(2);

        System.out.println(nicolas.getCount());
        System.out.println(guilherme.getCount());

    }
}
