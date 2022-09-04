class searcharr{
    public static void main(String[] args){
        int[] nums = {23,445,345,6547,243,2,34,5,6};
        int find = 2;
        int ans = value(nums, find);
        System.out.println(ans);
    }

    static int value(int[] arr, int find){
        if (arr.length == 0){
            return -1;
        }

        for (int i=0 ; i < arr.length ; i++){
            int var = arr[i];
            if (i == find){
                return var;
            }
        }
        return -1;
    }
}