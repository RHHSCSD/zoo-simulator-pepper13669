/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author denneyzhang
 */
public class Zoo {
    
    Animal animalArray[];
    //constructor that doesn't really need anything

    /**
     *creates the zoo object
     * @param animalArray an array that stores all living animals
     */
    public Zoo(Animal[] animalArray){
        this.animalArray = animalArray;
    }
    
        //prints zoo statistics

    /**
     *displays all of the statistics of the zoo for each individual animal
     */
    public void displayZooStatistics(){
        int numHungry = 0;
        int numFatigue = 0;
        for (int i = 0; i < animalArray.length; i++){
            System.out.println(animalArray[i]);
            if (animalArray[i].getHunger() < 50){
                numHungry += 1;
            }
            if (animalArray[i].getFatigue() < 50){
                numFatigue ++;
            }
        System.out.println("Number of hungry animals: " + numHungry + " Number of tired animals: " + numFatigue);
        }
    }
    
    /**
     *feeds all animals in zoo
     */
    public void feedAllAnimals(){
        for (Animal a1 : animalArray) {
            a1.eat();
        }
    }
    
    /**
     * resets fatigue number of all animals in zoo
     */
    public void sleepAllAnimals(){
        for (Animal a1 : animalArray) {
            a1.sleep();
        }
    }
    
    /**
     * moves all animals in zoo based on their speed and orientation
     */
    public void moveAllAnimals(){
        for (Animal a1 : animalArray){
            a1.move();
        }
    }
    
    
}
