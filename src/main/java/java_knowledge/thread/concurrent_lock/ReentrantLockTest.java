package java_knowledge.thread.concurrent_lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author jingtao
 * @Date 2017-09-07 16:54
 **/
public class ReentrantLockTest {

    public static void main(String[] args) {

        /**
         *  1: 可从入
         *      锁对象 -> 获取计数器, 同synchronized原语一样.
         *
         *  2: 可限时
         *      特性, 避免出现死锁, 超过指定时间, 则返回fasal
         *
         *  3: 可中断
         *      特性, synchronized, 不可中断
         *
         *  4: 公平锁
         *      按照请求顺序获得锁
         *          公平和非公平：公平表示获取的锁的顺序是按照线程加锁的顺序来分配获取到锁的线程时最先加锁的线程，是按照FIFO的顺序来分配锁的；非公平表示获取锁的顺序是无需的，后来加锁的线程可能先获得锁，这种情况就导致某些线程可能一直没获取到锁。
         *
         */


        /**
         *  可限时
         */
        ReentrantLock reentrantLock = new ReentrantLock();
        try {
            reentrantLock.tryLock(11L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        /**
         *  基本用法
         */
        reentrantLock.lock();

        try {

        } finally {
            reentrantLock.unlock();
        }


        /**
         *  可中断
         */
        try {
            reentrantLock.lockInterruptibly();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /**
         *  公平锁
         */

        reentrantLock = new ReentrantLock(true);
    }

    public void testReentrant () {


    }
}
