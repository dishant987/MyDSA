import java.util.Arrays;

public class p8 {


    public static void main(String[] args) {
        int a[] = { 5, 67, 2, 88, 9, 76, 52, 4 };
       int minVal = a[0];
       int maxVal = a[0];
       for (int i = 0; i < a.length; i++) {
        if(minVal < a[i] ){
            minVal = a[i];
        }
        if(maxVal > a[i] ){
            maxVal = a[i];
        }
       }

       System.out.println("Min Value : "+minVal);
       System.out.println("Max Value : "+maxVal);
    }
}
