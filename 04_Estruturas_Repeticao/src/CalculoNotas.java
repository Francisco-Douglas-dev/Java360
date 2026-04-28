import java.util.Scanner;

public class CalculoNotas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalNotas = 0;
        double somaNotas = 0;

        while(true){
            System.out.println("Digite a nota: ");
            double nota = sc.nextDouble();
            somaNotas += nota;
            totalNotas++;

            System.out.println("Deseja continuar? (digite 's' para sair ou " +
                    "qualquer outra tecla para continuar)");
            String continua = sc.next();

            if(continua.equalsIgnoreCase("s")){
                break;
            }
        }

        double media = somaNotas / totalNotas;
        System.out.printf("A média das %d notas é %.2f%n", totalNotas, media);

        sc.close();
    }
}
