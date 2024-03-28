/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;

/**
 *
 * @author michael.roy-diclemen
 */
public class ZooSim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Animal  pig = new LandAnim("Pig", "Pig", true, 5, 3, " hok howk ");
        Animal  cow = new LandAnim("Cow", "Cow", true, 7, 5, " mooh ");
        Animal  cat = new LandAnim("Cat", "Cat", false, 2, 7, " meaoaw ");
        Animal  dog = new LandAnim("Dog", "Dog", true, 2, 5, " wooif ");
        Animal  kangaroo = new LandAnim("Kangaroo", "Kangaroo", false, 5, 9, "");
        Animal  catFish = new WaterAnim("Catfish", "Catfish", false, 2, 5, "");
        Animal  parrot = new BirdAnim("Parrot", "Parrot", true, 1, 6, " 哟哟哟这不摇摆阳吗，几天不见这么拉了 ");
        Animal  ostrich = new Animal("Ostrich", "Ostrich", false, 5, 9, "");
        Animal  monkey = new Animal("Monkey", "Monkey", false, 3, 4, " ooh augh ");
         
       
        
        Animal animalArray[] = {pig, cow, cat, dog, kangaroo, catFish, parrot, ostrich, monkey};
        
        Zoo tester = new Zoo(animalArray);
        tester.displayZooStatistics();
        tester.feedAllAnimals();
        tester.sleepAllAnimals();
        tester.moveAllAnimals();
    }
    
    //How would you modify this structure to allow for predator/prey interactions and Carnivores/Omnivores/Herbivores
    /*
    use boolean to detect if the animals can eat meat for each animal.
    create a method that compares two animal objects when they interact. 
    if both eat meat or both don't, nothing happens. If one eats meat and one doesn't, the one that doesn't dies. 
    
    can use methods for each interaction so the system can decide the fate of the animal
    using the boolean makes it easy to compare.
    */
    
}
