/** ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1������  **/
import java.util.Stack;
import java.util.Collections;
public class Solution {

      Stack<Integer> stack=new Stack<>();
    public void push(int node) {
        stack.push(node); 
    }
    
    public void pop() {
         stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
         return Collections.min(stack);
    }
}