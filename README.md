Set of simple algorithms

1. Euclidean algorithm

In mathematics, the Euclidean algorithm, or Euclid's algorithm, is an efficient method for computing the greatest 
common divisor (GCD) of two numbers, the largest number that divides both of them without leaving a remainder. 

2. Find duplicates in a list

Single-loop implementation

3. Files in directory

Collects all files in directory beginning from the path.
If file is directory, then new iteration begins.

4. Calculate sum of numbers in string

Calculates sum of numbers in a given string. Check, if string is numeric.

5. Mathematical induction

Mathematical induction is a mathematical proof technique.
It is essentially used to prove that a property P holds for every natural number n, i.e. for n = 0, 1, 2, 3, and so on.

Nicomachus theorem:

1^3 = 1;
2^3 = 3 + 5;
3^3 = 7 + 9 + 11;
4^3 = 13 + 15 + 17 + 19;
5^3 = 21 + 23 + 25 +27 + 29.

Using this theorem we can prove that 1^3+2^3+3^3+4^3+5^3 = (1+2+3+4+5)^2.

6. Logarithms

a. to find a solution for y = log2(x) where 1 < x < 2 using shifts, sums and differences.
b. shortest way to find a solution for y = log(x) any base.

7. DrMatrix number pyramid

9 * 0 + 1 = 1;
9 * 1 + 2 = 11;
...
9 * n + (n + 1) = 1(n + 1)

and then:

0 * 10 + 1 = 1;
1 * 10 + 2 = 12;
2 * 10 + 3 = 123;
...
x * 10 + (x + 1) = 1...x where x <= 9.

8. Permutations

A permutation, also called an “arrangement number” or “order,” is a rearrangement of the elements of an ordered list S into a one-to-one correspondence with S itself.

a. Basic algorithm: remove. O(n!)

Pick the first element from the n items, the second from the remaining (n-1) items, the third from the remaining (n-2) items 
and so on. This gives a total of n * (n - 1) * (n - 2)... * 2 * 1 items. This is the definition of n!.

b. Narayana's algorithm. O(n^2)

Find the largest index k such that a[k] < a[k + 1]. If there is no such index, the permutation given is the last permutation (and the LeetCode problem requests we return the array sorted). We find the index out of place to stop this being the last permutation.
Find the largest index i greater than k such that a[k] < a[i]. Find the element in the right-hand side of the array.
Reverse the elements beginning at index k. Start from the beginning.

9. Find sum in array

a. find two first elements in array sum of which is equals to 0.
a.1. find with recursion - O(n^2);
a.2. find with binary search - O(log2).
