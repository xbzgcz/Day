
/**汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，
 * 就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，
 * 即“XYZdefabc”。是不是很简单？OK，搞定它！ **/
class Folution {
    public String LeftRotateString(String str,int n) {
        String x="";
        if(str==null)
            return x;
        if(n==0 ||str.length()==1||str.length()==n)
            return str;
        if(str.length()<n)
            return x;
        String a=str.substring(n);
      String b=a.concat(str.substring(0,n));
      return b;
    }
}
public class Gs {
    public static void main(String[] args) {
        String str="";
        Folution a=new Folution();
        System.out.println( a.LeftRotateString(str,0));
    }
}