package java_knowledge.thread.concurrent_lock;

import java.util.concurrent.Semaphore;

/**
 *
 * @Author jingtao
 * @Date 2017-09-07 17:17
 **/
public class SemaphoreTest {

    public static void main(String[] args) {

        /**
         *  带有额度的共享锁
         */
        final Semaphore semaphore = new Semaphore(2);


        for(int i = 0; i < 3; i ++) {
            new Thread() {

                @Override
                public void run() {
                    try {
                        semaphore.acquire();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    while(true)  {
                        System.out.println(Thread.currentThread().getName());
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }.start();
        }
    }
}
