import java.util.Arrays;

public class siamese_method {
    public static void main(String[] args) {
        int n = 5;
        int[][] res = new int[n][n];


        int mI = 0, mJ = n/2;
        int num = 1;
        res[mI][mJ] = num++;

        while(num <= (n * n)){
            int oldMI = mI;
            int oldMJ = mJ;
            mI = ((mI - 1) + n) % n;
            mJ = ((mJ + 1) + n) % n;

            if(res[mI][mJ] == 0){
                res[mI][mJ] = num++;
            }
            else{
                mI = ((oldMI + 1) + n) % n;
                res[mI][oldMJ] = num++;
                mI = ((oldMI + 1) + n) % n;
                mJ = oldMJ;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
