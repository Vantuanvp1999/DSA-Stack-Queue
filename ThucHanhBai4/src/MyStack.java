public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;
    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }
    public boolean isFull(){
        if(index == size){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(index == 0){
            return true;
        }
        return false;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("Stack is full");
        }else{
            arr[index] = data;
            index++;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
            return arr[--index];


    }
    public int size(){
        return index;
    }
}
