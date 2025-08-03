public class Number8Day2 {
    public static void main(String[] args) {
        int n = 9;
        int num = 1;
        int diffI = 0;
        int diffJ = 2;
        for(int i = 0; i < n; i++){
            num += diffI;

            int temp = num;
            boolean changed = false;

            if(i <= n / 2){
                for(int j = 0; j <= i; j++){
                    System.out.print(temp + " ");
                    temp += diffJ;
                    if(i % 2 == 1 && j % 2 == 0) diffJ++;
                }
            }
            else{
                for(int j = 0; j < (n - i); j++){
                    System.out.print(temp + " ");
                    temp += diffJ;
                }
            }
            System.out.println();
            if(i % 2 == 0){
                diffI++;
            }
            if(i >= (n / 2)){
                diffJ--;
            }

        }
    }
}
