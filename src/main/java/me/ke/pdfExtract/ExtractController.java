package me.ke.pdfExtract;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ExtractController {
    List<File> FileList = new ArrayList<>();
    FileOperationUtil fileOperationUtil =new FileOperationUtil();

    public void ExtractPdfHighlight(String path) {
        FileList = fileOperationUtil.getFiles(path, file1 -> {
            // only find .pdf file
            return (file1.getPath().toLowerCase().lastIndexOf(".pdf") == file1.getPath().length() - 4);
        });
        log.info("find pdf file -> {}", FileList);
        FileList.forEach(file ->
            fileOperationUtil.extractHighlight(file));
    }
}
