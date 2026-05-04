public class casting_explicito {
    public static void main(String[] args) {
        // Exemplo de casting explícito (conversão manual)
        double numeroDouble = 3.14; // Tipo double
        int numeroInt = (int) numeroDouble; // O double é convertido manualmente para int

        System.out.println("Valor do double: " + numeroDouble);
        System.out.println("Valor do int (após casting explícito): " + numeroInt);

        // O casting explícito é necessário quando o tipo de destino é menor ou menos preciso que o tipo de origem
    }
}
