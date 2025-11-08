package inf319ng.queueiStack;

/**
 * This class implements a stack.
 *
 * This particular implementation so happens to *be* a queue.
 */
public class Stack extends Queue {

    /**
     * Creates a new stack with the default maximum capacity.
     */
    public Stack() {
        super();
    }

    /**
     * Creates a new stack with the provided maximum capacity.
     * 
     * @param max the maximum capacity.
     */
    public Stack(int size) {
        super(size);
    }
    
    /**
     * Adds a element to the top of the stack, if there is a position available.
     * 
     * @param element the element to be stacked.
     * @return <code>true</code> if successful, <code>false</code> otherwise.
     */
    public boolean push(Object element) {
        return enqueue(element);
    }

    /**
     * Removes the element at the top of the stack.
     *  
     * @return the top of the stack, <code>null</code> if the stack is
     *         empty.
     */
    public Object pop() {
        if (size() == 0) {
            return null;
        }
        rear = (queueMaxSize + rear - 1) % queueMaxSize;
        return queue[rear];
    }

}
