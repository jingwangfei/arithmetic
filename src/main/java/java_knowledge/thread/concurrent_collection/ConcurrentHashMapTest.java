package java_knowledge.thread.concurrent_collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author jingtao
 * @Date 2017-09-08 13:10
 **/
public class ConcurrentHashMapTest {

    public static void main(String[] args) {

        /**
         *
         *  将集合, 包装成为, 同步集合, 里面的方法, 都是对mutex加锁, 进行实现的.
         *  效率比较低.
         */
        Set<String> set = new HashSet<String>();
        Collections.synchronizedSet(set);


        /**
         *   它将大的HashMap切分成若干个段
         *   多个线程在不同段上的Hash操作一定是线程安全的，所以只需要同步同一个段上的线程就可以了
         *
         *   锁的分离，大大增加了并发量
         */
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
    }
}
