package Arrays.Easy;

public class PlusOne {

    public static void shift(int[] m, int index, int size) {
        for (int i = size - 1; i > index; i--) {
            m[i] = m[i - 1];
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n;
        for (int i = 0; i < n; i++) {
            Boolean flag = true;
            for (int j = 0; j < m; j++) {
                if (nums2[i] < nums1[j]) {
                    shift(nums1, j, m + 1);
                    System.out.println(i);
                    nums1[j] = nums2[i];
                    if (m != k) {
                        m++;
                    }
                    flag = false;
                    break;
                }
            }
            if (flag) {
                nums1[m] = nums2[i];
                m++;
            }
        }
        for (int i : nums1) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = new int[] { 2, 5, 6 };
        merge(nums1, 3, nums2, 3);
    }
}
