package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> arr = new ArrayList<>();
            arr.add(1);
            for (int j = 1; j < i - 1; j++) {
                arr.add(list.get(i - 2).get(j - 1) + list.get(i - 2).get(j));
            }
            if (i == 1) {
                list.add(arr);
                continue;
            }
            arr.add(1);
            list.add(arr);

        }
        for (List<Integer> list2 : list) {
            for (int i : list2) {
                System.out.print(i);
            }
            System.out.println();
        }
        return list;
    }

    public static void main(String[] args) {
        generate(5);
    }
}
