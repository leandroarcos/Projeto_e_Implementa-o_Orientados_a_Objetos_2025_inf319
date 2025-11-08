package inf319ng.queueiStack;

/**
 * This class implements a queue.
 * 
 * This particular implementation uses a circular list with a fixed
 * maximum capacity. 
 */
public class Queue {

    protected final static int DEFAULTQUEUESIZE = 20;
    protected int queueMaxSize;
    protected int front;
    protected int rear;
    protected Object queue[];
    
    /**
     * Creates a new queue with the default maximum capacity.
     */
    public Queue() {
        this(DEFAULTQUEUESIZE);
    }

    /**
     * Creates a new queue with the provided maximum capacity.
     * 
     * @param max the maximum capacity.
     */
    public Queue(int max) {
        queueMaxSize = max + 1;
        front = rear = 0;
        queue = new Object[queueMaxSize];
    }

    /**
     * Adds a queue element to the rear of the queue, if there is a
     * position available.
     * 
     * @param element the element to be queued.
     * @return <code>true</code> if successful, <code>false</code> otherwise.
     */
    public boolean enqueue(Object element) {
        if (remaining() == 0) {
            return false;
        }
        queue[rear] = element;
        rear = (rear + 1) % queueMaxSize;
        return true;
    }

    /**
     * Removes the queue element currently at the front of the queue.
     *  
     * @return the front of the queue, <code>null</code> if the queue is
     *         empty.
     */
    public Object dequeue() {
        if (size() == 0) {
            return null;
        }
        Object element = queue[front];
        front = (front + 1) % queueMaxSize;
        return element;
    }

    /**
     * Returns the number of positions available in the queue.
     * 
     * @return the number of positions available in the queue.
     */
    public int remaining() {
        return queueMaxSize - 1 - size();
    }

    /**
     * Return the current size of this queue.
     * 
     * @return the current size of this queue.
     */
    public int size() {
        return (queueMaxSize + rear - front) % queueMaxSize;
    }
    
    /**
     * Returns the maximum size of this queue.
     * 
     * @return the maximum size of this queue.
     */
    public int maxSize() {
        return queueMaxSize - 1;
    }

    /**
     * Indicates if this queue is empty.
     * 
     * @return <code>true</code> if the queue is empty,
     *         <code>false</code> otherwise.
     */
    public boolean empty() {
        return size() == 0;
    }
}
