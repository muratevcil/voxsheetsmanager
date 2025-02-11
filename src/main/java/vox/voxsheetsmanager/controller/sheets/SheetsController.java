package vox.voxsheetsmanager.controller.sheets;


import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vox.voxsheetsmanager.data.mongo.Sheets;
import vox.voxsheetsmanager.data.sheets.requests.UpdateSheetDataRequest;
import vox.voxsheetsmanager.service.sheets.ports.SheetsManagerPort;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sheets")
public class SheetsController {
    @Autowired
    private SheetsManagerPort sheetsManagerPort;
    @GetMapping("/getSheet/{sheetName}/{spreadName}")
    public List<Object> getSheet(@PathVariable String sheetName, @PathVariable String spreadName) {
        List<Object> returningObject = new ArrayList<>();
        returningObject.add(sheetsManagerPort.getSheet(sheetName,spreadName));
        return returningObject;
    }

    @PostMapping("/sendSheetData")
    public void sendSheetDataToCloud(@RequestBody UpdateSheetDataRequest updateSheetDataRequest){
        sheetsManagerPort.updateSheet(updateSheetDataRequest);
    }

    @PostMapping("/insertEmptySheet")
    public void insertEmptySheet(){
        sheetsManagerPort.insertEmptySheet();
    }

    @GetMapping("/getAllSheets")
    public List<Sheets> getAllSheets(){
        return sheetsManagerPort.getAllSheets();
    }

}
