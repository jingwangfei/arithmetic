package java_knowledge.thread.concurrent_collection;

import java.util.Collections;
import java.util.Map;

/**
 *
 * @Author jingtao
 * @Date 2017-09-12 9:53
 **/
public class SynchronizedMapTest {

    public static void main(String[] args) {

        Map map = null;
        Collections.synchronizedMap(map);

    }
}
