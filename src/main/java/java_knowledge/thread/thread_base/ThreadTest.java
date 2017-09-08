package java_knowledge.thread.thread_base;

/**
 *  线程的基本知识.
 *
 * @Author jingtao
 * @Date 2017-09-05 16:31
 **/
public class ThreadTest {

    /**
     *
     *  线程:
     *      线程的7大状态
     *          锁对象, 就绪队列, 等待队列
     *      线程优先级
     *          可能性
     *      后台线程
     *      线程中断
     *          协调机制
     *
     */
    public static void main(String[] args) {


        Thread thread01 = new Thread() {

            @Override
            public void run() {

                // 休眠状态
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                // 阻塞状态
                synchronized (ThreadTest.class) {

                    // 等待状态
                    try {
                        ThreadTest.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName() + ": =========== ENB ============");
            }
        };

        thread01.start();


        // 等待状态
        /*try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        synchronized (ThreadTest.class) {
            // 等待状态
            try {
                Thread.sleep(1000);

                thread01.interrupt();

                Thread.sleep(10000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//        thread01.interrupt();

        // 等待状态
       /* try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

    }
}
