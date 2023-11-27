import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoNomes2 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê os nomes separados por vírgula
        System.out.print("Digite os nomes separados por vírgula: ");
        String input = scanner.nextLine();

        // Separa os nomes utilizando a vírgula como delimitador
        String[] nomes = input.split(",");

        // Remove espaços em branco dos nomes
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }

        // Ordena os nomes em ordem alfabética
        Arrays.sort(nomes);

        // Imprime os nomes ordenados
        System.out.println("\nNomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}