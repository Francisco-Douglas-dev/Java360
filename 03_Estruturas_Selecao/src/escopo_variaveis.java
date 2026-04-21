public class escopo_variaveis {
    public static void main(String[] args) {
        int numero = 10; // Variável declarada no escopo do método main

        if (numero > 5) {
            String mensagem = "O número é maior que 5"; // Variável declarada no escopo do bloco if
            System.out.println(mensagem);
        }

        // A variável 'mensagem' não está acessível aqui, pois foi declarada dentro do bloco if
        // System.out.println(mensagem); // Isso causaria um erro de compilação
    }
}
