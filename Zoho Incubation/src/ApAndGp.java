import java.util.Scanner;

public class ApAndGp {

    public static void apGpCalc(int a, int d, int n, char type){

        if(type == 'a'){
            int result = 5;
            for(int i = 0; i < n; i++){
                System.out.print(result + " ");
                result = result + d;
            }
        }
        else{
            int result = 5;
            for(int i = 0; i < n; i++){
                System.out.print(result + " ");
                result = result * d;
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 5;
        int d = 3;
        int n = 4;
        char type = 'g';

        System.out.println("Arithmetic progression : ");
        apGpCalc(a, d, n, type);


    }
}
