import java.sql.SQLOutput;

public class Operator {

    /**
     * Write a program that declares an integer a variable x,
     * assigns the value 2 to it, and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
     * Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
     * Before printing the results, write a comment with the predicted decimal value and binary string.
     * Now, print out x in decimal form and in binary notation.
     * Perform the preceding exercise with the following values:
     * 9
     * 17
     * 88
     */
    //left shift operator (<<)
    public void leftshift() {
        //step1 :
        int x = 2;
        System.out.println("Binary String version of the number " + Integer.toBinaryString(x));
        x = x << 1;
        //Perdicted Decimal Value:4 Binary Value=100
        System.out.println("Decimal Value: " + x);
        System.out.println("After shifting left by 1 Binary String version of the number " + Integer.toBinaryString(x));
        //Step2:
        int y = 9;
        System.out.println("Binary String version of the number " + Integer.toBinaryString(y));
        x = y << 1;
        //Perdicted Decimal Value:4 Binary Value=100
        System.out.println("Decimal Value: " + y);
        System.out.println("After shifting left by 1 Binary String version of the number " + Integer.toBinaryString(y));
        int z = 17;
        System.out.println("Binary String version of the number " + Integer.toBinaryString(z));
        z = x << 1;
        //Perdicted Decimal Value:4 Binary Value=100
        System.out.println("Decimal Value: " + z);
        System.out.println("After shifting left by 1 Binary String version of the number " + Integer.toBinaryString(z));
        int z1 = 88;
        System.out.println("Binary String version of the number " + Integer.toBinaryString(z1));
        z1 = z1 << 1;
        //Perdicted Decimal Value:4 Binary Value=100
        System.out.println("Decimal Value: " + z1);
        System.out.println("After shifting left by 1 Binary String version of the number " + Integer.toBinaryString(z1));
    }

    /**
     * Write a program that declares a variable x, and assigns 150 to it,
     * and prints out the binary string version of the number.
     * Now use the right shift operator (>>) to shift by 2 and assign the result to x.
     * Write a comment indicating what you anticipate the decimal and binary values to be.
     * Now print the value of x and the binary string.
     * Perform the preceding exercise with the following values:
     * 225
     * 1555
     * 32456
     */
    public void rightshift() {
        int x = 150;
        System.out.println("Original X " + x);
        System.out.println("Binary String version of the number " + Integer.toBinaryString(x));
        x = x >> 2;
        //Perdicted Decimal Value:37 Binary Value=10010110
        System.out.println("Decimal Value: " + x);
        System.out.println("After shifting left by 1 Binary String version of the number " + Integer.toBinaryString(x));
        //Perdicted Decimal Value:56 Binary Value=11100001
        x = 225;
        System.out.println("Original X " + x);
        System.out.println("Binary String version of the number " + Integer.toBinaryString(x));
        //Perdicted Decimal Value:388 Binary Value=110000100
        x = 1555;
        System.out.println("Original X " + x);
        System.out.println("Binary String version of the number " + Integer.toBinaryString(x));
        x = x >> 2;
        System.out.println("Decimal Value: " + x);
        System.out.println("After shifting left by 1 Binary String version of the number " + Integer.toBinaryString(x));
        //Perdicted Decimal Value:8114 Binary Value=1111110110010
        x = 32456;
        System.out.println("Original X " + x);
        System.out.println("Binary String version of the number " + Integer.toBinaryString(x));
        x = x >> 2;
        System.out.println("Decimal Value: " + x);
        System.out.println("After shifting left by 1 Binary String version of the number " + Integer.toBinaryString(x));
    }

    /**
     * Write a program that declares three int variables: x, y, and z.
     * Assign 7 to x and 17 to y.
     * Write a comment that indicates what you predict will be the result of the bitwise and operation on x and y.
     * Now use the bitwise AND (&) operator to derive the decimal and binary values, and assign the result to z.
     */
    // Bitwies AND
    public void bitwiseAndDemo() {
        int x = 7;
        int y = 17;
        System.out.println("Binary String version of the number " + Integer.toBinaryString(x));
        System.out.println("Binary String version of the number " + Integer.toBinaryString(y));
        //Perdicted Decimal Value:1 Binary Value=1
        int z = x & y;
        System.out.println("Binary String version of the number " + Integer.toBinaryString(z));
        System.out.println("Decimal Value: " + z);
    }

    /**
     * Now, with the preceding values,
     * use the bitwise and operator to calculate the “or” value between x and y.
     * As before, write a comment that indicates what you predict the values to be before printing them out.
     */
    public void bitwiseOrDemo() {
        //Perdicted Decimal Value:23 Binary Value=10111
        int x = 7;
        int y = 17;
        System.out.println("Binary String version of the number " + Integer.toBinaryString(x));
        System.out.println("Binary String version of the number " + Integer.toBinaryString(y));
        int z = x | y;
        System.out.println("Binary String version of the number " + Integer.toBinaryString(z));
        System.out.println("Decimal Value: " + z);
    }

    /***
     * Write a program that declares an integer variable,
     * assigns a number,
     * and uses a postfix increment operator to increase the value.
     * Print the value before and after the increment operator
     */
    public void postfixDemo() {
        int x = 7;
        System.out.println("Before incresing X value " + x);
        x++;
        System.out.println("After increasing X value " + x);
    }

    /**
     * Write a program that demonstrates at least three ways to increment a variable by 1
     * and does this multiple times.
     * Assign a value to an integer variable,
     * print it,
     * increment by 1,
     * print it again, increment by 1, and then print it again.
     */
    public void incrementDemo() {
        int x = 7;
        System.out.println("Original X value " + x);
        x++;
        System.out.println("1St time After increasing X value " + x);
        x = x + 1;
        System.out.println("2nd time After increasing X value " + x);
        ++x;
        System.out.println("3rd time After increasing X value " + x);
    }

    /**
     * Write a program that declares two integer variables: x, and y,
     * and then assigns 5 to x and 8 to y.
     * Create another variable sum and assign the value of ++x added to y,
     * and print the result. Notice the value of the sum (should be 14).
     * Now change the increment operator to postfix (x++) and re-run the program.
     * Notice what the value of the sum is. The first configuration incremented x,
     * and then calculated the sum, while the second configuration calculated the sum, and then incremented x.
     */
    public void Demo() {
        int x = 5;
        int y = 8;
        int sum = (++x) + y;
        System.out.println("Sum of X and Y value " + sum);
        int sum1 = (x++) + y;
        System.out.println(" x: " + x + " y: " + y + " Sum1 " + sum1);

    }

}
