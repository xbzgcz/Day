/** дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ��+��-��*��/����������š� **/
import java.util.Scanner;
import static java.lang.StrictMath.addExact;

class Folution {
        public int Add(int num1,int num2) {
            int a=addExact(num1,num2);
            return a;
    }
}
public class Gs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        Folution a=new Folution();
        System.out.println(a.Add(x,y));
    }
}
