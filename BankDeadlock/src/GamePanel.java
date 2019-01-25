
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class GamePanel extends JPanel
{

    private ImageIcon fieldImage = new ImageIcon(getClass().getResource("GameField.jpeg"));
    private JLabel jl1 = new JLabel(fieldImage);
    private JButton endzone = new JButton();
    private JButton rb = new JButton();
    private JButton enemy1 = new JButton();
    private JButton enemy2 = new JButton();
    private JButton enemy3 = new JButton();
    private TopPanel tp = new TopPanel();

    GamePanel(TopPanel tp)
    {
        super();
        this.tp = tp;
        setLayout(new BorderLayout());
        add(jl1, BorderLayout.CENTER);
        addButtons();
        requestFocusInWindow();
        setFocusable(true);
        rb.setFocusable(true);
    }

    private void addButtons()
    {
        endzone.setBackground(Color.GREEN);
        add(endzone, BorderLayout.EAST);
        endzone.setText("END ZONE");
        rb.setText("PSU");
        rb.setBackground(Color.blue);
        jl1.add(rb);
        enemy1.setBackground(Color.black);
        enemy2.setBackground(Color.black);
        enemy3.setBackground(Color.black);
        enemy1.setText("LB");
        enemy2.setText("LB");
        enemy3.setText("LB");
        jl1.add(enemy1);
        jl1.add(enemy2);
        jl1.add(enemy3);
    }

    public void createButtons(Rectangle rb, Rectangle e1, Rectangle e2, Rectangle e3, Rectangle endzone)
    {
        this.rb.setBounds(new Rectangle(rb));
        enemy1.setBounds(new Rectangle(e1));
        enemy2.setBounds(new Rectangle(e2));
        enemy3.setBounds(new Rectangle(e3));
        this.endzone.setBounds(new Rectangle(endzone));
    }

    public void moveRb(Rectangle rb)
    {
        this.rb.setBounds(rb);
    }

    public void moveEnemies(Rectangle e1, Rectangle e2, Rectangle e3)
    {
        enemy1.setBounds(new Rectangle(e1));
        enemy2.setBounds(new Rectangle(e2));
        enemy3.setBounds(new Rectangle(e3));
    }

    public void tackleMessage(int td, int tackles)
    {
        JOptionPane.showMessageDialog(this, "Oh no! You were tackled!\nCurrent Score: " + td + "\nCurrent Fails: " + tackles, "FAILURE!",
                JOptionPane.PLAIN_MESSAGE);
    }

    public void tdMessage(int td, int tackles)
    {
        JOptionPane.showMessageDialog(this, "Congrats! You scored!!\nCurrent Score: " + td + "\nCurrent Fails: " + tackles, "TOUCHDOWN!",
                JOptionPane.PLAIN_MESSAGE);

    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        requestFocusInWindow();
        rb.requestFocusInWindow();
        rb.setFocusable(true);
        setFocusable(true);
    }

    /**
     * @return the fieldImage
     */
    public ImageIcon getFieldImage()
    {
        return fieldImage;
    }

    /**
     * @param fieldImage the fieldImage to set
     */
    public void setFieldImage(ImageIcon fieldImage)
    {
        this.fieldImage = fieldImage;
    }

    /**
     * @return the jl1
     */
    public JLabel getJl1()
    {
        return jl1;
    }

    /**
     * @param jl1 the jl1 to set
     */
    public void setJl1(JLabel jl1)
    {
        this.jl1 = jl1;
    }

    /**
     * @return the endzone
     */
    public JButton getEndzone()
    {
        return endzone;
    }

    /**
     * @param endzone the endzone to set
     */
    public void setEndzone(JButton endzone)
    {
        this.endzone = endzone;
    }

    /**
     * @return the rb
     */
    public JButton getRb()
    {
        return rb;
    }

    /**
     * @param rb the rb to set
     */
    public void setRb(JButton rb)
    {
        this.rb = rb;
    }

    /**
     * @return the enemy1
     */
    public JButton getEnemy1()
    {
        return enemy1;
    }

    /**
     * @param enemy1 the enemy1 to set
     */
    public void setEnemy1(JButton enemy1)
    {
        this.enemy1 = enemy1;
    }

    /**
     * @return the enemy2
     */
    public JButton getEnemy2()
    {
        return enemy2;
    }

    /**
     * @param enemy2 the enemy2 to set
     */
    public void setEnemy2(JButton enemy2)
    {
        this.enemy2 = enemy2;
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

    /**
     * @return the enemy3
     */
    public JButton getEnemy3()
    {
        return enemy3;
    }

    /**
     * @param enemy3 the enemy3 to set
     */
    public void setEnemy3(JButton enemy3)
    {
        this.enemy3 = enemy3;
    }

}
