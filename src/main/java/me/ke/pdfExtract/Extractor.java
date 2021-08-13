package me.ke.pdfExtract;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Extractor {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        // String parentPath = path.substring(0,path.lastIndexOf("\\"));
        try {
                log.info("Current path :{}", path);
                PdfController pdfController =new PdfController();
                pdfController.extractPdfHighlight(path);
        } catch (Exception e) {
            log.error(String.valueOf(e));
        }
    }
}
