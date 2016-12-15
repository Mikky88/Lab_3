import java.beans.PropertyChangeListener;

/**
 * Created by Robin on 2016-12-14.
 */
public interface IObservable {

    void addObserver(PropertyChangeListener observer);

    void removeObserver(PropertyChangeListener observer);
}
