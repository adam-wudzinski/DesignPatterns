package behavioral.iterator;


import java.util.List;

public class FolderFileIterator implements FileIterator{
    private FileType fileType;
    private Folder folder;
    private int currentId;

    public FolderFileIterator(Folder folder, FileType fileType) {
        this.folder = folder;
        this.fileType = fileType;
    }

    @Override
    public boolean hasNext() {
        return findNextId() != -1;
    }

    @Override
    public File next() {
        currentId = findNextId();
        if (currentId == -1) {
            return null;
        }
        return folder.getFiles().get(currentId);
    }

    private int findNextId(){
        List<File> files = folder.getFiles();
        int tmpId = currentId;
        boolean found = false;
        while (!found) {
            tmpId++;
            if (tmpId >= files.size()) {
                tmpId = -1;
                break;
            }
            if (files.get(tmpId).getFileType().equals(fileType)) {
                break;
            }
        }
        return tmpId;
    }
}
