package UE3_BookStack_Loesung;

public class Node
{
    private final String bookTitle;
    private Node next;

    // *** Konstruktor ***

    public Node(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }

    // *** Getter- und Setter-Methoden ***

    public String getBookTitle()
    {
        return this.bookTitle;
    }

    public Node getNext()
    {
        return this.next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }
}
