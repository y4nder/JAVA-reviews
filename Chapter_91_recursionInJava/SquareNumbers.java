/*
 * Write a program that implements this definition of square numbers:

square(1) = 1
square(N) = square(N-1) + 2N -1
Make a complete program similar to TriangleTester.java given in the chapter.


Aside: where did this crazy definition of square come from?

Easy: this is just algebra:

(N-1)2 = N2 - 2N + 1
rearrange to get:

 N2    = (N-1)2 + 2N - 1
Another way to think of this is a square number gives the total number of pins in a square arrangement of pins with N pins on a side. Draw a square with four dots (pins) on a side. Then expand the square so that it has five dots on a side. Using your picture, explain why the recursive definition of square numbers is correct.

Square numbers are also mentioned in the quiz for this chapter.
 */
public class SquareNumbers {
    public static int square(int num){
        if(num == 1){
            return 1;
        }
        else{
            return square(num - 1) + (num * 2) - 1;
        }
    }

    public static void main(String[] args){
        System.out.println(square(9));
    }
}
