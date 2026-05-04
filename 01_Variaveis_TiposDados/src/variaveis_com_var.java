public class variaveis_com_var {
    public static void main(String[] args) {
        // Exemplo de uso da palavra-chave 'var' para declaração de variáveis
        var idade = 30; // O tipo é inferido como int
        var salario = 4500.75; // O tipo é inferido como double
        var nome = "João"; // O tipo é inferido como String
        var ativo = true; // O tipo é inferido como boolean

        // Exibindo os valores das variáveis
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Nome: " + nome);
        System.out.println("Ativo: " + ativo);

        // A palavra-chave 'var' só pode ser usada para variáveis locais dentro de métodos
        // Não pode ser usada para variáveis de classe ou variáveis globais
    }
}
