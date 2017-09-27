
public class mvc_app
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        NavModel model = new NavModel();
        NavView view = new NavView(model);
        NavController controller = new NavController(model, view);
    }

}
