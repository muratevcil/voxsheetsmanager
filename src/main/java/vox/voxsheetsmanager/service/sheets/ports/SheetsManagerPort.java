package vox.voxsheetsmanager.service.sheets.ports;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.stereotype.Service;
import vox.voxsheetsmanager.data.mongo.Sheets;
import vox.voxsheetsmanager.data.sheets.requests.GetSheetRequest;
import vox.voxsheetsmanager.data.sheets.requests.UpdateSheetDataRequest;

import java.util.List;


@Service
public interface SheetsManagerPort {

    List<Sheets> getAllSheets();

    Object getSheet(String sheetName,String spreadName);

    void updateSheet(UpdateSheetDataRequest updateSheetDataRequest);
    ObjectNode deleteSheet(String spreadName, String sheetName);

    void insertEmptySheet();

}
