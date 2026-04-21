public class if_ternario {
    public static void main(String[] args) {
        int numero = 10;

        // Usando o operador ternário para verificar se o número é par ou ímpar
        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.println("O número " + numero + " é " + resultado + ".");
    }
}
