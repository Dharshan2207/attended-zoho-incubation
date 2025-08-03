public class Babylonion_without_formula {
    public static void main(String[] args) {
        float ip = 25;

        float left = 0;
        float right = ip;

        while(left <= right){
            float mid = (left + right) / 2;
            System.out.println(mid);
            if((mid * mid) - ip < 0.1 || ip - (mid * mid) > -0.1){
                System.out.println(mid);
                break;
            }
            else if(mid * mid > ip){
                right = mid;
            }
            else{
                left = mid;
            }
        }
    }
}
