package java_knowledge.thread.thread_pool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

/**
 *
 * @Author jingtao
 * @Date 2017-09-08 17:47
 **/
public class ThreadPoolTest {


    /**
     *  参考: https://my.oschina.net/hosee/blog/614319
     *  ([高并发Java 六] JDK并发包2)
     */
    public static void main(String[] args) {

        Executor executor = null;

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(new Runnable() {
            public void run() {
                System.out.println("===");
            }
        });

//        ForkJoinPool forkJoinPool = new ForkJoinPool();

    }
}
