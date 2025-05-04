package Queue;

public class Test {
    public static void main(String[] args) {
        QueueWLinkedlist<String> Q = new QueueWLinkedlist<>();

        QueueWArray q = new QueueWArray(10);
        System.out.println(q.size());
        q.push(45);
        q.push(18);
        q.push(7);
        System.out.println(q.size());
        q.displayQ();
        q.pop();
        q.displayQ();

    }
}
