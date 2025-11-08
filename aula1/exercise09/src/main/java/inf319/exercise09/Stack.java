package inf319.exercise09;

/**
 * This class implements a stack.
 *
 * This particular implementation uses a queue.
 */
public class Stack<E> {

    private Queue<E> queue;

    /**
     * Creates a new stack with the default maximum capacity.
     */
    public Stack() {
        this.queue = new Queue<>();
    }

    /**
     * Creates a new stack with the provided maximum capacity.
     * 
     * @param max the maximum capacity.
     */
    public Stack(int size) {
        this.queue = new Queue<>(size);
    }

    /**
     * Adds a element to the top of the stack, if there is a position available.
     * 
     * @param element the element to be stacked.
     * @return <code>true</code> if successful, <code>false</code> otherwise.
     */
    public boolean push(E element) {
        if (queue.remaining() == 0) {
            return false;
        }

        int currentSize = queue.size();
        queue.enqueue(element);
        for (int i = 0; i < currentSize; i++) {
            queue.enqueue(queue.dequeue());
        }
        return true;
    }

    /**
     * Removes the element at the top of the stack.
     *  
     * @return the top of the stack, <code>null</code> if the stack is
     *         empty.
     */
    public E pop() {
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
