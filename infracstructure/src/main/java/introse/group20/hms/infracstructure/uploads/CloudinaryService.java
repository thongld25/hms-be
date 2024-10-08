package introse.group20.hms.infracstructure.uploads;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import introse.group20.hms.application.services.uploads.IUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

@Component
public class CloudinaryService implements IUploadService {
    @Autowired
    private Cloudinary cloudinary;
    @Override
    public String upload(byte[] bytes, String fileName, String folderName) throws IOException {
        String publicId = "hms/" + folderName + "/" + fileName;
        Map<?,?> image = cloudinary.uploader().upload(bytes, ObjectUtils.asMap("public_id", publicId));
        return (String) image.get("url");
    }
}
