/*
 * The least positive residue and modular arithmetic is essential for understanding modern cryptography.

Say that you have a positive integer such as 14. Call it the modulus. Say you have another integer such as 18. The least positive residue of 18 modulo 14 is the smallest positive integer k such that 18 = a*14 + k.

So in this case, the least positive residue is 4 because 1*14 + 4 = 18. This is often written 18 mod 14 ≡ 4

The least positive residue of 45 with modulus 14 is 3 because 3*14 + 3 = 14. This is often written 45 mod 14 ≡ 4

The least positive residue of 30 with modulus 10 is 0 because 3*10 + 0 = 30. This is often written 30 mod 10 ≡ 0

For any integer, the least positive residue modulus M is one of the integers 0 .. M-1.

The least positive residue is always positive. The least positive residue of -17 with modulus 14 is 11 because -2*14 + 11 = -17. This is often written -17 mod 14 ≡ 11

The least positive residue of -25 with modulus 10 is 5 because -3*10 + 5 = -25. This is often written -25 mod 10 ≡ 5

For an argument A, and modulus M, to get the least positive residue keep subtracing M from A until the result is in the range 0 .. M-1 or keep adding M to A until the result is in the range 0 .. M-1.

Recursively:

leastRes( A, M ) =
  A, if A is in the range 0..M-1
  A-M, if A is equal or larger then M
  A+M, if A is less than zero  
Write a program that asks the user for the modulus M and then keeps asking for the argument A and writing out A (mod M). End the program when the user enters the same A twice in a row.

For extra insight, use your program to compute the following:

leastRes( 1734*595*347, 23 )

leastRes( 1734, 23 )*leastRes( 595, 23 )*leastRes( 347, 23 )

leastRes( leastRes( 1734, 23 )*leastRes( 595, 23 )*leastRes( 347, 23 ), 23 )
 */
public class LeastPositiveResidue {
    public static long leastRes(int a, int m){
        if( a >= 0 && a <= m - 1){
            return a;
        }
        else if( a >= m){
            return leastRes(a - m, m);
        }
        else{
            return leastRes(a + m, m);
        }
    }

    public static void main(String[] args){
        System.out.println(leastRes(1734,23 ) );
    }
}
