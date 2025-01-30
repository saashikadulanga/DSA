/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rabbitfibonacci;

/**
 *
 * @author User
 */
public class RabbitFibonacci {
    public static int rabbitPairs(int months){
        if (months == 0 || months == 1){ // Base case - No of rabbits in the month 0 or 1 
            return 1;
        }
        return rabbitPairs(months - 1) + rabbitPairs(months - 2);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int months = 12;
        System.out.println("Number of rabbit pairs after "
        + months + " month(s) is "
        + rabbitPairs(months));
    }
    
}
