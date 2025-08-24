import java.util.*;
class MyStack {
    Queue<Integer> Q1=new LinkedList<>();
    Queue<Integer> Q2=new LinkedList<>();
    
    public MyStack() {
        
    }
    
    public void push(int x) {
       if(Q1.isEmpty() && Q2.isEmpty())Q1.add(x);

       else if(Q1.isEmpty())Q2.add(x);
       else Q1.add(x);
    }
    
    public int pop() {
        if(Q2.isEmpty() && Q1.isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        else if(Q2.isEmpty()){
            while(Q1.size()!=1){
            Q2.add(Q1.remove());
            }
            return Q1.remove();
        }
            while(Q2.size()!=1){
            Q1.add(Q2.remove());
            }
            return Q2.remove();
        
    }
    
    public int top() {
       if(Q2.isEmpty() && Q1.isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        else if(Q2.isEmpty()){
            while(Q1.size()!=1){
            Q2.add(Q1.remove());
            }
           int k=Q1.remove();
            Q2.add(k);
            return k; 
        }
        
            while(Q2.size()!=1){
            Q1.add(Q2.remove());
            }
            int k=Q2.remove();
            Q1.add(k);
            return k;
        
    }
    
    public boolean empty() {
        if(Q2.isEmpty() && Q1.isEmpty())
        return true;
        
        return false;
    }
}
