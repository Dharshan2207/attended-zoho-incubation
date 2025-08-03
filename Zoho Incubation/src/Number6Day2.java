public class Number6Day2 {
    public static void main(String[] args) {
        int n = 9;

        for(int i = 0; i < (n); i++){
            for(int j = 0; j < (n); j++){
                int left = j;
                int right = (n - j - 1);
                int top = i;
                int bottom = (n - i - 1);

                System.out.print(n - (Math.min(Math.min(top, bottom), Math.min(right, left)))  + " ");
            }
            System.out.println();
        }
    }
}
