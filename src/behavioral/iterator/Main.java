package behavioral.iterator;


public class Main {

    public static void main(String[] args) {
        Folder folder = new Folder();
        FileIterator imageIterator = folder.iterator(FileType.IMAGE);

        while (imageIterator.hasNext()) {
            System.out.println(imageIterator.next().getName());
        }
    }
}
