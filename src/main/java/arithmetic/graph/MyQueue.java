package arithmetic.graph;


public class MyQueue<T> {

    /**
     * 队列实现
     */
    private Object[] elementDatas;

    /**
     * 队首指针
     */
    private Integer front;

    /**
     * 队尾指针
     */
    private Integer rear;

    public static final Integer MAX_ZISE = 20;

    public MyQueue() {

        elementDatas = new Object[MAX_ZISE];

        front = rear = 0;
    }

    public void add(T element) {

        if (rear == MAX_ZISE) {
            return;
        }

        elementDatas[rear++] = element;
    }

    public T poll() {

        if (front == MAX_ZISE) {
            return null;
        }

        T retValue = (T) elementDatas[front];

        elementDatas[front++] = null;

        return retValue;
    }

    public T peek() {

        if (front == MAX_ZISE) {
            return null;
        }

        return (T) elementDatas[front];
    }

    public boolean isEmpty() {

        return elementDatas[front] == null;
    }

    public Integer getFront() {
        return front;
    }

    public void setFront(Integer front) {
        this.front = front;
    }

    public Integer getRear() {
        return rear;
    }

    public void setRear(Integer rear) {
        this.rear = rear;
    }
}
