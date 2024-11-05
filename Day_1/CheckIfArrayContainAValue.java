
// import static Demo.contains;

// package Day_1;

public class CheckIfArrayContainAValue {
    public static void main(String[] args) {
        System.out.println("Begin");
        int[] nums = {23,12,1,2,13,19,34,8,0};
        int target = 14;
        Demo obj = new Demo();
        boolean result = obj.contains(nums, target);
        System.out.println(result);
    }
}

class Demo{
    public static boolean contains(int[] arr, int target){
        for(int i : arr){
            if (i == target) return true;
        }
        return false;
    }
}
