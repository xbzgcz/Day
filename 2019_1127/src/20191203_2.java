
/**�����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵�����
 * �������ַ���ģ�����ָ���������������һ���������ַ�����S���������ѭ������Kλ������������
 * ���磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ����
 * ����XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨���� **/
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