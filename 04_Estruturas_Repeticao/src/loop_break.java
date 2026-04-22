public class loop_break {
    public static void main(String[] args){
        int n = 0;
        while(n <= 200){
            if(n == 50){
                break;
            }else{
                System.out.println("Numero Atual: "+n);
            }
            n ++;
        }
    }
}
