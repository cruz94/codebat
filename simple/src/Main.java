import com.leetcode.TwoSum;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TwoSum ts = new TwoSum();
        int[] ints = ts.twoSum(new int[]{2, 7, 8, 0}, 9);
        System.out.println(Arrays.toString(ints));

//        StringReverse stringRev = new StringReverse();
//        System.out.println(stringRev.frontBack("code"));

//        countYZ count = new countYZ();
//        System.out.println(count.countYZ("!!day--yaz!!"));
    }
}

