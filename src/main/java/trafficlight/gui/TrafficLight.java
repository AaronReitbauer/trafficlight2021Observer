package trafficlight.gui;

//Concrete OBSERVER
import trafficlight.states.State;
import trafficlight.states.Subject;

import java.awt.*;

public class TrafficLight extends Light implements Observer {

    TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }


    @Override
    public void update(State s) {
        if (isOn()) {
            turnOn(false);
        } else {
            turnOn(true);
        }
    }


    //TODO implement a part of the pattern here
    //irgendwas vom trafficlight.gui.Observer Pattern muss da rein
}
