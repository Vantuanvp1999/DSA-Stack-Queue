public class Solution {
    Queue queue = new Queue();
    public void enqueue(int data) {
        Node newNode = new Node(data);
      if(queue.front == null){
          queue.front = queue.rear=newNode;
      }
      else{
          queue.rear.link=newNode;
          queue.rear=newNode;
      }
    }
    public void dequeue() {
        if(queue.front == null){
            System.out.println("Queue is empty");;
        }
        if(queue.front == queue.rear){
            queue.front = queue.rear=null;
        }
        else{
            queue.front = queue.front.link;
            queue.rear = queue.front;
        }
    }
    public void displayQueue() {
        if(queue.front == null){
            System.out.println("Queue is empty");;
            return;
        }
        Node temp = queue.front;
        while(temp != null){
            System.out.println(temp.data+" ");
            temp = temp.link;
        }
        System.out.printf("");
    }
}
