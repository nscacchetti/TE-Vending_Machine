package com.techelevator.application;

public class Logger {

}

/*package com.techelevator.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Logger {

    private File logFile;

    public Logger(String logFileName) {
        this.logFile = new File(logFileName);
    }

    public void write(String message) {
        LocalDateTime timeStamp = LocalDateTime.now();
        String lineOfLog = timeStamp + " : " + message + "\n";

        PrintWriter writer = null;

        try {
            // Instantiate the writer object with append functionality.
            if (logFile.exists()) {
                writer = new PrintWriter(new FileOutputStream(logFile.getAbsoluteFile(), true));
            }

            // Instantiate the writer object without append functionality.
            else {
                writer = new PrintWriter(logFile.getAbsoluteFile());
            }
        } catch (FileNotFoundException e) {

        }

        writer.append(lineOfLog);
        writer.flush();
        writer.close();

    }

}*/