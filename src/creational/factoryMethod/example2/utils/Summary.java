package creational.factoryMethod.example2.utils;

import creational.factoryMethod.example2.utils.analysis.CommentsAnalysis;
import creational.factoryMethod.example2.utils.analysis.UsersAnalysis;

/**
 * POJO class.
 * Not a part of this Design Pattern.
 */
public class Summary {

    private CommentsAnalysis commentsAnalysis;
    private UsersAnalysis usersAnalysis;
    private long likesCount;

    public Summary(CommentsAnalysis commentsAnalysis, UsersAnalysis usersAnalysis, long likesCount) {
        this.commentsAnalysis = commentsAnalysis;
        this.usersAnalysis = usersAnalysis;
        this.likesCount = likesCount;
    }

    @Override
    public String toString() {
        return "Summary{\n" +
                "commentsAnalysis=" + commentsAnalysis +
                ",\n usersAnalysis=" + usersAnalysis +
                ",\n likesCount=" + likesCount +
                "}\n";
    }
}
