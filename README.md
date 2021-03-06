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

[**LongestPalindromicSubstring.java**](https://github.com/techieJarek/coding-problems/blob/master/LongestPalindromicSubstring.java) - 
Given a string s, find the longest palindromic substring in s.

[**ReverseInteger.java**](https://github.com/techieJarek/coding-problems/blob/master/ReverseInteger.java) - 
Given a 32-bit signed integer, reverse digits of an integer.

[**NeedleInAHaystack.java**](https://github.com/techieJarek/coding-problems/blob/master/NeedleInAHaystack.java) - 
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

[**MissingRanges.java**](https://github.com/techieJarek/coding-problems/blob/master/MissingRanges.java) - 
Given a sorted integer array where the range of elements are [0, 99] inclusive, return its
missing ranges.
For example, given [0, 1, 3, 50, 75], return [“2”, “4->49”, “51->74”, “76->99”]

[**PalindromeNumber.java**](https://github.com/techieJarek/coding-problems/blob/master/PalindromeNumber.java) - 
Determine whether an integer is a palindrome. Do this without extra space.

[**MergeTwoSortedLists.java**](https://github.com/techieJarek/coding-problems/blob/master/MergeTwoSortedLists.java) - 
Merge two sorted linked lists and return it as a new list. The new list should be made by
splicing together the nodes of the first two lists.

[**ValidateBST.java**](https://github.com/techieJarek/coding-problems/blob/master/ValidateBST.java) - 
Given a binary tree, determine if it is a valid Binary Search Tree (BST).

[**MaximumDepthOfBinaryTree.java**](https://github.com/techieJarek/coding-problems/blob/master/MaximumDepthOfBinaryTree.java) - Given a binary tree, find its maximum depth.

[**MinimumDepthOfBinaryTree.java**](https://github.com/techieJarek/coding-problems/blob/master/MinimumDepthOfBinaryTree.java) - Given a binary tree, find its minimum depth.

[**BalancedBinaryTree.java**](https://github.com/techieJarek/coding-problems/blob/master/BalancedBinaryTree.java) - Given a binary tree, determine if it is height-balanced.

[**SingleNumber.java**](https://github.com/techieJarek/coding-problems/blob/master/SingleNumber.java) - Given a non-empty array of integers, every element appears twice except for one. Find that single one.

[**ValidParentheses.java**](https://github.com/techieJarek/coding-problems/blob/master/ValidParentheses.java) - Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and
"([)]" are not.

[**AppleOrchardTree.java**](https://github.com/techieJarek/coding-problems/blob/master/AppleOrchardTree.java) -  A girl is walking along an apple orchard with a bag in each hand. She likes to pick apples from each tree as she goes along, but is meticulous about not putting different kinds of apples in the same bag. Given an input describing the types of apples she will pass on her path, in order, determine the length of the longest portion of her path that consists of just two types of apple trees.

[**SerializeDeserializeBST.java**](https://github.com/techieJarek/coding-problems/blob/master/SerializeDeserializeBST.java) - Design an algorithm to serialize and deserialize a binary search tree.

[**UniquePaths.java**](https://github.com/techieJarek/coding-problems/blob/master/UniquePaths.java) - A robot is located at the top-left corner of a m x n grid. The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid. How many possible unique paths are there?

[**RangeSumOfBST**](https://github.com/techieJarek/coding-problems/blob/master/RangeSumOfBST.java) - Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive). The binary search tree is guaranteed to have unique values.
