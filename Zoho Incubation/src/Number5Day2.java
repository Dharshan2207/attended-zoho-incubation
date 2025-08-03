public class Number5Day2 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 0; i < (n); i++){
            for(int j = 0; j < (n); j++){
                int left = j;
                int right = (n - j - 1);
                int top = i;
                int bottom = (n - i - 1);

                System.out.print((Math.min(Math.min(top, bottom), Math.min(right, left))) + 1 + " ");
            }
            System.out.println();
        }
    }
}
