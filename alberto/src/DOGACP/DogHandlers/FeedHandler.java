package DOGACP.DogHandlers;

import DOGACP.Dog.Dog;

/**
 * Created by rome on 12/1/2015.
 */
public class FeedHandler implements DogHandler {
    @Override
    public void handleCommand(Dog aDog) {
        // Execute respective Function
        aDog.eat();
    }
}
