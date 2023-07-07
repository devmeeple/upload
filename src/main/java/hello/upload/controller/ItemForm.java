package hello.upload.controller;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class ItemForm {

    private Long itemId;
    private String itemName;
    private MultipartFile attachFile;
    // 다중 업로드를 위해 MultipartFile 을 사용
    private List<MultipartFile> imageFiles;

}
