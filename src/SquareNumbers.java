/***
 * Looping through Array
 */
public class SquareNumbers {

    public static void main(String[] args) {

        //Writing into numbers Array

        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            int squareNumber = (i + 1) * (i +1);
            numbers[i] = squareNumber;
        }
        //Elegant way of reading items inside numbers Array
            for(int square: numbers){
                System.out.println(square);
            }
    }
}
