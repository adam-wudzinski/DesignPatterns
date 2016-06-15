package behavioral.iterator;


public class File {
    private FileType fileType;
    private String name;

    public File(FileType fileType, String name) {
        this.fileType = fileType;
        this.name = name;
    }

    public FileType getFileType() {
        return fileType;
    }

    public String getName() {
        return name;
    }
}
