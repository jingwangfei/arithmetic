package java_knowledge.thread.concurrent_lock;

import java.util.concurrent.CountDownLatch;

/**
 * ${DESCRIPTION}
 *
 * @Author jingtao
 * @Date 2017-09-08 11:54
 **/
public class CountDownLatchTest {


    /**
     *  另外一种, 带有额度的, 共享锁
     *
     *  持有countdown的, 线程之前, 共同运行.
     *
     *  调用await方法, 进行等待
     *
     */
    public static void main(String[] args) {

        CountDownLatch countDownLatch = new CountDownLatch(1);

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
