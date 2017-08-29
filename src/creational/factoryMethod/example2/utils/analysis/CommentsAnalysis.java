package creational.factoryMethod.example2.utils.analysis;

/**
 * POJO class.
 * Not a part of this Design Pattern.
 */
public class CommentsAnalysis {
    private long commentsCount;
    private long wordsCount;
    private String longestWord;

    public CommentsAnalysis(long commentsCount, long wordsCount, String longestWord) {
        this.commentsCount = commentsCount;
        this.wordsCount = wordsCount;
        this.longestWord = longestWord;
    }

    @Override
    public String toString() {
        return "CommentAnalysis{" +
                "commentsCount=" + commentsCount +
                ", wordsCount=" + wordsCount +
                ", longestWord='" + longestWord + '\'' +
                '}';
    }
}
