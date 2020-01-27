import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BirdIcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BirdIcon extends Actor
{
    /**
     * Act - do whatever the BirdIcon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BirdIcon() {
        getImage().scale(190,190);
    }
    public void act() 
    {
         if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MyWorld());
        }
    }    
}
