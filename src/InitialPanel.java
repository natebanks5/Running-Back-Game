
import java.awt.BorderLayout;
import javax.swing.JPanel;

class InitialPanel extends JPanel
{

    private TopPanel tp = new TopPanel();
    private GamePanel gp = new GamePanel(tp);

    InitialPanel()
    {
        super();
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        add(tp, "North");
        add(gp);
    }

    /**
     * @return the gp
     */
    public GamePanel getGp()
    {
        return gp;
    }

    /**
     * @param gp the gp to set
     */
    public void setGp(GamePanel gp)
    {
        this.gp = gp;
    }

    /**
     * @return the tp
     */
    public TopPanel getTp()
    {
        return tp;
    }

    /**
     * @param tp the tp to set
     */
    public void setTp(TopPanel tp)
    {
        this.tp = tp;
    }

}
