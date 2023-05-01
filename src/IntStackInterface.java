public interface IntStackInterface {
    /**
     *
     * @param value
     */
    public void push (int value) throws Exception;

    public Integer pop();

    public int peek();

    public boolean isEmpty();
}
