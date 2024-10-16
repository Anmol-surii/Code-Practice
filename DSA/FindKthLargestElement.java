import java.util.PriorityQueue;

public class FindKthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int num : nums) {
            pq.add(num);
        }
        
        while(k > 1) {
            pq.poll();
            k--;
        }

        return pq.peek();
    }
}