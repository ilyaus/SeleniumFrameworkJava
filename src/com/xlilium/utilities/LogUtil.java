package com.xlilium.utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LogUtil {
    // File format for the log name
    private ZonedDateTime date = ZonedDateTime.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyHHMMSS");
    private String fileNameFormat = date.format(formatter);

    private BufferedWriter bufferedWriter = null;

    // Create log file
    public void CreateLogFile() {
        try {
            File dir = new File ("C:/Logs");

            if(!dir.exists()) {
                dir.mkdir();
            }

            File logFile = new File(dir + "/" + fileNameFormat + ".log");
            FileWriter fileWriter = new FileWriter(logFile.getAbsoluteFile());
            bufferedWriter = new BufferedWriter(fileWriter);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Write messages within to log
    public void Write(String message) {
        try {
            bufferedWriter.write(message);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
