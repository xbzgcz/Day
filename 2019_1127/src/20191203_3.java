/** ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�
 * ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish������������ȴ������������˼�����磬��student. a am I������������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ���ȷ�ľ���Ӧ���ǡ�I am a student.����
 * Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô�� **/
class Folution {
    public String ReverseSentence(String str) {
        String b="";
        StringBuffer s=new StringBuffer();
        if(str==null ||str.length()==0)
            return b;
        if(str.contains(" ")==false)
            return str;
         String[] p=str.split(" ");
         //��str���ǿո��ʱ��
        if(p.length==0)
            return str;
          for (int i=p.length-1;i>=0;i--)
          {
              s.append(p[i]);
              if(i>0)
                  s.append(" ");
          }
          b=s.toString();
        return b;


    }
}
public class Gs {
    public static void main(String[] args) {
        String str=" i  o";
        Folution a=new Folution();
        System.out.println(a.ReverseSentence(str));
    }
}
