package inf319.exercise08;

import junit.framework.TestCase;

public class QueueTest extends TestCase {

    public void testBasicQueue() {
        Integer element = new Integer(42);
        Queue queue = new Queue();
        
        assertTrue(queue.empty());
        assertTrue(queue.enqueue(element));
        assertEquals(element, queue.dequeue());
        assertTrue(queue.empty());
    }
    
    public void testFullAndEmptyQueue() {
        Integer element = new Integer(42);
        Queue queue = new Queue(2);
        
        assertTrue(queue.enqueue(element));
        assertTrue(queue.enqueue(element));
        assertFalse(queue.enqueue(element));
        assertEquals(element, queue.dequeue());
        assertEquals(element, queue.dequeue());
        assertNull(queue.dequeue());
        assertTrue(queue.empty());
    }
        
    public void testRotation() {
        Integer element1 = new Integer(42);
        Integer element2 = new Integer(23);
        Queue queue = new Queue(3);

        assertTrue(queue.enqueue(element1));
        assertTrue(queue.enqueue(element1));
        assertEquals(element1, queue.dequeue());
        assertEquals(element1, queue.dequeue());

        assertTrue(queue.enqueue(element2));
        assertTrue(queue.enqueue(element1));
        assertEquals(element2, queue.dequeue());
        assertEquals(element1, queue.dequeue());
        assertNull(queue.dequeue());
    }

    public void testSizes() {
        Integer element = new Integer(42);
        Queue queue = new Queue(3);

        assertEquals(0, queue.size());
        assertEquals(3, queue.maxSize());
        assertEquals(3, queue.remaining());
        
        assertTrue(queue.enqueue(element));
        assertTrue(queue.enqueue(element));
        assertEquals(2, queue.size());
        assertEquals(1, queue.remaining());
        
        assertTrue(queue.enqueue(element));
        assertEquals(3, queue.size());
        assertEquals(0, queue.remaining());

        assertEquals(element, queue.dequeue());
        assertEquals(element, queue.dequeue());
        assertEquals(1, queue.size());
        assertEquals(2, queue.remaining());
    }

    public void testSizesWithRotation() {
        Integer element = new Integer(42);
        Queue queue = new Queue(3);

        assertTrue(queue.enqueue(element));
        assertTrue(queue.enqueue(element));
        assertEquals(element, queue.dequeue());
        assertEquals(element, queue.dequeue());

        assertTrue(queue.enqueue(element));
        assertTrue(queue.enqueue(element));
        assertEquals(2, queue.size());
        assertEquals(1, queue.remaining());
        
        assertEquals(element, queue.dequeue());
        assertEquals(element, queue.dequeue());
        assertEquals(0, queue.size());
        assertEquals(3, queue.remaining());
    }
}
