package vox.voxsheetsmanager.service.sheets.ports;

import com.fasterxml.jackson.databind.node.ObjectNode;
import vox.voxsheetsmanager.data.sheets.requests.GetSheetRequest;

public interface SheetsManagerPort {

    ObjectNode getSheet(GetSheetRequest getSheetRequest);

    ObjectNode getSheet(String spreadName, String sheetName);

    ObjectNode updateSheet(String spreadName, String sheetName, ObjectNode sheetContent);
    ObjectNode deleteSheet(String spreadName, String sheetName);

}
