//Isabelle S
//Natalie B

import java.util.Scanner;
class Craps {
    public static void main(String[] args) {
        Scanner kin = new Scanner(System.in);
        int Dice1 = (int)((Math.random()*6) +1);
        int Dice2 = (int)((Math.random()*6) +1);

        System.out.println("Let's Play craps");
        System.out.println("");
        int x = (Dice1 + Dice2);
        System.out.println("First Roll: " + x);

        
        if (x == 7 || x == 11){
            System.out.println("You Win");
        }
        if (x == 2 || x == 3 || x == 12) {
            System.out.println("You lose");
        }
        if (x == 4 || x==5 || x==6 || x==8 || x==9 || x==11) {
            
            Dice1 = (int)((Math.random()*6) +1);
            Dice2 = (int)((Math.random()*6) +1);
            
            int z = -1;
            while (z != 7 && z != x) {
                System.out.println("Roll Again");
                Dice1 = (int)((Math.random()*6) +1);
                Dice2 = (int)((Math.random()*6) +1);
                
                z = (Dice1 + Dice2);
                System.out.println("Next Roll " + z);
                
                if (z == 7) {
                    System.out.println("You lose!");
                }
                
                if (z == x) {
                    System.out.println("You Win!");
                
                }
                    
                
            }
        }
    }
}



        

	
	
 
