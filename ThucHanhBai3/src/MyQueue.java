public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize=0;
    public MyQueue(int capacity) {
        this.capacity = capacity;
        queueArr = new int[capacity];
    }
    public boolean isQueueFull(){
        boolean isFull = false;
        if(currentSize==capacity){
            isFull = true;
        }
        return isFull;
    }
    public boolean isQueueEmpty(){
        boolean isEmpty = false;
        if(currentSize==0){
            isEmpty = true;
        }
        return isEmpty;
    }
    public void enqueue(int item){
        if(isQueueFull()){
            System.out.println("Queue is full");
        }else {
            tail++;
            if(tail==capacity-1){
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Enqueued "+item);
        }

    }
    public void dequeue(){
        if(isQueueEmpty()){
            System.out.println("Queue is empty");

        }
        else {
            head++;
            if(head==capacity-1){
                System.out.println("removed "+queueArr[head-1]);
                head = 0;

            }
            else{
                System.out.println("dequeued "+queueArr[head-1]);
            }
            currentSize--;

        }
    }
    public void displayQueue(){
        if(currentSize==0){
            System.out.println("Queue is empty");
        }else{
            for(int i=head;i<=tail;i++){
                System.out.print(queueArr[i]+" ");
            }
        }
    }
}
