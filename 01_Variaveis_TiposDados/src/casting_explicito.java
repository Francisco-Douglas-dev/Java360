public class casting_explicito {
    public static void main(String[] args){
        //Casting Explicito em Java
        
        //Casting Explicito e o ato de força a conversão do dados
        double d = 240.34;
        //int i = d; //Dara um erro caso faça assim
        int i = (int) d;
        System.out.println(i);

        /* Quando fazemos um Casting de 
        double para int temos perda de dados
        dados esses que podem serem essenciais */
    }
}
