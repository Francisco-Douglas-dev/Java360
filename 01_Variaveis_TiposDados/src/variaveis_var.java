public class variaveis_var {
    public static void main(String[] args){
        // Declaração de variáveis usando var (Java 10+)
        var idade = 30; // O tipo é inferido como int
        var nome = "João"; // O tipo é inferido como String
        var salario = 4500.50; // O tipo é inferido como double

        // Exibindo os valores das variáveis
        System.out.println("Idade: " + idade);
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }
    
}
