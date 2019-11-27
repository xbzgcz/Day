/*统计一个数字在排序数组中出现的次数。 */
class SDolution {
    public int GetNumberOfK(int [] array , int k) {
        if(array==null ||array.length==0)
            return 0;
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            if(k==array[i])
            sum++;
        }
        return sum;
    }
}
public class Day1_2 {
    public static void main(String[] args) {
      int[] array=new int[]{1,2,3,4,3};
      SDolution solution=new SDolution();
      solution.GetNumberOfK(array,3);
      System.out.print(solution.GetNumberOfK(array,3));


    }
}
