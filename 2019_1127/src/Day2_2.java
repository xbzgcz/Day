/* 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0 */
class Colution {
    public int StrToInt(String str) {
       if(str.length()==0||str==null )
           return 0;
       try{

            Integer integer= Integer.valueOf(str);
            return integer;
        }
       catch (NumberFormatException integer){
           return 0;
       }

    }
}
public class Day2_2 {
    public static void main(String[] args) {
     Colution colution=new Colution();
        System.out.println(colution.StrToInt("+1a33"));
    }
}
