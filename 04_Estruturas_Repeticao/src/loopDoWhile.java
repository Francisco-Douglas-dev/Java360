import java.util.Scanner;

public class loopDoWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Conta ate o numero: ");
        int numero = sc.nextInt();
        int contador = 0;
        do {
            System.out.println(contador);
            contador++;
        }while (contador <= numero);
    }
}
