import java.util.ArrayList;
import java.util.List;

interface GameSubject {
    
    void registerObserver(GameObserver observer);
    void removeObserver(GameObserver observer);
    void notifyObservers();
}