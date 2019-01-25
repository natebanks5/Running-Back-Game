
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author hoover
 */
class InitialFrame extends JFrame
{

    private InitialPanel cp;

    InitialFrame()
    {
        super("Tackle Breaker Game");
        cp = new InitialPanel();
        add(cp);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 700);
        setVisible(true);
        setResizable(false);
    }

    public InitialPanel getCp()
    {
        return cp;
    }

    public void setCp(InitialPanel cp)
    {
        this.cp = cp;
    }
}
