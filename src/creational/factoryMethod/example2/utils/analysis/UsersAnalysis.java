package creational.factoryMethod.example2.utils.analysis;

import java.util.Map;

/**
 * POJO class.
 * Not a part of this Design Pattern.
 */
public class UsersAnalysis {
    private Map<String, Long> distinctFirstNamesCount;
    private Map<String, Long> distinctSecondNamesCount;

    public UsersAnalysis(Map<String, Long> distinctFirstNamesCount, Map<String, Long> distinctSecondNamesCount) {
        this.distinctFirstNamesCount = distinctFirstNamesCount;
        this.distinctSecondNamesCount = distinctSecondNamesCount;
    }

    @Override
    public String toString() {
        return "UsersAnalysis{" +
                "distinctFirstNamesCount=" + distinctFirstNamesCount +
                ", distinctSecondNamesCount=" + distinctSecondNamesCount +
                '}';
    }
}
