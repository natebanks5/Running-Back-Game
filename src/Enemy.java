
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
public class Enemy extends RunningBack
{

    private Rectangle e1 = new Rectangle();
    private Rectangle e2 = new Rectangle();
    private Rectangle e3 = new Rectangle();

    public Enemy()
    {
        setDefaultBounds();
    }

    public void setDefaultBounds()
    {
        getE1().setBounds(new Rectangle(500, 400, 70, 70));
        getE2().setBounds(new Rectangle(700, 10, 70, 70));
        getE3().setBounds(new Rectangle(900, 220, 70, 70));
    }

    public void move(int x, int rbY, Rectangle enemy)
    {

        if (x > enemy.getX())
        {
            enemy.x++;
        }
        if (x < enemy.getX())
        {
            enemy.x--;
        }
        if (rbY > enemy.getY())
        {
            enemy.y++;
        }
        if (rbY < enemy.getY())
        {
            enemy.y--;
        }

    }

    /**
     * @return the e1
     */
    public Rectangle getE1()
    {
        return e1;
    }

    /**
     * @param e1 the e1 to set
     */
    public void setE1(Rectangle e1)
    {
        this.e1 = e1;
    }

    /**
     * @return the e2
     */
    public Rectangle getE2()
    {
        return e2;
    }

    /**
     * @param e2 the e2 to set
     */
    public void setE2(Rectangle e2)
    {
        this.e2 = e2;
    }

    /**
     * @return the e3
     */
    public Rectangle getE3()
    {
        return e3;
    }

    /**
     * @param e3 the e3 to set
     */
    public void setE3(Rectangle e3)
    {
        this.e3 = e3;
    }

}
