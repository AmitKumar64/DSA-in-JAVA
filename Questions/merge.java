public class merge {
    public static void main(String[] args) {
        int[] num1 = { 1, 3 };
        int[] num2 = { 2, 4,5 };
        double answer = sorted(num1, num2);
        System.out.println(answer);
    }

   static double sorted(int[] nums1, int[] nums2) {
        int c = (nums1.length + nums2.length);
        int[] merge = new int[c];
        for (int i = 0; i < nums1.length; i++) {
            merge[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            merge[nums1.length + i] = nums2[i];
        }
        // double mid = c/ 2;
        // if (c % 2 == 0) {
            
        //     double anws = (merge[mid] + merge[mid + 1]) / 2;
        //     return mid;
        // } else {
        //     double ans = merge[mid];
        //     return mid;
        // }
    }
}
