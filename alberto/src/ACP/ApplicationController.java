package ACP;
import java.util.logging.Handler;
import java.util.HashMap;
public class ApplicationController {
    // Private Instance Variable Which key is a String and Value is a Handler Interface
    private HashMap<String,Handler> handlerMap = new HashMap();

    // Method which receives a String and a HashMap with a String and a Object
    public void handleRequest(String command, HashMap<String,Object> data){
        // Since Handler is an interface you cannot instantiate it
        // Rather you store the handlerMap HashMap's Key of type String
        // to the Handler
        Handler aCommandHandler = handlerMap.get(command);

        if (aCommandHandler != null){
            // Problem: I'm not sure why this isn't able to complete the request. Everything looks good to me.
            aCommandHandler.handleIt(data);
        }
    }

    public void mapCommand(String aCommand, Handler acHandler){

        // Add to the handler HashMap the string and the Handler
        // I'm putting this in a try/catch block, because if the .put command doesn't recognize the given command,
        // I shouldn't do ANYTHING. Right?
        try {
            handlerMap.put(aCommand,acHandler);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
