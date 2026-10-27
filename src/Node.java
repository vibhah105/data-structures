public class Node {
    private E data;
    private Node<E> next;
    
    public Node(E data, Node next)
    {
        this.data = data;
        this.next = next;
    }
    
    public Node<E> getNext()
    {
        return next;
    }
    public void setNext(Node newNext)
    {
        next = newNext;
    }
    public E getData()
    {
        return data;
    }
    public void setData(E list)
    {
        data = list;
    }
}
