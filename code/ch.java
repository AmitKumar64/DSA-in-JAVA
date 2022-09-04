public class ch {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 4 };
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

    static int missingNumber(int[] nums) {
        int sum = 0, size = nums.length;
        for (int x = 0; x < size; x++) {
            sum += nums[x];
        }
        return (size * (size + 1) / 2) - sum;
    }
}
