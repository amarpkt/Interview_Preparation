// package Day_1;

public class SecondLargest {
    public static void main(String[] args) {
        System.out.println("begin");
        int[] nums = {23,12,1,2,13,19,34,8,0};

        SecondLargestFind obj = new SecondLargestFind();
        int result = obj.find2ndLarget(nums);
        System.out.println(result);


    }
}

class SecondLargestFind{
    public static int find2ndLarget(int[] arr){
        int first = Integer.MIN_VALUE;
        int Second = Integer.MIN_VALUE;

        for (int num : arr){
            if(num > first){
                // System.out.print(num + " ");
                Second = first;
                first = num;
            }else if (num > Second && num < first){
                Second = num;
            }
        }
        return Second;

    }
}
