package java_knowledge.thread.concurrent_lock;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *  参考: http://www.importnew.com/21288.html
 *  (高并发Java（5）：JDK并发包1)
 **/
public class CASTest {

    /**
     *  CAS: Compare And Set
     *
     *  CAS的过程:
     *          无锁的思想, 控制多线程并发
     *          3阶段,
     *          3个值
     *
     *  CAS的特点:
     *          1: 无锁, 非阻塞
     *          2: 原子性
     *
     *  AtomicInteger, AtomicRefenrece
     *
     */

    public static void main(String[] args) {

        AtomicInteger integer = new AtomicInteger(1);

        // value, expect, update
        integer.compareAndSet(1, 10);
    }
}
