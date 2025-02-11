package vox.voxsheetsmanager.data.mongo;


import org.bson.types.ObjectId;
import org.springframework.aot.generate.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sheets")
public class Sheets {

    public Sheets(){

    }
    public Sheets(String sheetName,Object sheetContent){
        this.sheetName    = sheetName;
        this.sheetContent = sheetContent;
    }

    public Sheets(String sheetName,String spreadName,Object sheetContent){
        this.sheetName    = sheetName;
        this.spreadName   = spreadName;
        this.sheetContent = sheetContent;
    }

    @Id
    private ObjectId id;
    private String spreadName;

    private String sheetName;

    private Object sheetContent;


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getSpreadName() {
        return spreadName;
    }

    public void setSpreadName(String spreadName) {
        this.spreadName = spreadName;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public Object getSheetContent() {
        return sheetContent;
    }

    public void setSheetContent(Object sheetContent) {
        this.sheetContent = sheetContent;
    }
}
