import java.util.Arrays;

/** LL���������ر��,��Ϊ��ȥ����һ���˿���,���������Ȼ��2������,2��С��(һ����ԭ����54��^_^)
 * ...��������г����5����,�����Լ�������,�����ܲ��ܳ鵽˳��,
 * ����鵽�Ļ�,������ȥ��������Ʊ,�ٺ٣���������A,����3,С��,����,��Ƭ5��,��Oh My God!������˳��....
 * .LL��������,��������,������\С �����Կ����κ�����,����A����1,JΪ11,QΪ12,KΪ13��
 * �����5���ƾͿ��Ա�ɡ�1,2,3,4,5��(��С���ֱ���2��4),��So Lucky!����LL����ȥ��������Ʊ����
 * ����,Ҫ����ʹ�������ģ������Ĺ���,Ȼ���������LL��������Σ�
 * ����������˳�Ӿ����true����������false��
 * Ϊ�˷������,�������Ϊ��С����0�� **/
class Folution {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length!=5||numbers==null)
            return false;
        for (int i=0;i<5;i++)
        for (int j=i+1;j<5;j++)
        {
            if(numbers[i]!=0){
                if(numbers[i]==numbers[j])
                {
                    int y=numbers[i];
                   // System.out.print(y);
                    return false;
                }
            }
        }
        Arrays.sort(numbers);
        int n=0;
        int b=0;
        while (n<5)
        {
            if(numbers[n]==0)
                b++;
            if(numbers[n]>0)
            break;;
            n++;
        }
        int c=0;
        if(b==4)
        {
           c++;
        }
        else if (b==3){
            if(numbers[4]<=(numbers[3]+4))
                c++;
        }
        else if(b==2){
            if(numbers[4]<=(numbers[2]+4))
                c++;
        }
        else if(b==1){
            if(numbers[4]<=(numbers[1]+4))
                c++;
        }
        else if(b==0)
        {
            if(numbers[0]+4==numbers[4])
                c++;
        }
        if(c==1)
            return true;
        else
            return false;


    }
}
public class Gs {
    public static void main(String[] args) {
        int [] numbers=new int[]{1,0,1,0,0};
        Folution a=new Folution();
        System.out.println(a.isContinuous(numbers));
    }
}
