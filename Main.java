import java.util.Arrays; // Importando a classe Arrays para utilizar o método asList
import java.util.List; // Importando a classe List para trabalhar com listas
import java.util.stream.Collectors; // Importa a classe Collectors para coletar os resultados de um fluxo

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de números utilizando o método estático asList
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        
        // Filtrando os números pares utilizando a API de streams
        List<Integer> numPares = numeros.stream()
                                       .filter(n -> n % 2 == 0) // Filtrando os números que são divisíveis por 2 (ou seja, números pares)
                                       .collect(Collectors.toList()); // Coletando os resultados da stream em uma nova lista utilizando Collectors.toList()
        
        // Imprimindo a nova lista com os números pares
        System.out.println(numPares);
    }
}

