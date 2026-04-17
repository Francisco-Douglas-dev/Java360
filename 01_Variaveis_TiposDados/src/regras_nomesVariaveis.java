public class regras_nomesVariaveis {
    public static void main(String[] args){
        // Exemplo de declaração válida
        int idade;
        int _altura;
        int $salario;
        int numero1;

        // Exemplo de declaração inválida (comentado para evitar erro de compilação)
        // int 1numero; // Não pode começar com número
        // int altura*; // Não pode conter caracteres especiais

        // Exemplo de boas práticas
        int quantidadeProdutos; // Nome descritivo e em camelCase
        int precoUnitario; // Nome descritivo e em camelCase

        // Exemplo de má prática (ainda que válido)
        int x; // Nome pouco descritivo
        int y; // Nome pouco descritivo
    }
}
