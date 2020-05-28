package UE4_BookingQueue_Loesung;

public class BookingQueue
{
    private Node front;
    private Node rear;

    public Node getFront()
    {
        return this.front;
    }

    public void enqueue(Booking newBooking)
    {
        Node newNode = new Node(newBooking);

        if (front == null)
        {
            front = newNode;
            rear = newNode;
        }
        else
        {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public Booking dequeue() throws QueueEmptyException
    {
        if (front == null)
        {
            throw new QueueEmptyException();
        }

        Booking firstBooking = front.getBooking();

        if (front == rear)
            rear = null;

        front = front.getNext();

        return firstBooking;
    }

    public int getCount()
    {
        int counter = 0;
        Node currentNode = front;

        while (currentNode != null)
        {
            currentNode = currentNode.getNext();
            counter++;
        }

        return counter;
    }
}
