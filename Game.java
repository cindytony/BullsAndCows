import java.util.Scanner;
public class Game{

    private int turns;                               
    private Oracle computer;
    private Scanner input;

    // you may need more instance variables here                                 
    private boolean gameFinished;                                 //We need a variable that expects when the game is over
    //private boolean end;
    public Game(){
    // your code for the Game constructor goes here
        turns = 0;                                                 // "turns" originally = 0
        computer = new Oracle();
        input = new Scanner(System.in);                               
        gameFinished = false;                                        //set default false to this 
    }


    
    public void playGame(){
    // your code for the Game playGame method goes here
        char c;
        while (true) {                                                     //while the user wants to play, don't break
            playOneTurn();
            if (gameFinished) {
                break;
            }
            System.out.println("Continue? Please enter y or n:  ");
            c = input.next().charAt(0);                                       //scan input "y" or "n"
            if (c == 'n') {
                break;
            }
        }        
        System.out.println("\n ==> User's  total number of attempts: " + turns);           //I have a question: why we cannot 
                                                                                         // use %n instead of \n
        // System.out.println(computer.getPattern());
        //String again;    
    }

    
    
    public void playOneTurn(){
    // your code for the Game playOneTurn method goes here
        String guess = getInput();
        int bulls = computer.howManyBulls(guess);
        int cows = computer.howManyCows(guess);
        computer.checkNum();
        System.out.println("Computer answers: " + bulls + " bulls and " + cows + " cows");
        turns++;
        if (bulls == guess.length()) {                                                 //user's guesses all right
            gameFinished = true;
        }
    }

    
    
    
    public void setPattern(String solution){
    // This method is complete. Don't touch it.
    // it is here to allow us and you to test your code. 
    // You should only use this method to help you test
    // your code while developing.
        computer.setPattern(solution);
    }

    
    
    
    public String getPattern(){
    // This method is complete. Don't touch it.
    // This method is here to allow us and you
    // to test your code. You should only use 
    // this method to help you test your code
    // while you are developing your program.
        return computer.getPattern();
    }



    // any other methods you may need go here
    private String getInput(){                                       //we need a getInput method
        int i;
        String str = "";
        boolean notStop = true;                                       //we set default true to notStop
                                                                       // looping until getting the right input from user
        do{  System.out.println("Please enter a 4-digit number to guess: ");
            str = input.next();
            if (str.length() == 4) {
                for (i = 0; i < str.length(); i++) {
                    if (!Character.isDigit(str.charAt(i))) break;                   
                                                  }
                if (i == 4)  notStop = false;                           //this is when all digits are right and in righ places
                                   }
            } 
        while (notStop);
        return  str;
    }

}
