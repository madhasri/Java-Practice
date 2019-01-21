class Nod<T>
{
    T data;
    Nod next;

    Nod(T x)
    {
        this.data = x;
        this.next = null;
    }

}


public class LinkedList<T> {

    Nod<T> head;

    LinkedList()
    {
        this.head = null;
    }

    void addToLinkedList(T x)
    {
        if(head == null)
        {
            head = new Nod(x);

        }
        else
        {
            Nod temp = new Nod(x);
            temp.next = head;
            head= temp;
        }

    }

    Nod delFromLinkedList() throws Exception
    {
        Nod temp;
        if(head == null)
            throw new Exception("Empty Linked List!!!");
        else
        {
            temp = head;
            head = head.next;

        }
        return temp;
    }

    void printLinkedList()
    {
        Nod temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    public static void main(String args[]) throws Exception
    {
        LinkedList<Integer> L = new LinkedList<>();
        L.addToLinkedList(4);
        L.addToLinkedList(2);
        L.addToLinkedList(1);
        L.addToLinkedList(3);
        L.delFromLinkedList();
        L.addToLinkedList(7);
        L.printLinkedList();


    }



}
