/**
 * Created by huzaifa.aejaz on 5/8/17.
 */
public class Bulb {

    private BulbBehavior myBulb;

    public Bulb() {
        setBehavior( new On());
    }

    public void setBehavior(BulbBehavior behavior)
    {
        myBulb = behavior;
    }
    public void BulbAction()
    {
        myBulb.bulbAction(this);
    }
}
