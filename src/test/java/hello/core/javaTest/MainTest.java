package hello.core.javaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MainTest {

    public static void main(String[] args) {
        /*ChulSu chulSu = new ChulSu();
        chulSu.talk();
        chulSu.attack();
        System.out.println(chulSu.Blood("A"));
        Human.Bread();*/

        String[] dataset = {
                "Braund, Mr. Owen Harris",
                "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
                "Heikkinen, Miss. Laina",
                "최하준",
                "홍길동",
                "고길동",
                "이하늬",
                "김하니",
                "홍두께"
        };

        Integer count = 0;

        /*for (int i = 0; i < dataset.length; i++) {
            if(dataset[i].indexOf("M") >= 0) {
                count++;
            };
        }*/
        for (String s : dataset) {
            if(s.indexOf("M") > 0) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}

class Item {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1); // 1을 추가!
        queue.offer(2); // 2를 추가, 성공적으로 add를 하면 true로 리턴한다.

        queue.poll(); //poll은 dequeue에 해당하며, 꺼내는 기능을 한다. 첫번째 값인 1을 꺼낸다.

        System.out.println("queue = " +  queue);
    }
}

class AlgoQueueTest<T> {

    private ArrayList<T> queue = new ArrayList<>();

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if(queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

    public static void main(String[] args) {
        AlgoQueueTest algoQueueTest = new AlgoQueueTest();

        algoQueueTest.enqueue(1);
        algoQueueTest.enqueue(2);
        algoQueueTest.enqueue(3);
        algoQueueTest.dequeue();

        System.out.println("첫번째 큐 = " + algoQueueTest.dequeue());
        System.out.println("두번째 큐 = " + algoQueueTest.dequeue());
        System.out.println("세번째 큐 = " + algoQueueTest.dequeue());
    }
}