
import java.util.PriorityQueue;

public class array {

    public static void main(String[] args) {
        int[] a = { 234, 5, 23,3, 56, 6, 457, 356, 7 };
        int k = 2;
        System.out.println(new array().findKthLargest(a, k));
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }
}