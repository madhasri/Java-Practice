class Nodee<T>
{
    T data;
    Nodee<T> next;

    Nodee(T x)
    {
        this.data = x;
        this.next = null;
    }
}


public class Queue<T> {


    Nodee<T> front;
    Nodee<T> rear;

    Queue()
    {

        this.front = null;
        this.rear = null;

    }

    void enqueue(int x)
    {
        Nodee temp = new Nodee(x);
        if(front == null)
        {

            front = temp;
            rear = temp;
        }
        else
        {
            rear.next = temp;
            rear = rear.next;
        }
    }

    T dequeue() throws Exception
    {
        if(front == null)
            throw new Exception("Queue Empty!");
        Nodee temp = front;
        front = front.next;
        return (T)temp.data;
    }

    void printQueue()
    {
        Nodee temp = front;
        while(temp != rear)
        {
            System.out.println(temp.data);
            temp = temp.next;

        }
        System.out.println(rear.data);
    }

    public static void main(String args[]) throws Exception
    {
           Queue<Integer> q = new Queue<>();
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(7);
        q.enqueue(10);
        System.out.println(q.dequeue());
        q.enqueue(1);
        System.out.println("Printing the Queue");
        q.printQueue();


    }


}
