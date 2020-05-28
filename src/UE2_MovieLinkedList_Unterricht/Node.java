package UE2_MovieLinkedList_Unterricht;

public class Node
{
    // *** Membervariablen ***
    private final String movieTitle;
    private Node next;
    private Node prev;

    // *** Konstruktor ***

    public Node(String movieTitle)
    {
        this.movieTitle = movieTitle;
        this.next = null;
        this.prev = null;
    }

    // *** Getter- & Setter-Methoden ***

    public void setNext(Node next)
    {
        this.next = next;
    }

    public Node getPrev()
    {
        return prev;
    }

    public void setPrev(Node prev)
    {
        this.prev = prev;
    }

    public String getMovieTitle()
    {
        return this.movieTitle;
    }

    public Node getNext()
    {
        return this.next;
    }
}
