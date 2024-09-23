public class staticMethod05 {
    public static int abs(int x){
        if(x > 0){
            return -x;
        }
        else{
            return x;
        }
    }

    public static double absD(double x){
        if(x > 0.0){
            return -x;
        }
        else{
            return x;
        }
    }

    public static boolean isPrime(int x){
        if (x<2) return false;
        for(int i = 2 ; i*i <= x ; i++){
            if (x % 2 == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(abs(5));
        System.out.println(absD(5));
        System.out.println(isPrime(1));
    }
}
