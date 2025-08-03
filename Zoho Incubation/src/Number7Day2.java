public class Number7Day2 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 0; i < n; i++){
            int num = i + 1;
            int diff = (n - 1);

            if(i <= n / 2){
                for(int j = 0; j <= i; j++){
                    System.out.print(num + " ");
                    num += diff;
                    diff -= 2;
                }
            }
            else{
                for(int j = 0; j < (n - i); j++){
                    System.out.print(num + " ");
                    num += diff;
                    diff -= 2;
                }
            }
            System.out.println();
        }
    }
}
