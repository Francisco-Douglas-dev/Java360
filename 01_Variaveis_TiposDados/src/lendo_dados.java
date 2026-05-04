import java.util.Scanner;
public class lendo_dados {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler dados do console
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que digite seu nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Lê uma linha de texto

        // Solicitando ao usuário que digite sua idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // Lê um número inteiro

        // Exibindo os dados lidos
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");

        // Fechando o scanner para liberar recursos
        scanner.close();
    }
    
}
