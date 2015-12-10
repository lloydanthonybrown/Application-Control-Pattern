package ACP;

import org.quickconnectfamily.json.JSONOutputStream;

import java.util.HashMap;
import java.util.logging.LogRecord;

// A type of handler that uses the same method signature as the interface Handler
// extends java.util.logging.Handler
public class SpeakHandler extends java.util.logging.Handler implements Handler {
    @Override
    public void handleIt(HashMap<String, Object> dataMap) {
        try{
            JSONOutputStream outToClient = (JSONOutputStream)dataMap.remove("toClient");
            System.out.println("Just got:" + dataMap + " from client");
            dataMap.put("command", "Done");
            outToClient.writeObject(dataMap);
            System.out.println("just sent "+dataMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void publish(LogRecord record) {

    }

    @Override
    public void flush() {

    }

    @Override
    public void close() throws SecurityException {

    }

//    @Override
//    public void publish(LogRecord record) {
//
//    }
//
//    @Override
//    public void flush() {
//
//    }
//
//    @Override
//    public void close() throws SecurityException {
//
//    }
}
