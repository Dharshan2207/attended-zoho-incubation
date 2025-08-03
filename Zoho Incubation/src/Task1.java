public class Task1 {
    public static void main(String[] args) {
        int n = 7;

        int diffRow  = 0;
        int diffCol;
        int num = 1;

        for(int i = 0; i < n; i++){
            num += diffRow;
            int temp = num;
            diffCol = diffRow + 2;


            for(int j = 0; j < n; j++){
                if(i + j < (n - 1)){
                    System.out.print(temp + "  ");
                    temp += diffCol;
                    diffCol++;
                }
                else{
                    System.out.print(temp + "  ");
                    diffCol--;
                    temp += diffCol;
                }
            }
            System.out.println();
            diffRow++;
        }
    }
}
