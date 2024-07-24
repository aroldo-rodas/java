import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        //Adicionar
        lista.add("Maycon");
        lista.add("Bagio");
        lista.add("Porticola");
        lista.add("Taduro");

        //Adicionar em posição específica
        lista.add(2, "Marco");

        //Tamanho da lista
        System.out.println(lista.size());

        for(String x : lista) {
            System.out.println(x);
        }

        System.out.println("----------------------------");

        //Reomeve dado a partir de uma comparação
        lista.remove("Maycon");

        //Remove por meio de um predicado (função lâmbda)
        lista.removeIf(x -> x.charAt(0) == 'B');

        for(String x : lista) {
            System.out.println(x);
        }

        //Index (se não encontrar o elemento retorna -1)
        System.out.println("Index Porticola: " +  lista.indexOf("Porticola"));

        System.out.println("----------------------------");

        //Criar uma lista filtrando
        //A lista string é convertido para stream
        //O filter permite usar expressão lâmbda
        //collect transforma stream em lista de novo
        List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'T').collect(Collectors.toList());

        for(String x : resultado) {
            System.out.println(x);
        }

        System.out.println("----------------------------");

        //Encontrar primeiro nome
        //Transforma em stream
        //Usa o filter
        //findFirst pega o primeiro elemento da string que atende ao predicado do filter
        String primeiroNome = lista.stream().filter(x-> x.charAt(0) == 'P').findFirst().orElse(null);
        System.out.println(primeiroNome);
    }
}
