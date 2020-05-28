package UE2_MovieLinkedList_Loesung;

public class MovieLinkedList
{
    private Node first;
    private Node last;

    // *** Getter- & Setter-Methoden ***

    public Node getFirst()
    {
        return this.first;
    }

    public Node getLast()
    {
        return this.last;
    }

    // *** Operationen ***

    public Node getMovieAtIndex(int index)
    {
        int counter = 0;  // Index beginnt bei 0 (nicht 1)
        Node currentNode = first;

        while (counter < index && currentNode != null)
        {
            currentNode = currentNode.getNext();
            counter++;
        }

        return currentNode;
    }

    public void insertMovieTitleAtIndex(String movieTitle, int index)
    {
        Node newNode = new Node(movieTitle);

        Node currentNode = getMovieAtIndex(index);

        // Index existiert nicht. In dem Fall an letzer Stelle einfügen.
        if (currentNode == null)
        {
            // Liste ist noch ganz leer
            if (first == null)
            {
                first = newNode;
                last = newNode;
            }
            // Liste hat bereits Elemente
            else
            {
                last.setNext(newNode);
                newNode.setPrev(last);

                last = newNode;
            }
        }
        // aktueller Film/Movie auf Index wurde gefunden
        else
        {
            newNode.setNext(currentNode);
            if (currentNode == first)
            {
                first = newNode;
            }
            else
            {
                Node prevNode = currentNode.getPrev();
                prevNode.setNext(newNode);
                newNode.setPrev(prevNode);
                currentNode.setPrev(newNode);
            }
        }
    }


    public void deleteMovieAtIndex(int index)
    {
        Node deleteNode = getMovieAtIndex(index);

        if (deleteNode != null)
        {
            Node prevNode = deleteNode.getPrev();
            Node nextNode = deleteNode.getNext();

            if (deleteNode != first)
            {
                prevNode.setNext(nextNode);
            }
            else
            {
                first = nextNode;
            }

            if (deleteNode != last)
            {
                nextNode.setPrev(prevNode);
            }
            else
            {
                last = prevNode;
            }
        }
    }


}
