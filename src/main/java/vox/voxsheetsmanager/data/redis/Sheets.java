package vox.voxsheetsmanager.data.redis;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import java.lang.annotation.Documented;

@Data
public class Sheets {

    private String spreadName;
    private String sheetName;
    private Object content;

}
