import org.w3c.dom.Node;

public class singlelinkedlist {
    public  static  void maimn()
    {

    }
    public Node deleteFirst()
    {
        Node first = null;
        int next;
        Node temp=first;
        first = first.next;
        return  temp;
    }

}
