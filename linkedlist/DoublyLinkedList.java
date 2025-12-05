package linkedlist;

public class DoublyLinkedList {
    Dlnode head;
    Dlnode tail;

    public DoublyLinkedList()
    {
        this.head = null;
        this.tail = null;
 
    }
    
    public static void main(String[] args)
    {
    	DoublyLinkedList dll = new DoublyLinkedList();
    	dll.insertAtEnd(1);
    	dll.insertAtEnd(2);
    	dll.insertAtEnd(3);
    	dll.insertAtEnd(4);
    	dll.insertAtEnd(5);

        System.out.print("After insertion at tail: ");
        dll.display(dll.head);

        System.out.print("After insertion at head: ");
        dll.insertAtBeginning(0);
        dll.display(dll.head);

        dll.insertAtPosition(6, 2);
        System.out.print(
            "After insertion at 2nd position: ");
        dll.display(dll.head);

        dll.deleteAtBeginning();
        System.out.print(
            "After deletion at the beginning: ");
        dll.display(dll.head);

        dll.deleteAtEnd();
        System.out.print("After deletion at the end: ");
        dll.display(dll.head);

        dll.deleteAtSpecificPosition(2);
        System.out.print(
            "After deletion at 2nd position: ");
        dll.display(dll.head);
    }
    
    public void deleteAtEnd()
    {
        if (tail == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        Dlnode temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
    }
    
    public void delete(int pos)
    {
        if (head == null) {
            return;
        }

        if (pos == 1) {
            deleteAtBeginning();
            return;
        }

        Dlnode current = head;
        int count = 1;

        while (current != null && count != pos) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position wrong");
            return;
        }

        if (current == tail) {
            deleteAtEnd();
            return;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
        current.prev = null;
        current.next = null;
    }
    
    public void deleteAtBeginning()
    {
        if (head == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        Dlnode temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
    }
    
    public void insertAtBeginning(int data)
    {
        Dlnode temp = new Dlnode(data);
        if (head == null) {
            head = temp;
            tail = temp;
        }
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }
    
    public void insertAtPosition(int data, int position)
    {
        Dlnode temp = new Dlnode(data);
        if (position == 1) {
            insertAtBeginning(data);
        }
        else {
            Dlnode current = head;
            int currPosition = 1;
            while (current != null && currPosition < position) {
                current = current.next;
                currPosition++;
            }
            if (current == null) {
                insertAtEnd(data);
            }
            else {
                temp.next = current;
                temp.prev = current.prev;
                current.prev.next = temp;
                current.prev = temp;
            }
        }
    }
    
    public void insertAtEnd(int data)
    {
        Dlnode temp = new Dlnode(data);
        if (tail == null) {
            head = temp;
            tail = temp;
        }
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }
    
    public void traverseForward()
    {
        Dlnode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    // Traversing from tail to the head
    public void traverseBackward()
    {
        Dlnode current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
    }
    
    void deleteAtSpecificPosition(int pos)
    {
        if (head == null) {
            return;
        }

        if (pos == 1) {
            deleteAtBeginning();
            return;
        }

        node current = head;
        int count = 1;

        while (current != null && count != pos) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position wrong");
            return;
        }

        if (current == tail) {
            deleteAtEnd();
            return;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
        current.prev = null;
        current.next = null;
    }

    void display(Dlnode head)
    {
        Dlnode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    
}


class Dlnode {
    int data;
    Dlnode prev;
    Dlnode next;

    public Dlnode(int data)
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}