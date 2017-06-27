## COMS S1004
## Assignment 5
## Due June 29 at 11:59PM 
_________________________________________

 

### PROBLEM SET (40 points)  

**Be sure to read all of the instructions provided here.**  

Do the following exercises in Schneider and Gersting   (Same problem numbers in 6th and 7th Editions) : 

(10 points each) Chapter 12: 22, 27, 28, 37  

For problems 22, 25, and 28 you must provide both the instruction set AND the state diagrams for the Turing machines you create.
You can check your work at the following website:   

[http://morphett.info/turing/turing.html](http://morphett.info/turing/turing.html)
  
  
Notice that the format of the instructions on this site is slightly different than those presented in class and in your textbook. In fact there are two differences:  

1. The starting state is 0 instead of 1
2. The positions of direction and new state are switched.  

Here's the format required for the online simulator: 
<current state> <current symbol> <new symbol> <direction> <new state>
These instructions may be listed in a text file with each instruction on it's own line. For example the Turing Machine with instructions: (0,1,0,r,0), (0,0,1,r,0), (0,b,x,l,1)  would look like this:  
  
0    1    0    r    0  
0    0    1    r    0  
0    b    x    l    1  
  
Then you can copy and paste from your text file into the simulator to check your work. 

**What to hand in:** 

To aid in the timely grading of your work, in addition to the usual submission procedure for your problem set, please also submit a text file titled *TM.txt* with the instructions for the Turing machines you design for problems 22, 25, and 28 in the format described above.   
    
**Starter Problems (not for credit)**    
S&G Chapter 12: 5, 7, 8, 9, 11, 20  

**Recommended Problems (not for credit)**  
S&G Chapter 12: 24, 25, 29, 30, 31, 39, 40, ChallengeWork 1
Big Java Chapter 9: R9.1, R9.2, R9.6, R9.14

### PROGRAMMING (60 points)

**Scrabble Help:**  The file `dictionary.txt` contains all of the words in the Official Scrabble Player's Dictionary, Second Edition. (Note this list contains some offensive language.) Write a class, WordLists,  in Java that generates useful word lists for scrabble players using this list. 
 
Your class should contain the following methods:

* WordLists(String fileName):  a constructor that takes the name of the dictionary file as the only parameter.
* lengthN(int n):  returns an ArrayList of words (Strings) of length n.
* startsWith(int n, char firstLetter):  returns an ArrayList of words of length n beginning with the letter firstLetter
* containsLetter(int n, char included):  returns an ArrayList of words of length n containing the letter included but not beginning with it.
*multiLetter(int m, char included):  returns an ArrayList of words with at least m occurrences of the letter included.
 

Use the included template for your WordLists.java file. Write your own test class for your WordLists class that tries these methods out and writes the word lists (the ArrayLists of strings) to ***text*** files.

 
**What to hand in**:

A Template for the WordLists.java file is in the Assignment 5 workspace on Codio. You must add your own test class (separate file with main method) that tests each of your methods and writes the resutls to a text file. In addition to the source files  include a text file named readMe.txt with an explanation of how your program works. That is, write in plain English, instructions for using your software, explanations for how and why you chose to design your code the way you did. The readMe.txt file is also an opportunity for you to get partial credit when certain requirements of the assignment are not met.   
 

### Submitting your work:

For this assignment you should have three types of files: A single PDF file from the problem set named ProblemSet5.pdf, two .java files from the programming project, and several text files:  

 1. TM.txt  
 2. readMe.txt  
 3. dictionary.txt  
 4. any output txt files that your test class generates.

As always everything should be present in your Assignment 5 workspace. You must upload the ProblemSet5.pdf file onto the workspace. Once you have completed your assignment and uploaded the ProblemSet5.pdf file you just need to switch the completed switch on Codio.

### A word about Grading: 
Each question on the prblem set is worth 10 points. The programming portion of the assignment is worth 60 points and we will use the following guideline for awarding points:

* 30% if it compiles  
* 30% if it runs properly (expected output for given input, etc.)  
* 20% for style (formatting of code, variable names, comments, etc. Use the style guide posted on Coursworks!)  
* 20% for design (efficiency, short methods, etc.)  

Please make sure your program at least compiles before you submit it! There will be no partial credit for a program that "almost" compiles.



 



 

*(Thanks to Keith Schwartz and Julie Zelenski for making the dictionary.txt file available)