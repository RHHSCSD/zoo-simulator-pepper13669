/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;
//import Java.math;
/**
 *
 * @author denneyzhang
 */
public class Animal implements IEntity{
    
    private int xPosition;
    private int yPosition; 
    private int id;
    private String name;
    private String species;
    private boolean sex; //if female, = true
    private int size;
    private int speed; //between 3-10
    private int direction = 0; //in degrees
    private int hunger = 100;
    private int fatigue = 100;
    //private ????? image;
    private String sound;
    

    //set specs of animal in the persepective of a zoo keeper

    /**
     * constructor of the animal object
     * @param name name
     * @param species type of animal
     * @param sex gender
     * @param size size of animal
     * @param speed speed of animal 
     * @param sound sound of animal
     */
    public Animal(String name, String species, boolean sex, int size, int speed, String sound){
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.size = size;
        this.speed = speed;
        this.sound = sound;
       
    }
    
    /**
     *constructor for most basic animal name
     * @param name name
     */
    public Animal(String name){
        this.name = name;
    }
    
    /**
     *prints the animal sound onto the screen
     */
    public void makeSound(){
        System.out.println(sound);
    }
    
    /**
     *moves the animal according to the direction in angles and the speed of the animal
     */
    public void move(){
        double directionInRad = Math.toRadians(direction); //since cos only takes radians, but direction is in degrees
        
        double xPositionMovement = speed * Math.cos(directionInRad);
        xPosition += xPositionMovement; //int
        
        double yPositionMovement = speed * Math.sin(directionInRad);
        yPosition += yPositionMovement;
        
        System.out.println(name + " moved " + xPositionMovement + " units in x position and " + yPositionMovement + " units in y position. ");
    }
    
    /**
     * refills the animal's hunger and prints a confirmation
     */
    public void eat(){
        hunger = 100;
        System.out.println(name + " ate food.");
    }
    
    /**
     *refills the animal's fatigue status and prints a confirmation
     */
    public void sleep(){
        fatigue = 100;
        System.out.println(name + " sleeped. ");
    }
    
    /**
     *changes the animal direction
     * @param turnDegrees the degrees that the animal will be turned, 
     */
    public void turn(int turnDegrees){
        direction += turnDegrees;
    }
    
    /**
     *  places the animal (relocate coordinate entirely) and returns the position
     * @param x x position
     * @param y y position
     * returns the resultant x and y position 
     */
    public void place(int x, int y){
        xPosition = x;
        yPosition = y;
        System.out.println("X Position: " + x + " Y Position: " + y);
    }
    
    /**
     *gets speed of animal
     * @return speed
     */
    public int getSpeed(){
        return speed;
    }

    /**
     * moves the animal
     * @param x x component of movement
     * @param y y component of movement 
     */
    @Override
    public void move(int x, int y) {
        xPosition += x;
        yPosition += y;
    }
    
    /**
     * used to display statistics of animal
     * @return string representation of animal
     */
    public String toString(){
        return("Name: " + name + " Hungerness: " + hunger + " Fatigue: " + fatigue);
    }
    
    /**
     * used to get hungerness of animal
     * @return hunger number
     */
    public int getHunger(){
        return hunger;
    }
    
    /**
     *used to get how tired the animal is
     * @return fatigue number
     */
    public int getFatigue(){
        return fatigue;
    }
    

    
}
