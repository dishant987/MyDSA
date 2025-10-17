//  search in bitonic array
public class p28 {
   public static void main(String[] args) {
      int[] arr = { 3, 8, 12, 14, 15, 10, 6, 2 };
      int num = searchBitonicArray(arr, 6);
      System.out.println(num);
   }

   public static int searchBitonicArray(int[] arr, int num) {
      int peckElement = findPeck(arr);
      System.out.println(peckElement);

      int left = BinaryAse(arr, 0, peckElement, num);
      if (left != -1) {
         return left;
      }

      return BinaryDec(arr, peckElement + 1, arr.length - 1, num);
   }

   public static int BinaryAse(int[] arr, int left, int right, int tar) {
      while (left < right) {
         int mid = left + (right - left) / 2;
         if (arr[mid] == tar) {
            return mid;
         } else if (arr[mid] > tar) {
            left = mid + 1;
         } else {
            right = mid - 1;
         }

      }

      return -1;
   }

   public static int BinaryDec(int[] arr, int left, int right, int tar) {
      while (left < right) {
         int mid = left + (right - left) / 2;
         if (arr[mid] == tar) {
            return mid;
         } else if (arr[mid] > tar) {
            left = mid - 1;
         } else {
            right = mid + 1;
         }

      }

      return -1;
   }

   public static int findPeck(int[] arr) {
      int start = 0;
      int end = arr.length - 1;

      while (start < end) {
         int mid = start + (end - start) / 2;
         if (arr[mid] > arr[mid + 1]) {
            end = mid;
         } else {
            start = mid + 1;
         }
      }

      return start;
   }

}