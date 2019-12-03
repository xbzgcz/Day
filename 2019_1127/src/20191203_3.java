/** 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
 * 同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。
 * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？ **/
class Folution {
    public String ReverseSentence(String str) {
        String b="";
        StringBuffer s=new StringBuffer();
        if(str==null ||str.length()==0)
            return b;
        if(str.contains(" ")==false)
            return str;
         String[] p=str.split(" ");
         //当str都是空格的时候
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
