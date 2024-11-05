public class ReverseAnArray {
    public static void main(String[] args) {
        System.out.println("Begin");
        int[] nums = {23,12,1,2,13,19,34,8,0};
        for(int i : nums){
            System.out.print(i + " ");
        }
        System.out.println("\n");
        ReversingAnArray obj = new ReversingAnArray();
        obj.reverse(nums);
        for(int i : nums){
            System.out.print(i + " ");
        }
    }
    
}

class ReversingAnArray{
    public void reverse(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }
}
