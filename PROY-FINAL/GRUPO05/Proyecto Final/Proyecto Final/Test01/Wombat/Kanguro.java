import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kanguro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kanguro extends Actor
{
    /**
     * Act - do whatever the Kanguro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int y=getY();
        
        if(Greenfoot.isKeyDown("right"))
            move(1);
        
        if(Greenfoot.isKeyDown("left"))
            move(-1);
        
        if(Greenfoot.isKeyDown("up"))
            y--;
            
        if(Greenfoot.isKeyDown("down"))
            y++;
        
        if(Greenfoot.isKeyDown("F1"))
            turn(-1);
        
        if(Greenfoot.isKeyDown("F2"))
            turn(1);
        
        
        setLocation(getX(), y);
             
    }    
    
    public void comer()
    {
        Actor Gusano;
        Gusano = getObjectsAtOffset(0,0, Gusano.class);
       
        
        
        
    }    









}
