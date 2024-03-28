/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author denneyzhang
 */
public class BirdAnim extends Animal implements IFlyable{
    
    Boolean canFly = true;
    private int zPosition = 0;

    public BirdAnim(String name, String species, boolean sex, int size, int speed, String sound) {
        super(name, species, sex, size, speed, sound);
        
    }
    
    /**
     *increases the z position of animal
     */
    public void fly() {
        zPosition += this.getSpeed();
    }

    /**
     *resets the z position of animal
     */
    public void land() {
        zPosition = 0;
    }

    /**
     *detects if the animal is in the air or not
     * @return returns if the animal is in the air or not
     */
    public boolean isFlying() {
        return (zPosition > 0);
    }
    
    
}
