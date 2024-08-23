package Practice.Test9;

import java.util.Collections;
import java.util.PriorityQueue;

public class t13 {

    //kth smallest
    public static void main(String[] args) {
        int a[] = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int smallest = findKthSmallest(a, a.length, k);
        System.out.println(smallest);
    }

    private static int findKthSmallest(int[] a, int n, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : a) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return maxHeap.peek();

    }
}
