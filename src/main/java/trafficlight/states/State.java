package trafficlight.states;

//concrete SUBJECT
//TODO implement a part of the pattern here


import trafficlight.gui.Observer;
import trafficlight.gui.TrafficLight;

import java.util.ArrayList;
import java.util.List;

public abstract class State extends Subject {


    public abstract State getNextState();

    public abstract String getColor();

    public String getString(){
        return getColor();
    }


}