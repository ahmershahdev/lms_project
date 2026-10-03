package com.hitms.lab04;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Lab 04 Task 4 - structured logging instead of System.out.println.
 */
public class AppLogger {
    private static final Logger LOGGER = Logger.getLogger(AppLogger.class.getName());

    /**
     * Writes progress messages to app.log.
     *
     * @param args command-line arguments (unused)
     * @throws IOException if the log file cannot be opened
     */
    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler("app.log", true);
        fileHandler.setFormatter(new SimpleFormatter());
        LOGGER.addHandler(fileHandler);
        LOGGER.setUseParentHandlers(false); // write to the file only
        LOGGER.setLevel(Level.INFO);

        LOGGER.info("Starting process...");
        LOGGER.info("Step completed");
        fileHandler.close();
    }
}
