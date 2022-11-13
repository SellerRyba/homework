package module12.task2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class FizzBuzzProgramm {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        MyProducer numberProducer = new MyProducer() {
            int n;
            boolean update = false;

            @Override
            public void setN(int n) {
                this.n = n;
                update = true;
            }

            @Override
            public boolean isUpdate() {
                return update;
            }

            @Override
            public void run() {
                while (true) {
                    try {
                        if (update) {
                            update = false;
                            if (n % 3 != 0 && n % 5 != 0) {
                                queue.put(String.valueOf(n));
                            }
                        }
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        MyProducer fizzProducer = new MyProducer() {
            int n;
            boolean update = false;

            @Override
            public void setN(int n) {
                this.n = n;
                update = true;
            }

            @Override
            public boolean isUpdate() {
                return update;
            }

            @Override
            public void run() {
                while (true) {
                    try {
                        if (update) {
                            update = false;
                            if (n % 3 == 0 && n % 5 != 0) {
                                queue.put("fizz");
                            } else if (n % 3 == 0 && n % 5 == 0) {
                                queue.put("fizzbuzz");
                            }
                        }
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        };
        MyProducer buzzProducer = new MyProducer() {
            int n;
            boolean update = false;

            @Override
            public void setN(int n) {
                this.n = n;
                update = true;
            }

            @Override
            public boolean isUpdate() {
                return update;
            }

            @Override
            public void run() {
                while (true) {
                    try {
                        if (update) {
                            update = false;
                            if (n % 5 == 0 && n % 3 != 0) {
                                queue.put("buzz");
                            }
                        }
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        };

        Runnable consumer = () -> {
            while (true) {
                while (!queue.isEmpty()) {
                    System.out.println(queue.poll());
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.execute(numberProducer);
        executor.execute(fizzProducer);
        executor.execute(buzzProducer);
        executor.execute(consumer);
        for (int i = 1; i <= 20; i++) {
            numberProducer.setN(i);
            fizzProducer.setN(i);
            buzzProducer.setN(i);
            fizzProducer.setN(i);
            while (numberProducer.isUpdate() || fizzProducer.isUpdate() || buzzProducer.isUpdate()) {
                Thread.sleep(100);
            }
        }
    }
}

