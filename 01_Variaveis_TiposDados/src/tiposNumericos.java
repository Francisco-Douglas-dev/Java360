public class tiposNumericos {
    public static void main(String[] args){
        // Tipos numéricos inteiros
        byte idade = 30; // 8 bits, de -128 a 127
        short ano = 2024; // 16 bits, de -32.768 a 32.767
        int populacao = 78000000; // 32 bits, de -2.147.483.648 a 2.147.483.647
        long distancia = 15000000000L; // 64 bits, de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

        // Tipos numéricos de ponto flutuante
        float preco = 19.99f; // 32 bits, precisão de aproximadamente 7 dígitos decimais
        double pi = 3.141592653589793; // 64 bits, precisão de aproximadamente 15 dígitos decimais

        // Exibindo os valores
        System.out.println("Idade: " + idade);
        System.out.println("Ano: " + ano);
        System.out.println("População: " + populacao);
        System.out.println("Distância: " + distancia);
        System.out.println("Preço: " + preco);
        System.out.println("Pi: " + pi);
    }
    
}
