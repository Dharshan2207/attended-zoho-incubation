import static java.util.Collections.min;
import static java.util.Collections.swap;

public class MaxMInAlternate {
    public static void main(String[] args) {
            int[] arr = {10, 3, 15, 5, 4, 13};
            int n = arr.length;


        int maxi, mini, maxiIndex = 0, miniIndex = 0;
        int index = 0;

        for(int i = 0; i < n; i++){
            maxi = arr[index];
            mini = arr[index];

            for(int j = index; j < n; j++){
                if(arr[j] > maxi){
                    maxi = arr[j];
                    maxiIndex = j;
                }
                else if(arr[j] < mini){
                    mini = arr[j];
                    miniIndex = j;
                }
            }
            int temp = arr[maxiIndex];
            arr[maxiIndex] = arr[index];
            arr[index] = temp;

            if(index < n-1) index++;

            temp = arr[miniIndex];
            arr[miniIndex] = arr[index];
            arr[index] = temp;

            if(index < n-1) index++;
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }

    private static void swap(int i, int i1) {
        int temp = i1;
        i1 = i;
        i = temp;
    }
}
