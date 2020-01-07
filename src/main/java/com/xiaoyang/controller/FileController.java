package com.xiaoyang.controller;

import com.xiaoyang.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

@Controller
@RequestMapping("/file")
public class FileController {

    @RequestMapping("/testFileUpload")
    public String testFileUpload(HttpServletRequest request, MultipartFile upload) throws Exception {
        String path = request.getSession().getServletContext().getRealPath("/uploads");
        String filename = UUID.randomUUID().toString().replace("-", "");
        File file = new File(path);
        if (!file.exists()) {
            file.mkdir();
        }

        try {
            int i = 10/0;
            upload.transferTo(new File(path, filename));
        } catch (Exception e) {
            throw new SysException("上传失败，请重新上传!!");
        }

        return "success";
    }

}
