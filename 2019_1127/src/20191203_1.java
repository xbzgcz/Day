import java.util.Arrays;
import java.util.Stack;
/**һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�  **/
class Folution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length==2)
        {
            num1[0]=array[0];
            num2[0]=array[1];
        }
        else{
            Stack<Integer> a=new Stack<>();
        Arrays.sort(array);
        int c = 0;
        int i=0;
        while (i<array.length-1){
            if(array[i]==array[i+1])
                i+=2;
            else {
                c++;
                int s= array[i];
                a.add(s);
                i++;
            }
            if(c==2) {
                break;
            }
            if(c==1 && i==array.length-1)
            {
                a.push(array[i]);
                c++;
            }
            if(c==0 && i==array.length-2)
            {
                 a.push(array[i]);
                 a.push(array[i+1]);
            }
        }
            num2[0]=a.pop();
            num1[0]=a.pop();
    }

    }
}


public class Gs {
    public static void main(String[] args) {
        int[] array=new int[]{0,4};
        int[] num1=new int[]{0};
        int[] num2=new int[]{0};
        Folution a=new Folution();
        a.FindNumsAppearOnce(array,num1,num2);
    }
}
