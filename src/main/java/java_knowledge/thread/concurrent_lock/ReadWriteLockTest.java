package java_knowledge.thread.concurrent_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author jingtao
 * @Date 2017-09-08 11:38
 **/
public class ReadWriteLockTest {


    /**
     *
     *  ReadWriteLock:
     *      读写锁, 是区分读写的锁.
     *      他具有2把锁, 一把是读锁, 一把是写锁.
     *      读与读不互斥, 写与任何锁都互斥,
     *      通过细分锁的功能, 提高了并发效率.
     *
     */

    public static void main(String[] args) {

        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

        Lock readLock = readWriteLock.readLock();

        Lock writeLock = readWriteLock.writeLock();

    }
}
