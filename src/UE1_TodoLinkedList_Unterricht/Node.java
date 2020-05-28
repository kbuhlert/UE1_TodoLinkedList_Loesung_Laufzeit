package UE1_TodoLinkedList_Unterricht;

public class Node
{
    // *** Membervariablen ***
    private String todoText;
    private Node next;

    // *** Konstruktor (optional) ***

    public Node(String todoText)
    {
        this.todoText = todoText;
    }

    // *** Getter- & Setter ***

    public void setTodoText(String todoText)
    {
        this.todoText = todoText;
    }

    public String getTodoText()
    {
        return this.todoText;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

    public Node getNext()
    {
        return this.next;
    }
}
