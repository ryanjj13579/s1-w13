public class Craps
{
    DiceRoll r;
    
    public Craps()
    {
        r = new DiceRoll ( );
    }

    // Returns 0 if lose, 1 if win
    public int play ( ) {
        r.roll();
        int roll1 = r.total();
        if (r.total() == 2 || r.total() == 3 || r.total() == 12 ){
            return 0;
        else if (r.total() == 7 || r.total() == 11)
            return 1;
        else{
            r.roll();
            while (r.total() != roll1 && r.total() != 7){

                r.roll();
                
                }
        }
    }
    
    
    //simulate play to see your odds of winning
    public void tester(int howMany)
    {
    
    }
}
