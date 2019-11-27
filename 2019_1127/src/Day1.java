/**在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.    **/
 class Solution {
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() <= 0 || str.length() > 10000)
                return -1;
            if (str.length() == 1)
                return 0;
            int c = 0;
            int a = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                    c++;
                    a = i;
                    break;
                }
        }
        if (c == 1)
            return a;
        else
            return -1;
    }
}
    public class Day1 {
        public static void  main(String[] args) {
            String str = "CCTV";
            Solution solution = new Solution();
            solution.FirstNotRepeatingChar(str);
            System.out.print( solution.FirstNotRepeatingChar(str));
        }
    }
