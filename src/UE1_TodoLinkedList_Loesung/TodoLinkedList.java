package UE1_TodoLinkedList_Loesung;

public class   TodoLinkedList
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
        // Neuer Knoten erzeugt
        Node newNode = new Node(todoText);

        // Liste ist noch leer
        if (first == null)
        {
            first = newNode;
            last = newNode;
        }
        // Liste ist nicht leer
        else
        {
            // Der bisher letzte Knoten zeigt nun auf den neuen Knoten
            last.setNext(newNode);
            // Last muss neu gesetzt werden und zwar auf den neuen Knoten am Ende
            last = newNode;
        }
    }

    public void deleteLastTodoText()
    {
        // Nichts machen
        if (first == null)
            return;

        // Wenn first = last, dann gibt es nur ein Element
        if (first == last)
        {
            first = null;
            last = null;
        }
        else
        {
            // Vorgänger von last finden
            Node prevNode = first;

            while (prevNode.getNext() != last)
                prevNode = prevNode.getNext();

            prevNode.setNext(null);
            last = prevNode;
        }
    }

    public String getTodoTextAtIndex(int index)
    {
        int counter = 0;    // Info: counter/index startet bei 0 (nicht 1)
        Node currentNode = first;

        // Schleife, bis man an der gewünschten Stelle in der verlinkten Liste ist
        // Achtung: Index könnte auch ungültig (z.B. größer als die Anzahl an Elementen in der Liste) sein
        while (counter != index && currentNode != null)
        {
            currentNode = currentNode.getNext();
            counter++;
        }

        // Es könnte sein, dass man nichts gefunden hat. Dann null zurückliefern.
        if (currentNode == null)
            return null;
        else
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
