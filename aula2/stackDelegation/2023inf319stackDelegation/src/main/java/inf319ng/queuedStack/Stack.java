package inf319ng.queuedStack;

/**
 * This class implements a stack (last in, first out)
 *
 * This particular implementation uses a queue.
 */
public class Stack {

    private Queue queue;

    /**
     * Creates a new stack with the default maximum capacity.
     */
    public Stack() {
        queue = new Queue();
    }

    /**
     * Creates a new stack with the provided maximum capacity.
     * 
     * @param max the maximum capacity.
     */
    public Stack(int size) {
        queue = new Queue(size);
    }

    /**
     * Adds a element to the top of the stack, if there is a position available.
     * The rear of the queue is the top of the stack.
     * 
     * @param element the element to be stacked.
     * @return <code>true</code> if successful, <code>false</code> otherwise.
     */
    public boolean push(Object element) {
        return queue.enqueue(element);
    }

    /**
     * Removes the element at the top of the stack.
     *  
     * @return the top of the stack, <code>null</code> if the stack is
     *         empty.
     */
    public Object pop() {
        // Rotate queue until rear becomes front.
        for (int i = queue.size(); i > 1; i--) {
            queue.enqueue(queue.dequeue());
        }
        return queue.dequeue();
    }

    /**
     * Return the current size of this stack.
     * 
     * @return the current size of this stack.
     */
    public int size() {
        return queue.size();
    }

    /**
     * Returns the maximum size of this stack.
     * 
     * @return the maximum size of this stack.
     */
    public int maxSize() {
        return queue.maxSize();
    }

    /**
     * Returns the number of positions available in the stack.
     * 
     * @return the number of positions available in the stack.
     */
    public int remaining() {
        return queue.remaining();
    }

    /**
     * Indicates if this stack is empty.
     * 
     * @return <code>true</code> if the stack is empty,
     *         <code>false</code> otherwise.
     */
    public boolean empty() {
        return queue.empty();
    }

}
