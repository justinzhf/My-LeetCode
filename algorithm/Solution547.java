import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution547 {
    public int findCircleNum(int[][] M) {
        int[] labels = new int[M.length];
        for (int i = 0; i < labels.length; i++) {
            labels[i] = 0;
        }
        Queue queue = new LinkedList<>();
        int count = 0;
        while (sum(labels) < labels.length) {
            int i = 0;
            for (; i < labels.length; i++) {
                if (labels[i] == 0) {
                    break;
                }
            }
            if(i<labels.length){
                labels[i] = 1;
            }

            queue.offer(i);
            while (queue.isEmpty() == false) {
                i = (Integer) queue.poll();
                for (int j = 0; j < M.length; j++) {
                    if (M[i][j] == 1 && j != i && labels[j] == 0) {
                        queue.offer(j);
                        labels[j] = 1;
                    }
                }

            }
            count++;
        }
        return count;

    }

    private int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] nums ={{1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}};
        System.out.println(new Solution547().findCircleNum(nums));
    }
}
