package UE1_TodoLinkedList_Unterricht;

public class TodoLinkedList
{
    // *** Membervariablen ***
    private Node first;
    private Node last;

    // *** Get-Methoden (Set-Methoden nicht notwendig) ***

    public Node getFirst()
    {
        return this.first;
    }

    public Node getLast()
    {
        return this.last;
    }

    // *** Operationen ***

    public void appendTodoText(String todoText)
    {
        // Neuen Knoten erstellen
        Node newNode = new Node(todoText);

        // Wenn die Liste leer ist...
        if (last == null)
        {
            first = newNode;
            last = newNode;
        }
        // wenn die Liste nicht leer ist...
        else if (last != null)
        {
            // 1) Next vom bisherigen Last auf (neuen Knoten) setzen.
            last.setNext(newNode);
            // 2) Next von (neuem Knoten) auf NULL setzen.
            newNode.setNext(null);
            // 3) Last auf (neuen Knoten) setzen.
            last = newNode;
        }
    }

    public void deleteLastTodoText()
    {
        // Fall: Liste ist leer
        if (first == null)
            return;
        // Fall: Liste besteht aus einem Knoten
        else if (first == last)
        {
            first = null;
            last = null;
        }
        else
        {
            // 1) Beginne bei First
            Node currentNode = first;

            // "Müll rausbringen" -> "Urlaub planen"
            // currentNode.getTodoText() => Müll rausbringen
            // first.getTodoText() => Müll rausbringen
            // currentNode = currentNode.getNext();
            // current.getTodoText() => Urlaub planen

            // 2) Vorgänger finden
            while (currentNode.getNext() != last)
                currentNode = currentNode.getNext();

            // 3) Next von Vorgänger auf Next von (letzen Knoten) setzen
            currentNode.setNext(null);

            // 4) Last neu setzen
            last = currentNode;
        }
    }

    public String getTodoTextAtIndex(int index)
    {
        // Index startet bei 0 (nicht bei 1)
        Node currentNode = first;
        int counter = 0;

        // Liste: "Müll rausbringen" (0) -> "Urlaub planen" (1) -> "ALD lernen" (2)
        // Index: 2 ==> wäre letztes Element bei dieser Liste.

        // Fall: Index ist 0 => Schleife wird nicht durchgeführt. Passt alles.

        // Solange der Zähler kleiner als der Index springe weiter
        while (counter < index)
        {
            // Weiterspringen zum nächsten Knoten
            currentNode = currentNode.getNext();
            counter++;

            // Fall: Index ist ungültig.
            if (currentNode == null)
                return null;
        }

        return currentNode.getTodoText();
    }

    // Bereits vorhandene Methode
    public void deleteTodoTextAtIndex(int index)
    {
        int counter = 0;
        Node currentNode = first;
        Node prevNode = null;

        // Vorgängerknoten von Knoten an der Position index suchen
        while (counter < index && currentNode != null)
        {
            counter++;
            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }

        // Knoten nicht gefunden
        if (currentNode == null)
            return;

        // Erster Knoten soll gelöscht werden
        if (currentNode == first)
        {
            first = currentNode.getNext();
        }

        // Letzter Knoten soll gelöscht werden
        if (currentNode == last)
        {
            last = prevNode;
        }

        if (prevNode != null)
        {
            prevNode.setNext(currentNode.getNext());
        }
    }
}
