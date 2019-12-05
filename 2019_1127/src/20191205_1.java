/**��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ�
 * ������ĳЩ�������ظ��ģ�����֪���м����������ظ��ġ�Ҳ��֪��ÿ�������ظ����Ρ�
 * ���ҳ�����������һ���ظ������֡�
 *  ���磬������볤��Ϊ7������{2,3,1,0,2,5,3}����ô��Ӧ������ǵ�һ���ظ�������2�� **/
import java.util.LinkedList;
class Folution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    ����Ҫ�ر�ע��~���������ظ���һ������ֵduplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(length==0 ||numbers==null||length==1)
            return false;
        LinkedList<Integer> a=new LinkedList<>();
        int c=0;
          a.add(numbers[0]);
            for(int i=1;i<length;i++) {
                if((a.contains(numbers[i]))==false)
                    a.add(numbers[i]);
                else {
                    duplication[0]=numbers[i];
                    c++;
                    break;
                }
            }
        if (c==1)
            return true;
        else
            return false;

    }
}
public class Gs {
    public static void main(String[] args) {
        int numbers[] =new int[]{1,2,3,2,4};
        int length=numbers.length;
        int [] duplication = new int[1];
        Folution a=new Folution();
        System.out.println(a.duplicate(numbers,length,duplication));
    }
}
