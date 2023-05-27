package Stack;
import java.util.*;
public class Push_At_Bottom {
    public static void pushAtBottom(Stack<Integer>list , int n){
        if(list.isEmpty()){
            list.push(n);
            return;
        }
        int top = list.pop();
        pushAtBottom(list,n);
        list.push(top);

    }
    public static void main(String args[]){
        Stack<Integer> list = new Stack<>();
        list.push(1);
        list.push(2);
        list.push(3);
        pushAtBottom(list,4);

        while(!list.isEmpty()){
            System.out.println(list.pop());

        }
    }
}
