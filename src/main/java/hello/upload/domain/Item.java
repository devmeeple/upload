package hello.upload.domain;

import lombok.Data;

import java.util.List;

@Data
public class Item {

    private Long id;
    private String itemName;
    private UploadFile attachFile;
    // 이미지는 하나가 아닌 여러개를 업로드 할 수 있어야 한다. (요구사항)
    private List<UploadFile> imageFiles;

}
