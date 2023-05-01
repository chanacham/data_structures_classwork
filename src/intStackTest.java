//import com.sun.org.apache.xml.internal.utils.IntStack;
//import org.junit.jupiter.api.Test;
//
//import java.util.Stack;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class intStackTest {
//
//    @Test
//    void push() {
//        System.out.println("testing push()");
//        IntStack stack = new IntStack();
//        try {
//            stack.push(100);
//        } catch (StackFullException sfe) {
//            System.out.println(sfe.getMessage());
//        }
//        assertEquals(100, stack.peek());
//
//        IntStack numbers = new IntStack();
//        try {
//            for (int ii = 1; ii <= 10; ++ii) {
//                numbers.push(ii);
//            }
//        } catch (StackFullException sfe) {
//
//        }
//        for (int ii = 10; ii > 0; --ii) {
//            assertEquals(ii, numbers.pop());
//        }
//
//    }
//
//    @Test
//    void pop() {
//    }
//
//    @Test
//    void peek() {
//    }
//
//    @Test
//    void isEmpty() {
//    }
//}