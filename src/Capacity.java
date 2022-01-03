public class Capacity {
    public static void main(String[] args) {
        int [] consecutiveOnesArray = new int[]{1,1,0,1,1,1};

       System.out.println( findMaxConsecutiveOnes(consecutiveOnesArray));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        // Hint: Initialise and declare a variable here too
        int counter = 0; //For keeping count of 1's
        int max = 0;
        // keep track of how many 1's you've seen in a row.
        for (int i : nums) {
            // Do something with element nums[i].
            if(i == 1){
                counter++;
            }else{
            if (counter > max) {
                max = counter;
            }
                if(max >= (nums.length)/2){
                    return  max;
                }
                counter = 0;
            }


        }
        return Math.max(max,counter);
    }
}