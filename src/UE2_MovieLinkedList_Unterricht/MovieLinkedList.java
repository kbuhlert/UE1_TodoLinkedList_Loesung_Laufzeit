package UE2_MovieLinkedList_Unterricht;

public class MovieLinkedList
{
    // *** Membervariablen ***
    private Node first;
    private Node last;

    // *** Getter- & Setter-Methoden ***

    public Node getFirst()
    {
        return this.first;
    }

    public void setFirst(Node first)
    {
        this.first = first;
    }

    public Node getLast()
    {
        return this.last;
    }

    public void setLast(Node last)
    {
        this.last = last;
    }

    // *** Operationen ***

    public Node getMovieByTitle(String movieTitle)
    {
        // Implementierung offen
        return null;
    }

    public Node getMovieAtIndex(int index)
    {
        // 1) Beginne bei First
        Node currentNode = first;

        // 2) Zähler auf 0
        int counter = 0;

        // Example:
        // Inception -> Fast&Furious -> Pretty Woman
        // index = 10
        // 1) currentNode = Inception
        // 2) currentNode = Fast&Furious
        // 3) currentNode = Pretty Woman (Next of Pretty Woman is null)
        // 4) currentNode = null

        // 3) Schleife bis zum gesuchten Element springen (Zähler < Index)
        // - while (<Bedingung>)
        // - for
        // - ...
        while (counter < index)
        {
            if (currentNode == null)
                return null;

            currentNode = currentNode.getNext();
            counter++;
        }

        // 4) Liefere Text zurück
        return currentNode;
    }

    public void insertMovieTitleAtIndex(String movieTitle, int index)
    {
        // 0) Neuer Knoten (z.B. Back to the future) erstellen
        Node neuerNode = new Node(movieTitle);

        // Beispiel
        // Liste: Inception
        // 1) Node currentNode = first; (currentNode = Inception)
        // 2) currentNode = currentNode.getNext(); (currentNode = null)
        // 3) currentNode.getNext(); --> Fehler

        // SPEZIALFÄLLE:
        // a) Liste ist leer (es existieren keine Knoten in der Liste)
        if (first == null)
        {
            first = neuerNode;
            last = neuerNode;
        }
        // d) Neues Element ganz zu Beginn einfügen
        else if (index == 0)
        {
            first.setPrev(neuerNode);
            neuerNode.setNext(first);

            first = neuerNode;
        }
        else
        {
            // 1) Beginne bei First
            Node vorgaengerNode = first;

            // 2) Schleife bis zum Vorgänger (Zähler < (Index-1))
            for (int i = 0; i < (index - 1); i++)
            {
                vorgaengerNode = vorgaengerNode.getNext();

                // b) Index ist zu hoch (Fehlersituation)
                if (vorgaengerNode == null)
                    return;
            }

            // 3) Next vom neuen Knoten auf Nachfolger vom Vorgänger zeigen lassen
            // Spezialfall c) Neues Element ganz zum Schluss einfügen --> kein Nachfolger bzw. Nachfolger = null
            Node nachfolgerNode = vorgaengerNode.getNext();
            neuerNode.setNext(nachfolgerNode);

            // 4) Prev vom neuen Knoten auf Vorgänger zeigen lassen
            neuerNode.setPrev(vorgaengerNode);

            // 5) Next vom Vorgänger auf neuen Knoten zeigen lassen
            vorgaengerNode.setNext(neuerNode);

            // 6) Prev vom Nachfolger auf neuen Knoten zeigen lassen
            if (nachfolgerNode != null)
                nachfolgerNode.setPrev(neuerNode);

            // Spezialfall c) Neues Element ganz zum Schluss einfügen --> kein Nachfolger bzw. Nachfolger = null
            if (vorgaengerNode == last)
                last = neuerNode;
        }
    }

    public void deleteMovieAtIndex(int index)
    {
        // Spezialfall: Liste ist leer
        if (first == null)
            return;
        // Spezialfall: Liste besteht nur aus einem Element
        // Anmerkung: So wie es hier programmiert ist, ignoriert man den übergebenen Index.
        else if (first.getNext() == null)
        {
            first = null;
            last = null;
        }
        // ACHTUNG: Spezialfall "erstes Element löschen" fehlt!
        else
        {
            // 1) Beginne bei First
            Node vorgaengerNode = first;

            // 2) Schleife bis zum Vorgänger (Zähler < (Index-1))
            for (int i = 0; i < (index - 1); i++)
            {
                vorgaengerNode = vorgaengerNode.getNext();

                // Spezialfall: Index falsch
                if (vorgaengerNode == null)
                    return;
            }

            // 3) Next vom Vorgänger (Milch) auf Next vom zu löschenden Element (Paprika) zeigen lassen
            Node zuLoeschenNode = vorgaengerNode.getNext();
            Node nachfolgerNode = zuLoeschenNode.getNext();
            vorgaengerNode.setNext(nachfolgerNode);

            // 4) Prev vom Nachfolger (Salat) auf Vorgänger zeigen lassen
            if (nachfolgerNode != null)
                nachfolgerNode.setPrev(vorgaengerNode);
            // Spezialfall: nachfolgerNode ist null. D.h. zuLoeschenNode war letztes ELement, welches nun gelöscht wurde.
            // Darum muss last neu gesetzt werden.
            else
                last = vorgaengerNode;
        }
    }




}
