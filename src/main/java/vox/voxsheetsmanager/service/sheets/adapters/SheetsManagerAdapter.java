package vox.voxsheetsmanager.service.sheets.adapters;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vox.voxsheetsmanager.data.mongo.Sheets;
import vox.voxsheetsmanager.data.repository.sheets.MongoSheetsRepository;
import vox.voxsheetsmanager.data.sheets.requests.GetSheetRequest;
import vox.voxsheetsmanager.data.sheets.requests.UpdateSheetDataRequest;
import vox.voxsheetsmanager.service.sheets.ports.SheetsManagerPort;

import java.util.List;
import java.util.Map;


@Service
public class SheetsManagerAdapter implements SheetsManagerPort {

    @Autowired
    public MongoSheetsRepository mongoSheetsRepository;

    @Override
    public Object getSheet(String sheetName, String spreadName) {
        return mongoSheetsRepository.findBySheetNameAndSpreadName(sheetName,spreadName).getSheetContent();
    }

    @Override
    public List<Sheets> getAllSheets(){
        return mongoSheetsRepository.findAll();
    }

    @Override
    public void updateSheet(UpdateSheetDataRequest updateSheetDataRequest) {
        String spreadName = updateSheetDataRequest.getSpreadName();
        Map<String,Object> sheetsData = updateSheetDataRequest.getDataSplittedAsSheetNameAndContent();
        sheetsData.forEach((key,value)->{
            if(mongoSheetsRepository.existsBySheetName(key) && mongoSheetsRepository.existsBySpreadName(spreadName)){
                Sheets sheets = mongoSheetsRepository.findBySheetNameAndSpreadName(key, spreadName);
                if(sheets != null){
                    sheets.setSheetContent(value);
                    mongoSheetsRepository.save(sheets);
                }
                else{
                    System.out.println("entity not found but exists.");
                }
            } else{
                Sheets sheets = new Sheets(key, spreadName,value);
                mongoSheetsRepository.save(sheets);
            }
        });
    }

    @Override
    public ObjectNode deleteSheet(String spreadName, String sheetName) {
        return null;
    }


    public void insertEmptySheet(){
            Sheets sheet = new Sheets("TestSheet","TestContent");
            mongoSheetsRepository.save(sheet);

    }

}
