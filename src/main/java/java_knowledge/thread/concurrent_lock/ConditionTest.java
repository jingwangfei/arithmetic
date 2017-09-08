package java_knowledge.thread.concurrent_lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @Author jingtao
 * @Date 2017-09-07 17:12
 **/
public class ConditionTest {

    public static void main(String[] args) {

        /**
         *  Condition
         *      同object中, wait, notify一样.
         *      以面向对象的思想, 集合Lock进行使用.
         *
         *      但是, 增加了, 不可中断, 可限时的等待功能.
         *      避免出现长事件等待
         *
         */
        ReentrantLock reentrantLock = new ReentrantLock();

        Condition condition = reentrantLock.newCondition();

        try {
            condition.awaitNanos(11L);

            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
