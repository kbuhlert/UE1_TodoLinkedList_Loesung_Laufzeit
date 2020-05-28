package UE3_BookStack_Loesung;

public class BookStack
{
    private Node top;

    public Node getTop()
    {
        return this.top;
    }

    public void push(String bookTitle)
    {
        Node newNode = new Node(bookTitle);
        if (top != null)
            newNode.setNext(top);
        top = newNode;
    }

    public String pop() throws StackEmptyException
    {
        if (getCount() == 0)
            throw new StackEmptyException();

        String firstBookTitle = top.getBookTitle();
        Node secondNode = top.getNext();
        top = secondNode;

        return firstBookTitle;
    }

    public int getCount()
    {
        int counter = 0;
        Node currentNode = top;

        while (currentNode != null)
        {
            currentNode = currentNode.getNext();
            counter++;
        }

        return counter;
    }
}
