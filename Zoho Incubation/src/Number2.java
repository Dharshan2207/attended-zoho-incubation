public class Number2 {
    public static void main(String[] args) {
        int n = 4;

        int num = 1;
        int temp;
        for(int i = 0; i < n; i++){
            temp = num;
            if(i % 2 == 0){
                num++;
            }
            else{
                num += (2 * n - 1);
            }


            for(int j = 0; j < n; j++){
                System.out.print(temp + " ");
                temp += 2;
            }
            System.out.println();
        }
    }
}
