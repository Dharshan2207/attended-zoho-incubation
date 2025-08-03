public class Base3 {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        int n = 58;
        int base = 36;


        int temp = n;

        while(temp >= base){
            int rem = temp % base;
            if(rem > 9){
                rem -= 9;
                int toChar = rem + 65 - 1;
                char remChar = (char) toChar;
                result.append(remChar);
            }

            else result.insert(0, temp);
            temp = temp / base;
        }

        result.insert(0, temp);
        System.out.println(result);
    }
}
