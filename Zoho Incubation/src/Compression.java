import java.util.HashMap;

public class Compression {
    public static void main(String[] args) {
        String ip = "ABACDABR";
        int n = ip.length();

        int[] hash = {0};

        for(int i = 0; i < n; i++){
            hash[ip.charAt(i)]++;
        }

        String result = "";

        for(int i = 0; i < 26; i++){
            char character = (char) hash[i];

            if(hash[i] == 1){
                result += character;
            }
            else{
                result += hash[i];
                result += character;
            }
        }


    }
}
