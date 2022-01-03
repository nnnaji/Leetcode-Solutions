public class EvenNumberDigits {

    public static void main(String[] args) {
        int [] nums = {12,3456,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int numOfEvenDigits = 0;

        for (int i = 0; i < nums.length; i++) {
            if (getNumberOfDigits(nums[i]) % 2 == 0) {
                numOfEvenDigits++;
            }
        }
        return numOfEvenDigits;

    }

    private static int getNumberOfDigits(int i) {
        int count = 0;
        while(i!= 0) {
            i /= 10;
            count++;
        }
        return count;
    }
}
