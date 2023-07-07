package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    // 고객이 업로드한 파일명, 서버 내부에서 관리하는 파일명
    private String uploadFileName;
    // 사용자가 같은 파일 이름을 업로드 할 수 있으니 UUID로 저장소에서 구분한다.
    private String storeFileName;

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
