/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author denneyzhang
 */
public class WaterAnim extends Animal implements ISwimmable{
    private int negZPosition = 0;
    private boolean canBreath = false; //fish don't usually breath (at negZPosition = 0)... 

    public WaterAnim(String name, String species, boolean sex, int size, int speed, String sound) {
        super(name, species, sex, size, speed, sound);
    }
    
    
    /**
     * detects if you are allowed to return to the surface or not
     * @return true or false related to your z position in the water
     */
    @Override
    public boolean canSurface() {
        return (negZPosition > 0);
    }
    
}
