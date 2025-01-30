package vox.voxsheetsmanager.data.sheets.requests;

import lombok.Data;

@Data
public class GetSheetRequest {

    private String spreadName;
    private String sheetId;

}
