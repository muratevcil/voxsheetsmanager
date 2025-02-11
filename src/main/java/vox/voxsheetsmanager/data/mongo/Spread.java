package vox.voxsheetsmanager.data.mongo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Spread {
    @Id
    private int id;

    private String spreadName;
}
