class myLinkedList {
    private static class Node
    {
        private int data;
        private Node next;

        public Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;

    // Constructs an empty list
    public myLinkedList()
    {
        head = null;
    }

    // Returns true if the list is empty otherwise returns false
    public boolean isEmpty()
    {
        return (head == null);
    }

    // Inserts a new node at the beginning of this list.
    public void insertAtBeginning(int element)
    {
        head = new Node(element, head);
    }

    // Returns the first element in the list.
    public int getFirstElement()
    {
        if(head == null)
        {
            System.out.println("Empty linked list");
            throw new IndexOutOfBoundsException();
        }
        return head.data;
    }

    // Removes the first node in the list.
    public int removeFirstNode()
    {
        int tmp = getFirstElement();
        head = head.next;
        return tmp;
    }

    // Empties linked list
    public void clear()
    {
        head = null;
    }

    // Returns the length of the linked list
    public static int LLlength(Node head)
    {
        int length = 0;
        Node currentNode = head;

        while(currentNode != null)
        {
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }

    // Displays the linked list elements
    public static void display(Node head)
    {
        if(head == null)
        {
            System.out.println("Empty linked list");
            throw new IndexOutOfBoundsException();
        }

        Node currentNode = head;

        while(currentNode != null)
        {
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // Displays the linked list elements in reverse order
    public static void displayReverse(Node head)
    {
        if(head == null){}
        else
        {
            Node currentNode = head;
            displayReverse(currentNode.next);
            System.out.print(currentNode.data+" ");
        }
    }
    //Displays the linked list's last element
    public static int getLastElement(Node head)
    {
        Node currentNode = head;

        while(currentNode.next != null)
        {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }
    public static void insertAtLast(Node head,int element)
    {
        Node newNode=null;
        newNode.data = element;
        newNode.next = null;
        while(head.next != null)
        {
            head = head.next;
        }
        head = newNode;
        //return head;

    }

    //Tells if a sepeific element is in the Linked List or not
    public static boolean searchFor(Node head, int element)
    {
        Node currentNode = head;
        boolean flag = false;
        while(currentNode != null)
        {
            if (currentNode.data == element)
            {
                flag = true;
                break;
            }
            currentNode = currentNode.next;
        }
        return flag;
    }

}