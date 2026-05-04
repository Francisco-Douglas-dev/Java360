public class textBlocs {
    public static void main(String[] args) {
        // Exemplo de uso de text blocks em Java (disponível a partir do Java 15)
        String textoMultilinha = """
                Este é um exemplo de text block em Java.
                Ele permite criar strings multilinha de forma mais legível e fácil de manter.
                Você pode incluir quebras de linha, tabulações e outros caracteres especiais sem precisar de escape.
                """;

        // Exibindo o text block
        System.out.println(textoMultilinha);
    }
}
