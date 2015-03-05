*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cycle;

/**
 *
 * @author nl2027
 */
public class Cycle {

    /**
     * @param args the command line arguments
     */
    private final int numberOfWheels;   //declares variables
    private final int weight;
    
    Cycle(int weight, int numberOfWheels) // parallels with the new variable stated in CycleTest
            //constructor
    {
        this.numberOfWheels = numberOfWheels; //recieves variable from cycleTest
        this.weight = weight;                  // ^^
        
                
    }
   public String toString()
    {
        
        return "\nNumber of wheels: " + numberOfWheels + "\nWeight: " + weight + "\n";
                

        
       
    }
}