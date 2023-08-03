this chapter talks about Big Integers
CHAPTER 56 — Big Integer
Sometimes you need to compute with very large numbers. The primitive type int is only 32 bits, which limits the size of integers to plus-or-minus 231, roughly plus-or-minus two billion. The primitive type long is 64 bits, but sometimes even this is too limited. Especially in cryptography and other number theory applications you need integers of unlimited size.

This chapter discusses the class BigInteger which implements arbitrary-precision integers. This means integers, both positive and negative, can be of any magnitude.

BigIntegers are not required for the AP Java test.

Chapter Topics:
BigInteger
toString
add, subtract
multiply, divide
remainder, mod
equals, compareTo
pow
