package introse.group20.hms.application.services.uploads;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public interface IUploadService {
    public String upload(byte[] bytes, String fileName, String folderName) throws IOException;
}
