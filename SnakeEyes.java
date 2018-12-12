
/**
 * The program simulates 
 *
 * @author Captain Espada
 * @version 26-Nov
 */
public class SnakeEyes
{
    public static void main(String[] args) {
        int firstDie, secondDie; // pair of dice
        int count = 0; // number of rolls
        boolean snakeEyes = false;
       
        // Roll Dice 
        do {
            firstDie = (int)(Math.random()*6) + 1;
            secondDie = (int)(Math.random()*6) + 1;
            count++;
        }
        while (firstDie != 1 || secondDie != 1);
        
        System.out.printf("Your first die comes up %d\n", firstDie);
        System.out.printf("Your second die comes up %d\n", secondDie);
        System.out.printf("WOOHOO!!! You took %d rolls to get Snake Eyes\n", count); // Output # of rolls it took to get snake eyes
        System.out.println();
    }
}
