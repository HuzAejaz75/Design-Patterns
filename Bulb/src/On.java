/**
 * Created by huzaifa.aejaz on 5/8/17.
 */
public class On implements BulbBehavior {

    public void bulbAction(Bulb currBehavior)
    {
        System.out.println("Bulb is on");

        currBehavior.setBehavior(new Off());
    }
}
