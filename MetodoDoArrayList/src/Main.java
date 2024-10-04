import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){
        //String[] => Fixo
        //new ArrayList<String>() => Dinâmicos

        List<String> names = new ArrayList<>();

        //Como adicionar elementos no array?

        names.add("Nome 1");
        names.add("Nome 2");
        names.add("Nome 3");
        names.add("Nome 4");

        //Como buscar um elemento específico pelo índice get()
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        //Como buscar o indice a partir de um elemento
        System.out.println(names.indexOf("Nome 2"));

        // Verifica se a lista esta vazia
        System.out.println(names.isEmpty());

        //Verifica se a lista contem algum elemento
        System.out.println(names.contains("Nome 14"));

        //Verifica o tamanho da lista
        System.out.println(names.size());

        //Limpar de vez a lista (remover todos os elementos)
        names.clear();
        System.out.println(names.isEmpty());
    }
}
