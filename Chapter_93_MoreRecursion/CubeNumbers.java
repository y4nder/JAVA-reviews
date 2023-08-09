/*
Exercise 1
Write a program that implements this definition of cube numbers (for positive integers):

cube(1) = 1
cube(N) = cube(N-1) + 3*(square(N)) - 3*N + 1
Implement the square() method using this definition given in the exercises for chapter 91 (also for positive integers):

square(1) = 1
square(N) = square(N-1) + 2*N - 1
Make a complete program similar to PyramidTester.java given in the chapter.

Extra: The math-like definition of square(N) does not work for negative N because the recursive step asks for square(N-1), which for negative integers is a harder problem than the original. For example, square( -5 ) asks for square( -6 ).

For a definition of square(N) that works for negative integers (only) do this:

(N+1)2 = N2 + 2N + 1 

N2 = (N+1)2 - 2N -1
Create a similar definition for cube(N) that works for negative integers. Write cube(N) that works for negative integers (only).

Extra, Extra: Write cube(N) that works for all integers, negative, positive, and zero. Hint: use an if-statement and three base cases.
 */

public class CubeNumbers {
    public static int cube(int n){
        if(n == 1) return 1;
        else{
            return cube(n-1) + 3 * (square(n)) - 3 * n + 1;
        }
    }

    public static int square(int n){
        if(n == 1) return 1;
        else{
            return square(n - 1) + 2 * n - 1;
        }
    }
    
    public static void main(String[] args){
        System.out.println(cube(2));
    }
}
