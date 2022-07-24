# **Anagrams**
Two words are anagrams of each other if you can rearrange the letters of one word to create the other. For example, "stare" is an anagram of "tears".

We define an "anagram group" to be a set of strings that are all anagrams of each other. For example, {art, tar, rat} is an anagram group.

Define a nested static class called AnagramGrouper that sorts a list of strings into anagram groups. You should do this by creating a map, where the value is a set of words that are anagrams of each other (the "anagram group"), and the key is a string of the letters for those words sorted in alphabetical order. For example, if we are given the list [art, hi, cheap, rat, peach, tar], we would create the following key -> value pairs in our map:


art -> {art, tar, rat}
acehp -> {cheap, peach}
hi -> {hi}
The constructor for AnagramGrouper should take in an array (or list) of strings and build the map of anagram groups. AnagramGrouper should have one public method, getNumberOfAnagrams, that takes in a string and returns the number of anagrams of that word that are contained in AnagramGrouper.

This problem is adapted from a 2008 AP Computer Science exam problem.

Starter Code
This problem has optional starter code - you are welcome to use it or try the problem on your own. Fill in the TODOs to complete the solution.

## Input
The first line of the input contains T: the number of test cases.

The second line of the input contains a comma-separated list of words. These are the words that should be used to create an AnagramGrouper.

The remaining lines contain the test cases. Each test case consists of a single word on its own line.

## Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting at 1), and y is the number of anagrams of the given word that are present in the input list.

## Sample
![Screen Shot 2022-07-24 at 12 59 28 PM](https://user-images.githubusercontent.com/105678095/180658110-7957db89-8142-4478-8e23-77c11ca5a1a7.png)
