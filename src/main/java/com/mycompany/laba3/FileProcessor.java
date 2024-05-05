package com.mycompany.laba3;

import java.io.File;
import java.util.List;


public interface FileProcessor {
    boolean canProcess(String fileType);

    List<Reactor> process(File file) throws Exception;
    
    public void setNext(FileProcessor fileProcessor);
}
