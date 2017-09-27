
import java.awt.Color;
import java.util.Hashtable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSlider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hoover
 */
class TopPanel extends JPanel
{

    private JButton play = new JButton("Play");
    private JMenuBar myMenu = new JMenuBar();
    private JMenu jm1 = new JMenu("Select team");
    private JMenuItem jmi1 = new JMenuItem("PSU");
    private JMenuItem jmi2 = new JMenuItem("OSU");
    private JMenuItem jmi3 = new JMenuItem("PITT");
    private int tds = 0;
    private int fails = 0;
    private JLabel score = new JLabel("Score: " + getTds());
    private JLabel tackles = new JLabel("Fails: " + getFails());
    private JSlider speed = new JSlider();
    private Hashtable labelTable = new Hashtable();

    TopPanel()
    {
        super();
        setBackground(Color.BLUE);
        addItems();
    }

    private void addItems()
    {
        add(play);
        jm1.add(jmi1);
        jm1.add(jmi2);
        jm1.add(jmi3);
        myMenu.add(jm1);
        add(myMenu);
        add(score);
        add(tackles);
        speed.setMajorTickSpacing(10);
        speed.setMaximum(100);
        speed.setMinimum(20);
        speed.setValue(100);
        speed.setInverted(true);
        speed.setPaintTicks(true);
        speed.setPaintLabels(true);
        labelTable.put(new Integer(60), new JLabel("Speed"));
        labelTable.put(new Integer(20), new JLabel("Hard"));
        labelTable.put(new Integer(100), new JLabel("Easy"));
        speed.setLabelTable(labelTable);
        add(speed);
    }

    /**
     * @return the play
     */
    public JButton getPlay()
    {
        return play;
    }

    /**
     * @param play the play to set
     */
    public void setPlay(JButton play)
    {
        this.play = play;
    }

    /**
     * @return the myMenu
     */
    public JMenuBar getMyMenu()
    {
        return myMenu;
    }

    /**
     * @param myMenu the myMenu to set
     */
    public void setMyMenu(JMenuBar myMenu)
    {
        this.myMenu = myMenu;
    }

    /**
     * @return the jm1
     */
    public JMenu getJm1()
    {
        return jm1;
    }

    /**
     * @param jm1 the jm1 to set
     */
    public void setJm1(JMenu jm1)
    {
        this.jm1 = jm1;
    }

    /**
     * @return the jmi1
     */
    public JMenuItem getJmi1()
    {
        return jmi1;
    }

    /**
     * @param jmi1 the jmi1 to set
     */
    public void setJmi1(JMenuItem jmi1)
    {
        this.jmi1 = jmi1;
    }

    /**
     * @return the jmi2
     */
    public JMenuItem getJmi2()
    {
        return jmi2;
    }

    /**
     * @param jmi2 the jmi2 to set
     */
    public void setJmi2(JMenuItem jmi2)
    {
        this.jmi2 = jmi2;
    }

    /**
     * @return the jmi3
     */
    public JMenuItem getJmi3()
    {
        return jmi3;
    }

    /**
     * @param jmi3 the jmi3 to set
     */
    public void setJmi3(JMenuItem jmi3)
    {
        this.jmi3 = jmi3;
    }

    /**
     * @return the score
     */
    public JLabel getScore()
    {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(JLabel score)
    {
        this.score = score;
    }

    /**
     * @return the tackles
     */
    public JLabel getTackles()
    {
        return tackles;
    }

    /**
     * @param tackles the tackles to set
     */
    public void setTackles(JLabel tackles)
    {
        this.tackles = tackles;
    }

    /**
     * @return the speed
     */
    public JSlider getSpeed()
    {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(JSlider speed)
    {
        this.speed = speed;
    }

    /**
     * @return the labelTable
     */
    public Hashtable getLabelTable()
    {
        return labelTable;
    }

    /**
     * @param labelTable the labelTable to set
     */
    public void setLabelTable(Hashtable labelTable)
    {
        this.labelTable = labelTable;
    }

    /**
     * @return the tds
     */
    public int getTds()
    {
        return tds;
    }

    /**
     * @param tds the tds to set
     */
    public void setTds(int tds)
    {
        this.tds = tds;
    }

    /**
     * @return the fails
     */
    public int getFails()
    {
        return fails;
    }

    /**
     * @param fails the fails to set
     */
    public void setFails(int fails)
    {
        this.fails = fails;
    }

}
