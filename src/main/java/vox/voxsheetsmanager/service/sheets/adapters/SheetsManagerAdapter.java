package vox.voxsheetsmanager.service.sheets.adapters;

import com.fasterxml.jackson.databind.node.ObjectNode;
import vox.voxsheetsmanager.service.sheets.ports.SheetsManagerPort;

public class SheetsManagerAdapter implements SheetsManagerPort {
    @Override
    public ObjectNode getSheet(String spreadName, String sheetName) {
        return null;
    }

    @Override
    public ObjectNode updateSheet(String spreadName, String sheetName, ObjectNode sheetContent) {
        return null;
    }

    @Override
    public ObjectNode deleteSheet(String spreadName, String sheetName) {
        return null;
    }
}
