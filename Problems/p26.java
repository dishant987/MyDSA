// Triplet Sum in Array

public class p26 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 3, 6, 7 };
        int target = 10;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    System.out.println(arr[i] + ", " + arr[left] + ", " + arr[right]);
                    found = true;
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }

        }

        System.out.println(found);
    }
}
