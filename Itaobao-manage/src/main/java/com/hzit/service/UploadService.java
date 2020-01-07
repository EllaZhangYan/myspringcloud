package com.hzit.service;

import java.util.Map;
import org.springframework.web.multipart.MultipartFile;
public interface UploadService {
    public Map uploadPicture(MultipartFile uploadFile);
}
