class CircularQueue {

    int[] CQueue;
    int Front;
    int Rear;
    int capacity;

    CircularQueue(int size) {
        CQueue = new int[size];
        this.Front = -1;
        this.Rear = -1;
        this.capacity = size;

    }

    // To check Queue is Full or Not

    public boolean isFull() {

        if (Front == 0 && Rear == capacity - 1) {
            return true;
        } else if (Front == Rear + 1) {
            return true;
        }
        return false;
    }

    public void Enqueue(int value) {
        if (isFull()) {
            System.out.println("Your Queue is Full");
        } else {
            if (Front == -1) {
                Front = 0;
            }
            Rear = (Rear + 1) % capacity;
            CQueue[Rear] = value;

        }

    }

    public void display() {
        int i;
        for (i = Front; i != Rear; i = (i + 1) % capacity) {
            System.out.print(CQueue[i] + "\t");
        }
        System.out.print(CQueue[i] + "\t");
    }

}

public class test6 {

    public static void main(String[] args) {
        CircularQueue c = new CircularQueue(5);
        c.Enqueue(10);
        c.Enqueue(100);
        c.Enqueue(10);
        c.Enqueue(10000);
        c.Enqueue(50);

        c.display();

    }

}
