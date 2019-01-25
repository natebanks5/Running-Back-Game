
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class NavController
{

    private NavModel model;
    private NavView view;
    private int delay = 100;
    private Boolean gameOver = true;
    private Boolean gameInProgress = false;

    public NavController(NavModel model, NavView view)
    {
        this.model = model;
        this.view = view;
        timerListener();
        psuListener();
        osuListener();
        pittListener();
        playListener();
        rbListener();
        speedListener();
        initialSetup();
    }

    public void timerListener()
    {
        model.setTim(new Timer(getDelay(), new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                model.moveEnemies();
                getView().getIframe().getCp().getGp().moveEnemies(model.getEnemy().getE1(), model.getEnemy().getE2(), model.getEnemy().getE3());
                model.checkForTd();
                tackleUpdate();
                tdUpdate();
            }
        }));
    }

    public void tackleUpdate()
    {
        model.checkForTackle();
        if (model.checkForTackle() == true)
        {
            model.setTackles(model.getTackles() - 1);
            getView().getIframe().getCp().getTp().getTackles().setText("Fails: " + model.getTackles());
            getView().getIframe().getCp().getGp().tackleMessage(model.getScore(), model.getTackles());
            model.getEnemy().setDefaultBounds();
            model.getRb().resetRb();
            initialSetup();
        }
    }

    private void tdUpdate()
    {
        model.checkForTd();
        if (model.checkForTd() == true)
        {
            model.setScore(model.getScore() - 2);
            getView().getIframe().getCp().getTp().getScore().setText("Score: " + model.getScore());
            getView().getIframe().getCp().getGp().tdMessage(model.getScore(), model.getTackles());
            model.getEnemy().setDefaultBounds();
            model.getRb().resetRb();
            initialSetup();
        }
    }

    public void psuListener()
    {
        getView().getIframe().getCp().getTp().getJmi1().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                if (model.getGameInProgress() == false)
                {
                    getView().getIframe().getCp().getGp().getRb().setText("PSU");
                    getView().getIframe().getCp().getGp().getRb().setBackground(Color.blue);
                }
            }
        });
    }

    public void osuListener()
    {
        getView().getIframe().getCp().getTp().getJmi2().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                if (model.getGameInProgress() == false)
                {
                    getView().getIframe().getCp().getGp().getRb().setText("OSU");
                    getView().getIframe().getCp().getGp().getRb().setBackground(Color.red);
                }
            }
        });
    }

    public void pittListener()
    {
        getView().getIframe().getCp().getTp().getJmi3().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                getView().getIframe().getCp().getGp().getRb().setText("PITT");
                getView().getIframe().getCp().getGp().getRb().setBackground(Color.YELLOW);
            }
        });
    }

    public void playListener()
    {
        getView().getIframe().getCp().getTp().getPlay().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                model.startTimer();
            }
        });
    }

    public void rbListener()
    {
        getView().getIframe().getCp().getGp().getRb().addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
                int x = model.getRb().getRbX();
                int y = model.getRb().getRbY();
                int k = e.getKeyCode();
                if (model.getTim().isRunning() == true)
                {
                    if (k == e.VK_LEFT)
                    {
                        model.getRb().moveLeft();
                    }
                    if (k == e.VK_UP)
                    {
                        model.getRb().moveUp();
                    }

                    if (k == e.VK_RIGHT)
                    {
                        getModel().getRb().moveRight();
                    }

                    if (k == e.VK_DOWN)
                    {
                        model.getRb().moveDown();
                    }
                    model.getRb().getRb().setBounds(model.getRb().getRbX(), model.getRb().getRbY(), 70, 70);
                    initialSetup();
                }
            }
        });
    }

    public void speedListener()
    {
        getView().getIframe().getCp().getTp().getSpeed().addChangeListener(new ChangeListener()
        {
            @Override
            public void stateChanged(ChangeEvent ce)
            {
                int count = getView().getIframe().getCp().getTp().getSpeed().getValue();
                model.getTim().setDelay(count);
            }
        });
    }

    private void initialSetup()
    {
        getView().getIframe().getCp().getGp().createButtons(model.getRb().getRb(), model.getEnemy().getE1(), model.getEnemy().getE2(), model.getEnemy().getE3(), model.getRb().getEndzone());
    }

    public NavModel getModel()
    {
        return model;
    }

    public void setModel(NavModel model)
    {
        this.model = model;
    }

    public NavView getView()
    {
        return view;
    }

    public void setView(NavView view)
    {
        this.view = view;
    }

    /**
     * @return the delay
     */
    public int getDelay()
    {
        return delay;
    }

    /**
     * @param delay the delay to set
     */
    public void setDelay(int delay)
    {
        this.delay = delay;
    }

    /**
     * @return the gameOver
     */
    public Boolean getGameOver()
    {
        return gameOver;
    }

    /**
     * @param gameOver the gameOver to set
     */
    public void setGameOver(Boolean gameOver)
    {
        this.gameOver = gameOver;
    }

    /**
     * @return the gameInProgress
     */
    public Boolean getGameInProgress()
    {
        return gameInProgress;
    }

    /**
     * @param gameInProgress the gameInProgress to set
     */
    public void setGameInProgress(Boolean gameInProgress)
    {
        this.gameInProgress = gameInProgress;
    }
}
