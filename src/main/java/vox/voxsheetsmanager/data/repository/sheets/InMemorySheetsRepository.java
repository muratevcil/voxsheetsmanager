package vox.voxsheetsmanager.data.repository.sheets;

import org.springframework.data.repository.CrudRepository;
import vox.voxsheetsmanager.data.redis.Sheets;

import java.util.Optional;

public interface InMemorySheetsRepository extends CrudRepository<Sheets, Integer> {

    Optional<Sheets> findBySpreadNameAndSheetName(String spreadName, String sheetName);

}
