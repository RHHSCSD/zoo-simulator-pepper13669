/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author denneyzhang
 */
public class OtherZooObj implements IObject{
    private int direction = 0;
    private int xPosition;
    private int yPosition;
    private String type;
    private int size;

    /** 
     * turns object
     * @param degrees number of degrees wanted to be turned
     */
    @Override
    public void turn(int degrees) {
        direction += degrees;
    }

    /**
     * places (resets) location of object
     * @param x new x position
     * @param y new y position
     */
    @Override
    public void place(int x, int y) {
        xPosition = x;
        yPosition = y;
    }
    
}
