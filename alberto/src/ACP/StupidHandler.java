package ACP;

import java.util.HashMap;
import java.util.logging.LogRecord;

/**
 * Created by rome on 11/30/2015.
 */
//extends java.util.logging.Handler
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

    // These were also suggested after including the "extends java.util.logging.Handler" stuff in the class description.
//    public void publish(LogRecord record) {
//
//    }
//
//    public void flush() {
//
//    }
//
//    public void close() throws SecurityException {
//
//    }

    // I don't think these are required, but it suggested them after including the "extends java.util.logging.Handler" stuff in the class description.
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
