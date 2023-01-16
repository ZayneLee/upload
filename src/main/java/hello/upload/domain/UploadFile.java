package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {
    private String uploadFileName;
    private String sotreFileName;

    public UploadFile(String uploadFileName, String sotreFileName) {
        this.uploadFileName = uploadFileName;
        this.sotreFileName = sotreFileName;
    }
}
