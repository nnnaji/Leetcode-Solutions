import java.sql.DriverManager.println

/***
 * approach:
 * A negative number isn't a palindrome
 * Store the number in a variable for comparison with the reversed number
 * Reverse the number
 * Return true if the reversed number and number are same
 */

class Palindrome {

    fun isPalindrome(x: Int): Boolean {
        //check that x is not a negative value
        if (x < 0) {
            return false
        }
        // store the number in a variable
        var number = x

        // store the reverse number in a variable
        var reverse = 0
        while (number > 0) {
            reverse = reverse * 10 + number % 10
            number /= 10
        }
        return x == reverse
    }
}