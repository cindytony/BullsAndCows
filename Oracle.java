import java.util.Random;
public class Oracle{
    
    private String pattern;
    private int [] num1;                         
    private int [] num2;                           
    

    public Oracle(){
    // your code here for setting up
    // an Oracle object
        num1 = new int[4];
        num2 = new int[4];
        for (int i = 0; i < num1.length; i++) {
            num1[i] = 0;
            num2[i] = 0;
        }
        pattern = "";
        int t;
        int [] intArray = new int [4];
        for (int i = 0; i < 4; i++) {
            intArray[i] = (int) (Math.round(Math.random() * 10) % 10);
            for (int j = 0; j < i; j++) {
                if (intArray[i] == intArray[j]) {
                    i--;
                    break;
                }
            }
        }
        
        for (int i = 0; i < intArray.length; i++)       pattern += intArray[i] ;

    }

    
    public void setPattern(String solution){
    // This method is complete. Don't touch it.
    // This method is here to allow us and you
    // to test your code. You should only use 
    // this method to help you test your code
    // while you are developing your program.
        pattern = solution;
    }

    
    public String getPattern(){
    // This method is complete. Don't touch it.
    // This method is here to allow us and you
    // to test your code. You should only use 
    // this method to help you test your code
    // while you are developing your program.
        return pattern;
    }

    
    
    public int howManyBulls(String guess){
    // your code here for
    // determining the number
    // of bulls the String
    // guess should earn
        int bulls = 0;
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == guess.charAt(i)) {
                num1[i] = 1;
                num2[i] = 1;
                bulls++;
            }
        }
        return bulls;
    }

    
    
    public int howManyCows(String guess){
    // your code here for
    // determing the number
    // of cows the String
    // guess should earn

        for (int i = 0; i < pattern.length(); i++) {
            for (int j = 0; j < pattern.length(); j++) {
                if (num2[j] == 0   &&   num1[i] == 0   &&   pattern.charAt(i) == guess.charAt(j)) {
                    num2[j] = 2;
                    num1[i] = 2;
                }
            }
        }
        int cows = 0;
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] == 2)  cows++;
        }
        return cows;    
    }

    
    
    // any other methods you might want
    // in this class can go here
    public void checkNum(){
        for (int i = 0; i < num1.length; i++) {
            num1[i] = 0;            
            num2[i] = 0;            
        }
    }

} //END OF THE CLASS

    
    
    
    
    
    
    
    
    
    
    
    
    
    
// SCRATCH PAPER - PLEASE IGNORE 
    

//     private String pattern;
//     private int [] num1; // maching on pattern string
//     private int [] num2; // matching on guess string
//     public Oracle(){
//     // your code here for setting up
//     // an Oracle object
    
    
    
    
    
    
    
    
/*
//         int secretNumber1 = (int) (Math.random()*10);
//         int secretNumber2 = (int) secretNumber1;


//         while(secretNumber2 == secretNumber1){
//             secretNumber2 = (int) (Math.random()*10);
            
//         }
//         int secretNumber3 = secretNumber2;
//         while((secretNumber3 == secretNumber2) || secretNumber3 == secretNumber1){
//             secretNumber3 =(int) (Math.random()*10);
            
//         }
//         int secretNumber4 = secretNumber3;
//         while((secretNumber4 == secretNumber3) || secretNumber4 == secretNumber3 || 
//               secretNumber4 == secretNumber2 || secretNumber4 == secretNumber1) secretNumber4 = (int)(Math.random()*10);
//         pattern = Integer.toString(secretNumber1)+Integer.toString(secretNumber2)+
//             Integer.toString(secretNumber3)+Integer.toString(secretNumber4);
//             */    
    

    
    
    
    
        /*    int result = 0;
        for (int i = 0; i < guess.length(); i++) {
            int pos = guess.indexOf(pattern.charAt(i));
            if (pos != -1 && pos == i)  result++;
        }
        return result;
     */
    
    
    
    
    
    
    
    
    //     public static void main (String[] args) {
//         Oracle o = new Oracle(); 
//         System.out.println(o.getPattern());
        
//     }
    
    

    
    
    
    
    
    //         int result = 0;
//         for (int i = 0; i < guess.length(); i++) {
//             int pos = guess.indexOf(pattern.charAt(i));
//             if (pos != -1 && pos != i) result++;
//         }
//         return result;








//     public static void main(String[] args) {
//         Oracle o = new Oracle();
//         o.setPattern("3691");
//         System.out.println("bulls " + o.howManyBulls("4211") + " cow " + o.howManyCows("4211"));
        
//     } 
