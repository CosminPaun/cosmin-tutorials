package com.paun.Logging;

import java.io.IOException;
import java.util.logging.*;

/**
 * Created by cpaun on 16.10.14.
 */
public class MyLogger {
    private static FileHandler fileTxt;
    private static SimpleFormatter formatterTxt;

    static private FileHandler fileHTML;
    private static Formatter formatterHTML;

    public static void setup() throws IOException {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        Logger rootLogger = Logger.getLogger("");

        Handler[] handlers = rootLogger.getHandlers();

        if (handlers[0] instanceof ConsoleHandler) {
            rootLogger.removeHandler(handlers[0]);
        }

        logger.setLevel(Level.INFO);
        fileTxt = new FileHandler("Logging.txt");
        fileHTML = new FileHandler("Logging.html");

        formatterTxt = new SimpleFormatter();
        fileTxt.setFormatter(formatterTxt);

        logger.addHandler(fileTxt);

        formatterHTML = new MyHtmlFormatter();
        fileHTML.setFormatter(formatterHTML);
        logger.addHandler(fileHTML);
    }
}
