public class somaPar {
    public static void main(String[] args){
        int sum = 0;
        int cont = 0;
        for(int i = 0; i <= 100; i ++){
            if(i % 2 == 0) {
                sum += i;
                cont += 1;
            }else{
                continue;
            }
        }
        System.out.println("A Soma dos Nuemros pares e: "+sum);
        System.out.printf(String.format("Entre 0 e 100 temos %d numeros", cont));
    }
}
