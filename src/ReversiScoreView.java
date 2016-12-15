import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Created by Robin on 2016-12-15.
 */
public class ReversiScoreView implements PropertyChangeListener{

    private final ReversiModel model;

    ReversiScoreView(ReversiModel model) {
        this.model = model;
        model.addObserver(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getSource().getClass() == ReversiModel.class && evt.getPropertyName().equals("ReversiScoreView")) {
            System.out.println("Black score: " + model.getBlackScore());
            System.out.println("White score: " + model.getWhiteScore());
            System.out.println("Next turn is: " + model.getTurnColor());
        }
    }
}
