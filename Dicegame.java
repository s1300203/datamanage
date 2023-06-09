import java.util.Random;

public class Dicegame{
    public static void main(String[] args){
	Random rand = new Random();  

    int num1 = rand.nextInt(6) + 1;
    int num2 = rand.nextInt(6) + 1;

    int total = num1 + num2;

    System.out.println("Die 1:"+num1);
    System.out.println("Die 2:"+num2);
    System.out.println("Total value:" +total);
    if(total >= 7){
        System.out.println("You win");
        }
        else{
        System.out.println("You loss");
        }
    }
}