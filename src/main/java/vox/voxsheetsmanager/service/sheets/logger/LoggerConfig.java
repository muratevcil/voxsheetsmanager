package vox.voxsheetsmanager.service.sheets.logger;


import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

@Configuration
public class LoggerConfig {

    private static Logger logger;

    public LoggerConfig() throws IOException {
        this.logger = Logger.getLogger("com.vox");

        FileHandler fileHandler = new FileHandler("app.log", true);
        fileHandler.setFormatter(new SimpleFormatter());

        this.logger.addHandler(fileHandler);
        this.logger.log(Level.INFO,"LoggerConfig initialized.");
    }

    public static Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
