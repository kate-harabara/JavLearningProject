package md.teckwillacademy.filemanagementservice;

import java.io.File;

public class FileTaskExecution {
    public static void main(String[] args) {
        File fileObject01 = new File("src/main/java/md/teckwillacademy/filemanagementservice/fisier.txt");

        FilesManager.informIfTheFileExists(fileObject01);
        System.out.println(FilesManager.createTheFileIfDoesNotExist(fileObject01));
        FilesManager.informIfTheFileExists(fileObject01);
        FilesManager.printTheFileName(fileObject01);
        FilesManager.printTheAbsolutePath(fileObject01);
        FilesManager.printIfTheFileIsADirectory(fileObject01);
        FilesManager.deleteTheFileIfExists(fileObject01);


        String path = "src/main/java/md/teckwillacademy/filemanagementservice/writedata.txt";
        OutputFilesWriterManager.writeDataIntoTheFileUsingFileWriter(path, "Content 1");
        OutputFilesWriterManager.writeDataIntoTheFileUsingFileWriter(path, "Content 2");
        OutputFilesWriterManager.writeDataIntoTheFileUsingBufferWriter(path, "Content 3");


        InputFilesReadManager.printTheDataFromAFile(path);
        InputFilesReadManager.printDataFromAFileByUsingFileReader(path);
        InputFilesReadManager.printDataFromAFileByUsingBufferReader(path);

    }
}
