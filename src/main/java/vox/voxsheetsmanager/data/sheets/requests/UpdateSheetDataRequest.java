package vox.voxsheetsmanager.data.sheets.requests;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

@Data
public class UpdateSheetDataRequest {

    @JsonProperty("spreadName")
    private String spreadName;
    private String sheetName;
    private Object data;
    @JsonProperty("sheets")
    private Map<String,Object> dataSplittedAsSheetNameAndContent;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Map<String, Object> getDataSplittedAsSheetNameAndContent() {
        return dataSplittedAsSheetNameAndContent;
    }

    public void setDataSplittedAsSheetNameAndContent(Map<String, Object> dataSplittedAsSheetNameAndContent) {
        this.dataSplittedAsSheetNameAndContent = dataSplittedAsSheetNameAndContent;
    }
}
