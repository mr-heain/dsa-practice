import java.util.Scanner;

class Node_4 {          // Renamed Node -> Node_4
    int data;
    Node_4 next;        // Renamed Node -> Node_4

    public Node_4(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue_4 {
    Node_4 front, rear; // Renamed Node -> Node_4

    public void enqueue(int data) {
        Node_4 newNode = new Node_4(data);  // Renamed Node -> Node_4
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int data = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return data;
        }
    }

    public void display() {
        Node_4 temp = front;    // Renamed Node -> Node_4
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " " : "\n"));
            temp = temp.next;
        }
    }
}

public class Main_4 {
    public static void pl(Object p) { System.out.println(p); }
    public static void p(Object p)  { System.out.print(p);   }

    public static void main(String[] args) {
        Queue_4 queue = new Queue_4();
        Scanner sc = new Scanner(System.in);

        p("1.enqueue \n2.dequeue \n3.display \n4.exit\n");
        while (true) {
            p("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    p("Enter element to enqueue: ");
                    int data = sc.nextInt();
                    queue.enqueue(data);
                    break;
                case 2:
                    pl("Dequeued element: " + queue.dequeue());
                    break;
                case 3:
                    pl("Queue elements:");
                    queue.display();
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    pl("Invalid input");
            }
        }
    }
}