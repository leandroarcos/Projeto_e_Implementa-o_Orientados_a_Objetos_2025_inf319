package inf319ng.queuedStack;

import junit.framework.TestCase;

public class StackTest extends TestCase {

    public void testBasicStack() {
        Integer element = new Integer(42);
        Stack stack = new Stack();
        
        assertTrue(stack.empty());
        assertTrue(stack.push(element));
        assertEquals(element, stack.pop());
        assertTrue(stack.empty());
    }

    public void testFullAndEmptyStack() {
        Integer element1 = new Integer(42);
        Integer element2 = new Integer(23);
        Stack stack = new Stack(2);
        
        assertTrue(stack.push(element1));
        assertTrue(stack.push(element2));
        assertFalse(stack.push(element1));
        assertEquals(element2, stack.pop());
        assertEquals(element1, stack.pop());
        assertNull(stack.pop());
        assertTrue(stack.empty());
    }

    public void testSizes() {
        Integer element = new Integer(42);
        Stack stack = new Stack(3);

        assertEquals(0, stack.size());
        assertEquals(3, stack.maxSize());
        assertEquals(3, stack.remaining());
        
        assertTrue(stack.push(element));
        assertTrue(stack.push(element));
        assertEquals(2, stack.size());
        assertEquals(1, stack.remaining());
        
        assertTrue(stack.push(element));
        assertEquals(3, stack.size());
        assertEquals(0, stack.remaining());

        assertEquals(element, stack.pop());
        assertEquals(element, stack.pop());
        assertEquals(1, stack.size());
        assertEquals(2, stack.remaining());
    }
}
