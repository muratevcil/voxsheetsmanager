package vox.voxsheetsmanager.service.sheets.ports;

import com.fasterxml.jackson.databind.node.ObjectNode;

public interface SheetsManagerPort {

    ObjectNode getSheet(GetSheetRequest getSheetRequest);
    ObjectNode updateSheet(String spreadName, String sheetName, ObjectNode sheetContent);
    ObjectNode deleteSheet(String spreadName, String sheetName);

}
