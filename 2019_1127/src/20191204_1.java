import java.util.Arrays;

/** LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)
 * ...他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,
 * 如果抽到的话,他决定去买体育彩票,嘿嘿！！“红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子....
 * .LL不高兴了,他想了想,决定大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。
 * 上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。LL决定去买体育彩票啦。
 * 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何，
 * 如果牌能组成顺子就输出true，否则就输出false。
 * 为了方便起见,你可以认为大小王是0。 **/
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
