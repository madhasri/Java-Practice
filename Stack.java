

public class Stack<T> {

    LinkedList<T> ll;



    Stack()
    {
        ll = new LinkedList<>();
    }

    void push(T x)
    {

        ll.addToLinkedList(x);


    }

    T pop() throws Exception
    {
        return (T)ll.delFromLinkedList().data;
    }

    public static void main(String args[]) throws Exception
    {
        Stack<String> s = new Stack<>();
        s.push("madame");
        s.push("rkd");
        s.push("maddy");
        System.out.println(s.pop());

        Stack<Integer> intStack = new Stack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        System.out.println(intStack.pop());


    }

}
