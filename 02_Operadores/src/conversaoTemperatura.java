public class conversaoTemperatura {
    // Conversão de Temperatura em Java
    public static void main(String[] args) {
        double celsius = 25.0;

        // Converter Celsius para Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        String resultado = String.format("%.2f graus Celsius é igual a %.2f graus Fahrenheit.", celsius, fahrenheit);
        System.out.println(resultado);

    }
    
}
