public class Number1 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i % 2 == 0){
                    System.out.print(num + " ");
                    if(j == n-1){
                        num += n;
                    }
                    else{
                        num++;
                    }
                }
                else{
                    System.out.print(num + " ");
                    if(j == n-1){
                        num += n;
                    }
                    else{
                        num--;
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        int var = 1;
        int num2 = 1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(num2 + " ");
                num2 += var;
            }
            System.out.println();
            if(var > 0){
                num2 += n-1;
            }
            else{
                num2 += n+1;
            }
            var = var * -1;
        }
    }
}
