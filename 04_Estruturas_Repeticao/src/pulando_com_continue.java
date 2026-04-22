    public class pulando_com_continue {
        public static void main(String[] args){
            int num = 1;
            do{
                if(num % 2 == 0){
                    System.out.println(num);
                }else{
                    continue;
                }
                num ++;
            }while(num <= 100);
        }
    }
