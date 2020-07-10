# BullsAndCows
Game Bulls And Cows

Write an application in Java that allows a user to play the game Bulls and Cows against a computer. The game works as follows: The computer chooses a 4-digit number in secret. The digits must all be different. The user then guesses the number and the computer provides the number of matching digits. If the matching digit is in the right position it is a "bull", if it is on a different position it is a "cow". For example:

Computer chooses: 3691

User guesses: 1649

Computer answers: 1 bull and 2 cows

If the user guesses a number with repeat digits that is partially correct the rule is that a correct digit can only count once and bulls count before cows. So for example

Computer chooses: 3691

User guesses: 4211

Computer answers: 1 bull and 0 cows

Your program should report the number of attempts the user needed to guess the number at the end of the game.

Design: The program must use the attached BullsandCows.java test class. This means that you must NOT write your own main method. Your code must work with the main method contained in BullsandCows.java

Your program should consist of two additional classes: Game and Oracle. All input and output should happen in the Game class. This is where you will ask the player for their guess and this is where you will tell the player how many bulls and cows they got. The Oracle class should store the actual computer choice as a String and have methods to determine how many bulls and cows any given guess would generate. I have provided templates for both of these classes. Notice that they each contain a set method and a get method for the solution pattern. These are to help us grade your code but also to help you test your code. Do not edit the setPattern or getPattern methods. Edit these templates by adding code to the other existing methods, creating new methods, and/or adding more instance variables. To earn full credit you are required to use these files and the test class file BullsandCows.java must remain unchanged.
