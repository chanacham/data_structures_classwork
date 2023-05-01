/**
 * Generic Linked List Interface
 * @param <T> - Type of the list elements
 */
public interface IGLL<T>
{
    /**
     * insert an element at the head of the list
     * @param value : T -- element to be inserted
     */
    public void newHead(T value);
    /**
     * insert an element at the end of the list
     * @param value : T -- element to be inserted
     */
    public void newTail(T value);
    /**
     * remove the first element from the list
     * @return T -- the value of the removed element
     */
    public boolean decapitate();
    /**
     * remove the second item from the list
     * @return T -- the value of the removed element
     */
    public boolean secondectomy();
    /**
     * swap the first two elements of the list
     * @return boolean - true on success, false on failure
     */
    public boolean swap12();
    /**
     * remove the last element from the list
     * @return T -- the value of the removed element
     */
    public T caudectomy();
}