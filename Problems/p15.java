/*
 Given an array of integers arr[]. You have to find the Inversion Count of the array. 
Note : Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].
 */

public class p15 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6 };
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j] ){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
