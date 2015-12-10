package ACP;

import java.util.HashMap;
import java.util.logging.LogRecord;

/**
 * Created by rome on 11/30/2015.
 */
public class StupidHandler extends java.util.logging.Handler implements Handler{

    @Override
    public void handleIt(HashMap<String, Object> data) {
        System.out.println(data);
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
}
