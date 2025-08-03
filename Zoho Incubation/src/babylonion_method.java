import java.util.Scanner;

public class babylonion_method {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ip = 2;
        float guess;

        System.out.print("Enter guess : ");
        guess = sc.nextFloat();

        float temp =  guess;

        while(true){
            temp = (guess + (ip / guess)) / 2;

            if(guess == temp) break;
            guess = temp;
        }

        System.out.println(guess);
        System.out.println(1.4142135 * 1.4142135);
    }
}
