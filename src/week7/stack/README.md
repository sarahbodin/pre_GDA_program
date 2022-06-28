# **Stack (week 7, assignment 1)**

Instructions:

A Stack is a last-in, first-out ("LIFO") collection. This means that the element that we "pop" off the Stack is always the last element we "push"ed into the Stack. As we add more elements, existing elements are "psuhed down" the Stack.

Example

    StringStack s = new StringStack();  // internally, the stack looks like this, with the "top" of the stack to the left: []
    s.push("a")                         // stack: ["a"]             "a" is the top and only stack eleemnt
    s.push("b")                         // stack: ["b", "a"]        "b" is now the top element
    s.push("a")                         // stack: ["c", "b", "a"]   "c" is now the top element
    String popped = s.pop()             // stack: ["b", "a"], popped = "c"
    String peeked = s.peek()            // stack: ["b", "a"], peeked = "b"
Implement the class StringStack class (using one of the two options explained below).

YOU HAVE TWO OPTIONS for implementing StringStack:

Option 1 (easier): Just implement the StringStackImpl Class, by writing the four methods it implements. These four methods are listed in the interface: push, peek, pop, size.

Option 2 (slightly more difficult, requires some knowledge of Java Generics): If you're comfortable with Java Generics, implement the StackImpl class, then (trivially) implement StringStackImpl as a subclass of StackImpl.

Now, implement the static main method, and exercise your Stack:

Create a StringStackImpl object, which we'll refer to below as "the stack". Then read strings from System.in, as long as System.in has Strings to read.

Input and Output
For each string read,

if the string read is "peek" (case insensitive), so "Peek", "pEEk", etc. also qualify,

print out the top element of the stack followed by a newline.
Or, if it's "pop" (case insensitive), pop the stack and print the popped element.

Or, if it's "size", print out the Stack's size, followed by a newline.

Or, if a Stack Underflow occurs -- or would occur --, print "SU", followed by a newline.

Or, if it's anything else, push the string read onto the stack, and print out the stack size, followed by a newline.

<img width="805" alt="Screen Shot 2022-06-28 at 2 21 15 PM" src="https://user-images.githubusercontent.com/105678095/176254834-be968929-2ca2-4b81-bc68-dfd1e63ceb7f.png">

