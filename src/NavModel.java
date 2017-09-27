
import javax.swing.Timer;

class NavModel
{

    private RunningBack rb;
    private Enemy enemy;
    private Boolean gameOver = true;
    private Boolean gameInProgress = false;
    private Timer tim;
    private int score = 0;
    private int tackles = 0;

    public NavModel()
    {
        rb = new RunningBack();
        enemy = new Enemy();
    }

    public void moveEnemies()
    {
        getEnemy().move(rb.getRbX(), rb.getRbY(), enemy.getE1());
        getEnemy().move(rb.getRbX(), rb.getRbY(), enemy.getE2());
        getEnemy().move(rb.getRbX(), rb.getRbY(), enemy.getE3());
    }

    public boolean checkForTackle()
    {
        if (rb.getRb().intersects(enemy.getE1()) || rb.getRb().intersects(enemy.getE2()) || rb.getRb().intersects(enemy.getE3()))
        {
            getTim().stop();
            tackles++;
            return true;
        }
        return false;
    }

    public boolean checkForTd()
    {
        if (rb.getRb().intersects(rb.getEndzone()))
        {
            setScore(getScore() + 1);
            getTim().stop();
            getRb().setDefaultLocation();
            return true;
        }
        return false;
    }

    public void startTimer()
    {
        getTim().start();
    }

    /**
     * @return the rb
     */
    public RunningBack getRb()
    {
        return rb;
    }

    /**
     * @param rb the rb to set
     */
    public void setRb(RunningBack rb)
    {
        this.rb = rb;
    }

    /**
     * @return the e1
     */
    public Enemy getEnemy()
    {
        return enemy;
    }

    /**
     * @param e1 the e1 to set
     */
    public void setEnemy(Enemy enemy)
    {
        this.enemy = enemy;
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

    /**
     * @return the tackles
     */
    public int getTackles()
    {
        return tackles;
    }

    /**
     * @param tackles the tackles to set
     */
    public void setTackles(int tackles)
    {
        this.tackles = tackles;
    }

    /**
     * @return the tim
     */
    public Timer getTim()
    {
        return tim;
    }

    /**
     * @param tim the tim to set
     */
    public void setTim(Timer tim)
    {
        this.tim = tim;
    }

}
