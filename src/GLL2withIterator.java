//import java.util.Iterator;
//
///**
// * Generic class Linked List: GLL2
// * @param <T> must implement Comparable
// */
//public class GLL2withIterator<T extends Comparable<? super T>> implements IGLL<T>
//{
//    private class Node<T extends Comparable<? super T>>
//    {
//        private T info;
//        private Node<T> next;
//
//        Node(T info)
//        {
//            this.info = info;
//            next = null;
//        }
//    }
//
//    private Node<T> head = null;
//
//    public GLL2withIterator() {;}
//    public GLL2withIterator(T value)
//    {
//        head = new Node<>(value);
//    }
//
//    @Override
//    public void newHead(T value)
//    {
//        Node<T> node = new Node<>(value);
//        node.next = head;
//        head = node;
//    }
//
//    @Override
//    public void newTail(T value)
//    {
//        Node<T> node = new Node<>(value);
//        if (head == null)
//        {
//            head = node;
//        }
//        else
//        {
//            Node<T> curr = head;
//            while (curr.next != null)
//            {
//                curr = curr.next;
//            }
//            curr.next = node;
//        }
//    }
//
//
//    @Override
//    public boolean decapitate()
//    {
//        T headInfo = null;
//        if ( head != null)
//        {
//            headInfo = head.info;
//            head = head.next;
//        }
//        return headInfo;
//    }
//
//    @Override
//    public boolean secondectomy()
//    {
//        T retVal = null;
//        if (head != null && head.next != null)
//        {
//            retVal = head.next.info;
//            head.next = head.next.next;
//        }
//        return retVal;
//    }
//
//    @Override
//    public boolean swap12()
//    {
//        boolean success = false;
//        if (head != null && head.next != null)
//        {
//            T tmp = head.info;
//            head.info = head.next.info;
//            head.next.info = tmp;
//            success = true;
//        }
//        return success;
//
//    }
//
//    @Override
//    public T caudectomy()
//    {
//        T retVal = null;
//        if (head != null)
//        {
//            Node<T> curr = head;
//            if (curr.next == null)
//            {
//                retVal = head.info;
//                head = null;
//            }
//            else
//            {
//                while (curr.next.next != null)
//                {
//                    curr = curr.next;
//                }
//                retVal = curr.next.info;
//                curr.next = null;
//            }
//        }
//        return retVal;
//    }
//
//    public boolean contains(T value)
//    {
//        boolean found = false;
//        Node<T> curr = head;
//        while (curr != null)
//        {
//            if (value.compareTo(curr.info) == 0)
//            {
//                found = true;
//                break;
//            }
//            curr = curr.next;
//        }
//        return found;
//    }
//
//    public boolean remove(T value)
//    {
//        boolean removed = false;
//        Node<T> curr = head;
//        Node<T> prev = null;
//        while (curr != null)
//        {
//            if (value.compareTo(curr.info) == 0)
//            {
//                if (curr == head)
//                {
//                    head = curr.next;
//                }
//                else
//                {
//                    prev.next = curr.next;
//                }
//                removed = true;
//                break;
//            }
//            prev = curr;
//            curr = curr.next;
//        }
//        return removed;
//    }
//
//    public T getHead()
//    {
//        return head == null
//                ? null
//                : head.info;
//    }
//
//    public T getTail()
//    {
//        T tailValue = null;
//        Node<T> curr = head;
//        if (curr != null)
//        {
//            while (curr.next != null)
//                curr = curr.next;
//            tailValue = curr.info;
//        }
//        return tailValue;
//    }
//
//    public String toString()
//    {
//        StringBuilder str = new StringBuilder("head: ");
//        Node<T> curr = head;
//        while (curr != null)
//        {
//            str.append(curr.info.toString() + "->");
//            curr = curr.next;
//        }
//        return str.toString();
//    }
//
//    public Iterator<T> iterator()
//    {
//        return new Iterator<T>()
//        {
//            Node<T> curr = head;
//
//            @Override
//            public boolean hasNext()
//            {
//                return curr != null;
//            } // yes, this is somewhat of a misnomer
//
//            @Override
//            public T next()
//            {
//                T value = curr.info;
//                curr = curr.next;
//                return value;
//            }
//        };
//    }
//}
