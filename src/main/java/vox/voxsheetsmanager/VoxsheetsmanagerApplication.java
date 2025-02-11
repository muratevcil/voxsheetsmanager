package vox.voxsheetsmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class VoxsheetsmanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VoxsheetsmanagerApplication.class, args);
    }

}
