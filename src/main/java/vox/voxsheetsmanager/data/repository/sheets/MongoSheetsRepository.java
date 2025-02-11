package vox.voxsheetsmanager.data.repository.sheets;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import vox.voxsheetsmanager.data.mongo.Sheets;

import java.util.List;

public interface MongoSheetsRepository extends MongoRepository<Sheets,Integer> {

    List<Sheets> findAll();

    boolean existsBySheetName(String sheetName);

    boolean existsBySpreadName(String spreadName);

    Sheets findBySheetName(String sheetName);
    Sheets findBySheetNameAndSpreadName(String sheetName,String spreadName);

}
