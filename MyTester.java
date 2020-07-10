public class MyTester{
    
    // this is not to be submitted but here as an example of how you might
    // test your code as you write it
    
    
    public static void main(String[] args){
        Oracle o = new Oracle();
        // lets use a for loop to check to see if you ever get repeats
        for (int i=1;i<100;i++)
            System.out.println(o.getPattern())
        
        // now lets test the howManyBulls method for one example
        // you should try others!
        System.out.println(o.howManyBulls(o.getPattern));
        o.setPattern("1234");
        System.out.pritnln(o.howManyBulls("0135""))
                                          
        // you can test the homManyCows and other methods of your classes 
        // in similar ways!
        // Remember, always test while you write!                                  
                                       
    
    }
}
