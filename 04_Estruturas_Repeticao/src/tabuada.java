import java.util.Scanner;

public class tabuada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver a tabuada: ");
        int n = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d * %d = %d%n", i, n, i * n);
        }

        scanner.close();
    }
}
