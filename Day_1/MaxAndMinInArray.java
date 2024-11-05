public class MaxAndMinInArray{
    public static void main(String[] args) {
    
        // System.out.println("Hello");

        int[] nums = {12,1,2,0,13,19,34,8,0};
        MaxMinArray obj = new MaxMinArray();
        int[] arr2 = obj.findMaxMin(nums);

        System.out.println("max: " + arr2[0]);
        System.out.println("min: " + arr2[1]);


    }

}

class MaxMinArray{
    public int[] findMaxMin(int[] arr){
        int max = arr[0];
        int min = arr[0];

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        return new int[]{max,min};
    }
}
