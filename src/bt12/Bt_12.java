package bt12;

import java.util.ArrayDeque;
import java.util.Queue;

public class Bt_12 {
    public static void main(String[] args) {
        int[] arr = {10,2,1,10,44,4};
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]);
        }
        System.out.println("Cac phân tử trong queue : " +queue);

        int min = queue.poll();
        while (!queue.isEmpty()){
            int element = queue.poll();
            if (min > element){
                queue.add(element);
                min = element;
            }else {
                queue.add(min);
                break;
            }
        }
        System.out.println("Phần tử nhỏ nhất là : "+min);
    }
}
