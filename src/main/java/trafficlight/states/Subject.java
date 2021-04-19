package trafficlight.states;

import trafficlight.gui.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> list = new ArrayList<>();

    public void addObserver(Observer observer){
        list.add(observer);
    }

    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    public void notifyObserver(State s) {
        for (Observer observer : list) {
            observer.update(s);
        }
    }

}