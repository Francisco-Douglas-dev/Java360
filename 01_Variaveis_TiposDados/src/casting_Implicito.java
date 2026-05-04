public class casting_Implicito {
    public static void main(String[] args) {
        // Exemplo de casting implícito (conversão automática)
        int numeroInt = 100; // Tipo int
        double numeroDouble = numeroInt; // O int é convertido automaticamente para double

        System.out.println("Valor do int: " + numeroInt);
        System.out.println("Valor do double (após casting implícito): " + numeroDouble);

        // O casting implícito ocorre quando o tipo de destino é maior ou mais preciso que o tipo de origem
    }
}
