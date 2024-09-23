public class tasks {
    public static void main(String[] args) {
        //Compute Average
        // int[] a = {1,2,3,4,5};
        // int N = a.length;
        // double sum = 0.0;
        // for (int i = 0 ; i < N ; i++){
        //     sum += a[i];
        // }
        // double Average = sum/N;
        // System.out.println(Average);

        //Copy to another array
        // double[] a = {1,2,3,4,5};
        // double[] b = new double[a.length];
        // for (int i = 0; i < a.length; i++) {
        //     b[i] = a[i];
        // }
        // System.out.println(a);
        // System.out.println(b);

        // Reverse the elements in a array
        double[] a = {1,2,3,4,5};
        int N = a.length;
         for (int i = 0 ; i < N/2 ; i++){
             double temp = a[i];
             a[i] = a[N-1-i];
             a[N-1-i] = temp;
         }
        for(int i = 0 ; i < N ; i++){
            System.out.println(a[i]);
        }

    }
}
