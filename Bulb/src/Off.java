/**
 * Created by huzaifa.aejaz on 5/8/17.
 */
public class Off implements BulbBehavior {

    public void bulbAction(Bulb currBehavior)
    {
        System.out.println("The bulb is Off");

        currBehavior.setBehavior(new On());
    }
}
