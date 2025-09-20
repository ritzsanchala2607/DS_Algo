package 255ImplementStackUsingQueue;

//using 2-queue

class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
    q1=new LinkedList<>();   
    q2=new LinkedList<>(); 
    }
    
    public void push(int x) {
            while(q1.size()>0){
                q2.add(q1.remove());
            }
            q1.add(x);
            while(q2.size()>0){
                q1.add(q2.remove());
            }
    }
    
    public int pop() {
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}


// using 1-queue 

class MyStack {
    Queue<Integer> q1;

    public MyStack() {
    q1=new LinkedList<>();   
    }
    
    public void push(int x) {
        int len=q1.size();
        q1.add(x);
        if(len>0){
            int n=len;
            while(n>0){
                q1.add(q1.remove());
                n--;
            }
        }
    }
    
    public int pop() {
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}