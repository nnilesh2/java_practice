package threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumer {
    public static void main(String[] args) {
        int MAX_SIZE = 10;
        Queue<Integer> queue = new LinkedList<>();

        ExecutorService producer = Executors.newSingleThreadExecutor();
        producer.submit(() -> {
            while (true) {
                synchronized (queue) {
                    try {
                        while (queue.size() == MAX_SIZE) {
                            queue.wait();
                        }
                        queue.add(1);
                        Thread.sleep(1000);
                        System.out.println("Added Element to queue...");
                        queue.notifyAll();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });

        ExecutorService consumer = Executors.newSingleThreadExecutor();
        consumer.submit(() -> {
            while (true) {
                synchronized (queue) {
                    try {
                        while (queue.isEmpty()) {
                            queue.wait();
                        }
                        queue.poll();
                        Thread.sleep(1000);
                        System.out.println("Removed Element from queue...");
                        queue.notifyAll();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }

        });
    }

}
