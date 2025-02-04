package vox.voxsheetsmanager.controller.sheets;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.web.bind.annotation.*;
import vox.voxsheetsmanager.service.sheets.logger.LoggerConfig;

import java.util.logging.Level;

@RestController
@RequestMapping("/sheets")
public class SheetsController {

    @GetMapping("/getSheet/{spreadName}/{sheetName}")
    public ObjectNode getSheet(@PathVariable String spreadName, @PathVariable String sheetName) {
        return null;
    }

    @PostMapping("/sendSheetData")
    public void sendSheetDataToCloud(@RequestBody JsonNode object){
        System.out.println(object);
        LoggerConfig.getLogger().log(Level.INFO, object.toString());
    }

}
