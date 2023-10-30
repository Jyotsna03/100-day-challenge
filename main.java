public class main {
    public static void main(String[] args) {
        int [] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target =19;
        int ans = linearSearch(nums, target);
        System.out.println(" the target found is at index: " + ans);
        
    }

    static int linearSearch(int[] arr,int target) {
        if (arr.length == 0) {
            return -1;

        }
        // return target;

        for (int index = 0; index < arr.length; index++) {
            //check element at every index
            int element =arr[index];
            if(element==target){
                return index;

            }  
        }
        return -1;

    }
}
