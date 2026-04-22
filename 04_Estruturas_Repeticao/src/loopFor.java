public class loopFor {
    public static void main(String[] args){
        for(int i = 0; i <= 100; i ++){
            if(i % 2 == 0){
                if(i >= 10 && i <= 20){
                    continue;
                }else{
                    System.out.println("Numero Par: "+i);
                }
            }
        }
    }
}
