package vox.voxsheetsmanager.data.sheets.requests;

import lombok.Data;

@Data
public class GetSheetRequest {

    private String sheetName;
    private String spreadName;

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public String getSpreadName() {
        return spreadName;
    }

    public void setSpreadName(String spreadName) {
        this.spreadName = spreadName;
    }

}
