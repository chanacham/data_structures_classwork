public class IntStack implements IntStackInterface {
    private final int MAX_SIZE = 10;
    private int[] stack = null;
    private int nextSpaceForPush = 0;

    public IntStack() {
        stack = new int[MAX_SIZE];
    }

    @Override
    public void push(int value) throws StackFullException {
        if (nextSpaceForPush == MAX_SIZE) {
            throw new StackFullException();
        } else {
            stack[nextSpaceForPush++] = value;
        }
    }

    @Override
    public Integer pop() {
        Integer retVal = null;
        if (nextSpaceForPush > 0) {
            retVal = stack[--nextSpaceForPush];
        }
        return retVal;
    }

    @Override
    public int peek() {
        Integer retVal = null;
        if (nextSpaceForPush > 0) {
            retVal = stack[nextSpaceForPush - 1];
        }
        return retVal;
    }

    @Override
    public boolean isEmpty() {
        return nextSpaceForPush == 0;
    }
}
