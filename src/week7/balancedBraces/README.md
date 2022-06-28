# **Balanced Braces (week 7, assignment 2)**

Instructions:

Read lines from System.in until there are no more lines.

For each line read, output "valid" or "invalid"

Each line consists of arbitrary characters. You can ignore all characters that are not braces.

Braces include:

"(", which is closed by ")" "[", which is closed by "]" "{", which is closed by "}" "<", which is closed by ">" Output "valid" if the braces on that line are correctly nested, so that each open brace is closed by its corresponding closing brace, and braces are nested "( ( () ) )", not interleaved: "( [ ) ]"

For each line, output "valid" if every open symbol in the set "( [ { <" it has a matching corresponding closing symbol ") ] } >", and they are not interleaved; else output "invalid".

i.e,

"()[]" is valid, "([])" is valid, "(cite[24])" is valid, but

"([)]" and "(" are invalid. You can implement this using a stack. One possible implementation uses a StringStack; another uses a Stack.

Copy your Stack implementation (or StringStack implementation) from assignment 1 or assignment 2 to here, and use it.

One way to solve this is to write a function:

public static boolean isValid(String line, String opens, String closes) which takes a line of the input, and returns whether that line is balanced.

Note that this method also takes two additional Strings, a list of open braces and a list of closed braces.

It's helpful to be able to turn a String variable "line" into an array of char, which you can do with:

> line.toCharArray()
