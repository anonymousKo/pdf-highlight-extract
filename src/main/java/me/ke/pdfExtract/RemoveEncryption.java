package me.ke.pdfExtract;

import java.io.IOException;

public class RemoveEncryption {
    public static void main(String[] args)  {
        PdfController pdfController =new PdfController();
        String path = System.getProperty("user.dir");
        pdfController.removeEncryption(path);
    }
}
