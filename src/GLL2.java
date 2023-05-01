public class GLL2<T> implements IGLL<T>
{
    private class Node<T>
    {
        private T info;
        private Node<T> next;

        Node(T info)
        {
            this.info = info;
            next = null;
        }
    }

    private Node<T> head =  null;

    public GLL2(T value)
    {
        head = new Node<>(value);
    }

    @Override
    public void newHead(T value)
    {
        /*
        if (head == null)
        {
            head = new Node<>(value);
        }
        else
        {
            Node<T> node = new Node<>(head.info);
            node.next =  head.next;
            head.next = node;
            head.info = value;
        }
        */
        Node<T> node = new Node<>(value);
        node.next = head;
        head = node;
    }

    @Override
    public void newTail(T value)
    {
        Node<T> newTail = new Node<>(value);
        if (head == null){
            head = newTail;
        }else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newTail;
        }

    }

    @Override
    public boolean decapitate()
    {
        boolean success = false;
        if(head != null){
            head = head.next;
            success = true;
        }
        return success;
    }

    @Override
    public boolean secondectomy()
    {
        boolean success = false;
        if(head.next.next != null){
            head.next = head.next.next;
            success = true;
        }
        return success;
    }

    @Override
    public boolean swap12()
    {
       boolean success = false;
       if(head != null && head.next != null){
           T headInfo = head.info;
           head.info = head.next.info;
           head.next.info = headInfo;
           success = true;
       }
       return success;
    }

    @Override
    public T caudectomy()
    {
        T lastValue= null;
        if(head != null){
            Node<T> curr = head;
            if(curr.next == null){
                lastValue = head.info;
                head = null;
            }else{
                while(curr.next.next != null){
                    curr = curr.next;
                }
                lastValue = curr.next.info;
                curr.next = null;
            }
        }
        return lastValue;
    }

    /**
     * @param value
     * @return true if this linked list contains a node with info = value
     */
    public boolean find(T value)
    {
        return true;
    }

    /**
     * if there is a node containing info = value, <br>
     * then remove and return true <br>
     *     if the value is not there, then return false
     * @param Value
     * @return
     */
    public boolean remove(T Value)
    {
        return true;
    }

    public T getHead()
    {
        return head == null
                ? null
                : head.info;
    }

    public T getTail()
    {
        T tailValue = null;
        Node<T> curr = head;
        if (curr != null)
        {
            while (curr.next != null)
                curr = curr.next;
            tailValue = curr.info;
        }
        return tailValue;
    }
    public String toString()
    {
        StringBuilder str = new StringBuilder("head: ");
        Node<T> curr = head;
        while (curr != null)
        {
            str.append(curr.info.toString() + "->");
            curr = curr.next;
        }
        return str.toString();
    }
}

