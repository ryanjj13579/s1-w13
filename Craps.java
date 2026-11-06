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
        if (roll1 == 2 || roll1 == 3 || roll1 == 12 )
            return 0;
        else if (roll1 == 7 || roll1 == 11)
            return 1;
        else {
            int point = roll1;
            r.roll();
            roll1 = r.total();
            while(roll1 != r.total()){
                r.roll();
                if (roll1 == 7){
                    return 1;
                }
            }
        }
        return 1;
    }    
    
    //simulate play to see your odds of winning
    public int tester(int howMany)
    {
        int win = 0;
        for (int i = howMany; i <= howMany; i++){
            if (play() == 1)
                win++;
        }
        return win;
        
    }
    public static void main(String[] args) {
        Craps c = new Craps();
        System.out.println(c.tester(100000));
    }
}
