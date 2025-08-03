public class ReverseBasedOnN {

    public static void reverse(int[] arr, int len ,int left ,int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {7, 9, 13, 5, 3, 15};

        int len = arr.length;
        int n = 4;
        int left = 0;
        int right = n-1;

        int i = 0;
        while(i < len){
            if(i + n <= len - 1){
                left = i;
                right = i + (n - 1);

                while(left <= right){
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
                i += n;
            }
            else{
                left = i;
                right = n-1;

                while(left <= right){
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }
        }
        for(int j = 0; j < len; j++){
            System.out.print(arr[j] + " ");
        }
    }
}
