import java.util.Arrays;

public class Main {
    public static void main (String[] args){
        //Comparando Arrays
        int[] numbersA = new int[] {1, 2, 3}; //Esta em um espaço memória
        int[] numbersB = new int[] {1, 2, 3}; //Esta em outro espaço de memória

        System.out.println(Arrays.equals(numbersA, numbersB)); //Apesar de terem os mesmo dados, estão em espaços de memória diferentes.
        //A comparação feita acima compara o conteúdo dos arrays e não as suas referências.
    }
}
