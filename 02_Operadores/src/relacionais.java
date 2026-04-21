public class relacionais {
    //Operadores Relacionais em Java
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Operadores relacionais
        boolean igual = (a == b); // Igual a
        boolean diferente = (a != b); // Diferente de
        boolean maior = (a > b); // Maior que
        boolean menor = (a < b); // Menor que
        boolean maiorOuIgual = (a >= b); // Maior ou igual a
        boolean menorOuIgual = (a <= b); // Menor ou igual a

        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Maior ou Igual: " + maiorOuIgual);
        System.out.println("Menor ou Igual: " + menorOuIgual);
    }
    
}
