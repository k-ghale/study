public class maximum {
    public static void main(String[] args) {
        double[] a = {1,2,5,4,3};
        double max = a[0];
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
