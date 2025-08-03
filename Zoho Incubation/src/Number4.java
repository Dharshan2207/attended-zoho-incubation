public class Number4 {
    public static void main(String[] args) {
        int n = 3;
        int num = 1;
        int changeDiff = (2 * n - 2);
        int diffI = (2 * n - 1);

        for(int i = 0; i < n; i++){
            num = i + 1;
            int diff = diffI;

            for(int j = 0; j < n; j++){
                System.out.print(num + " ");
                num += diff;
                if(j % 2 == 0) diff -= changeDiff;
                else diff += changeDiff;
            }
            System.out.println();
            changeDiff -= 4;
            diffI -= 2;
        }
    }
}
