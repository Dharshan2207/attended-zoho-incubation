public class Number3 {
    public static void main(String[] args) {
        int n = 3;
        int num = 1;

        for(int i = 0; i < n; i++){
            num = i + 1;
            for(int j = 0; j < n; j++){
                System.out.print(num + " ");
                num += n;
            }
            System.out.println();
        }
    }
}
