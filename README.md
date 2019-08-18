# coding-problems
Programming problems with solutions in java

[**AnyTwoListNumbersAddUpToK.java**](https://github.com/techieJarek/coding-problems/blob/master/AnyTwoListNumbersAddUpToK.java) - 
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

[**ArrayOfProducts.java**](https://github.com/techieJarek/coding-problems/blob/master/ArrayOfProducts.java) - 
Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

[**FizzBuzz.java**](https://github.com/techieJarek/coding-problems/blob/master/FizzBuzz.java) - 
Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".

[**FormLargestNumber.java**](https://github.com/techieJarek/coding-problems/blob/master/FormLargestNumber.java) - 
Write a function that given a list of non negative integers, arranges them such that they form the largest possible number. For example, given [50, 2, 1, 9], the largest formed number is 95021.

[**FibonacciNumbers.java**](https://github.com/techieJarek/coding-problems/blob/master/FibonacciNumbers.java) - 
Write a function that computes the list of the first 100 Fibonacci numbers. By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two. As an example, here are the first 10 Fibonnaci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.

[**NodeSerializer.java**](https://github.com/techieJarek/coding-problems/blob/master/NodeSerializer.java) -
Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree.

For example, given the following Node class

class Node:
    def __init__(self, val, left=None, right=None):  
        self.val = val  
        self.left = left  
        self.right = right  
The following test should pass:

node = Node('root', Node('left', Node('left.left')), Node('right'))
assert deserialize(serialize(node)).left.left.val == 'left.left'

[**PerfectNumber.java**](https://github.com/techieJarek/coding-problems/blob/master/PerfectNumber.java) - 
A number is considered perfect if its digits sum up to exactly 10. Given a positive integer n, return the n-th perfect number. For example, given 1, you should return 19. Given 2, you should return 28.

[**FindTwoNumbersAddingToTarget.java**](https://github.com/techieJarek/coding-problems/blob/master/FindTwoNumbersAddingToTarget.java) - 
Given an array of integers, return indices of the two numbers such that they add up to a specific target.You may assume that each input would have exactly one solution, and you may not use the same element twice

[**AddTwoNumbersAsLinkedLists.java**](https://github.com/techieJarek/coding-problems/blob/master/AddTwoNumbersAsLinkedLists.java) - 
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Example:
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

[**LongestSubstringWithoutRepeatingCharacters.java**](https://github.com/techieJarek/coding-problems/blob/master/LongestSubstringWithoutRepeatingCharacters.java) - 
Given a string, find the length of the longest substring without repeating characters.

[**BreadthFirstSearch.java**](https://github.com/techieJarek/coding-problems/blob/master/BreadthFirstSearch.java) -
Print the nodes in a binary tree level-wise. For example, the following should print 1, 2, 3, 4, 5.
<pre>
  1
 / \
2   3
   / \
  4   5
</pre>

[**CanABeShiftedToBecomeB.java**](https://github.com/techieJarek/coding-problems/blob/master/CanABeShiftedToBecomeB.java) - 
Given two strings A and B, return whether or not A can be shifted some number of times to get B.
For example, if A is abcde and B is cdeab, return true. If A is abc and B is acb, return false.

[**LongestPalindromicSubstring.java**](https://github.com/techieJarek/coding-problems/blob/master/LongestPalindromicSubstring.java)
Given a string s, find the longest palindromic substring in s.

[**ReverseInteger.java**](https://github.com/techieJarek/coding-problems/blob/master/ReverseInteger.java)
Given a 32-bit signed integer, reverse digits of an integer.
