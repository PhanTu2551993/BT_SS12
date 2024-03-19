package bt1;

import java.util.LinkedList;
import java.util.Queue;

public class Bt_01 {
        public static void main(String[] args) {
            Queue<Integer> queue = new LinkedList<>();

            int[] inputList = {1, 2, 3, 4, 5};
            for (int num : inputList) {
                queue.add(num);
            }
            System.out.println("Các phần tử của Queue:");
            while (!queue.isEmpty()) {
                System.out.println(queue.poll());
            }
        }
    }

