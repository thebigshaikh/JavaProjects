package arrays;

public class secondMax {
    public static void main(String[] args) {
        int[] nums= new int[]{5,9,4,2,7,7,8};
        int max1 = nums[0];
        int max2 = 0;

        for(int n:nums){
            if (n > max1){
                max2 = max1;
                max1 = n;
            }

            if ( max2 < n && n< max1){
                max2 = n;
            }
        }
        System.out.println(max2);

    }
}
