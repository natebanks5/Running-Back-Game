
import java.awt.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hoover
 */
public class RunningBack
{

    private Rectangle rb = new Rectangle();
    private Rectangle endzone = new Rectangle();
    private int rbX = 70;
    private int rbY = 275;
    private int score = 0;

    public RunningBack()
    {
        setDefaultLocation();
    }

    public void setDefaultLocation()
    {
        getRb().setBounds(new Rectangle(rbX, rbY, 70, 70));
        getEndzone().setBounds(new Rectangle(1103, 0, 91, 618));
    }

    public void resetRb()
    {
        rbX = 70;
        rbY = 275;
        getRb().setBounds(new Rectangle(rbX, rbY, 70, 70));
    }

    public void moveLeft()
    {
        if (getRbX() > 0)
        {
            setRbX(rbX - 5);
        }
    }

    public void moveUp()
    {
        if (getRbY() > 0)
        {
            setRbY(rbY - 5);
        }
    }

    public void moveRight()
    {
        if (rbX < 1200)
        {
            setRbX(rbX + 5);
        }
    }

    public void moveDown()
    {
        if (rbY < 550)
        {
            setRbY(rbY + 5);
        }
    }

    /**
     * @return the rb
     */
    public Rectangle getRb()
    {
        return rb;
    }

    /**
     * @param rb the rb to set
     */
    public void setRb(Rectangle rb)
    {
        this.rb = rb;
    }

    /**
     * @return the endzone
     */
    public Rectangle getEndzone()
    {
        return endzone;
    }

    /**
     * @param endzone the endzone to set
     */
    public void setEndzone(Rectangle endzone)
    {
        this.endzone = endzone;
    }

    /**
     * @return the rbX
     */
    public int getRbX()
    {
        return rbX;
    }

    /**
     * @param rbX the rbX to set
     */
    public void setRbX(int rbX)
    {
        this.rbX = rbX;
    }

    /**
     * @return the rbY
     */
    public int getRbY()
    {
        return rbY;
    }

    /**
     * @param rbY the rbY to set
     */
    public void setRbY(int rbY)
    {
        this.rbY = rbY;
    }

    /**
     * @return the score
     */
    public int getScore()
    {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score)
    {
        this.score = score;
    }

}
