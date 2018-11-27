/*Author:Merlin
 *Program Name:name of public class
 *Describtion:A random number will be generated and players should gusse it
 */
package guessing.game;

import java.util.*;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char option;
        System.out.println("Do you want to play the game?");
        option=input.next().charAt(0);
        do{ 
        if(option=='y'||option=='Y'){
            Random rand=new Random();
            int number=rand.nextInt(128)+1;
            int guesses=0;
            while(guesses!=number){
                System.out.print("Guessing a number:");
                guesses=input.nextInt();
            if(guesses>number){
                System.out.println("your guesse is higher");
            }
            if(guesses<number){
                System.out.println("your guesse is lower");
            }
            System.out.println("try again");
            }
            System.out.println("CONGRATULATIONS!\nyou are right");
            System.out.println("Do you want to play again?");
            option=input.next().charAt(0);
        }   
        }while(option=='y'||option=='Y');
         input.close();
    }
}
