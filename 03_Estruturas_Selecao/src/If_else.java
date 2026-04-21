public class If_else {
    public static void main(String[] args){
        //Estrutura If e Else
        int idade = 34;

        if(idade < 12){
            System.out.printf("Voce tem %d ainda e uma criança", idade);
        }else if (idade > 12 && idade < 18){
            System.out.printf("Voce ja e um Jovem rapaz tem %d anos", idade);
        }else{
            System.out.printf("Voce e maior de idade tem %d anos", idade);
        }
    }
}
