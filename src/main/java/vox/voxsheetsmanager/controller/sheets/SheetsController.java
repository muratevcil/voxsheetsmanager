package vox.voxsheetsmanager.controller.sheets;


import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sheets")
public class SheetsController {

    @GetMapping("/getSheet/{spreadName}/{sheetName}")
    public ObjectNode getSheet(@PathVariable String spreadName, @PathVariable String sheetName) {
        return null;
    }
}
