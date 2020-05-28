package UE2_MovieLinkedList_Loesung;

public class Node
{
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

    public String getMovieTitle()
    {
        return this.movieTitle;
    }

    public Node getNext()
    {
        return this.next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

    public Node getPrev()
    {
        return this.prev;
    }

    public void setPrev(Node prev)
    {
        this.prev = prev;
    }

}
