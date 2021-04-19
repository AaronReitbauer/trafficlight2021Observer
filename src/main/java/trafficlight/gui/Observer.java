package trafficlight.gui;

import trafficlight.gui.TrafficLightGui;
import trafficlight.states.State;

public interface Observer {

   void update(State s);

    //https://stackabuse.com/the-observer-design-pattern-in-java/
}
