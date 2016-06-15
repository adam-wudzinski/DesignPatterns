package behavioral.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Folder {
    private List<File> files;

    public Folder() {
        files = new ArrayList<>(Arrays.asList(
                new File(FileType.TEXT, "SomeDoc"),
                new File(FileType.TEXT, "OtherDoc"),
                new File(FileType.TEXT, "Document"),
                new File(FileType.TEXT, "Notes"),
                new File(FileType.VIDEO, "Funny"),
                new File(FileType.VIDEO, "Not Funny"),
                new File(FileType.VIDEO, "Sad"),
                new File(FileType.IMAGE, "Photo"),
                new File(FileType.IMAGE, "Image")
        ));
    }

    public FolderFileIterator iterator(FileType fileType) {
        return new FolderFileIterator(this, fileType);
    }

    public List<File> getFiles() {
        return files;
    }
}
