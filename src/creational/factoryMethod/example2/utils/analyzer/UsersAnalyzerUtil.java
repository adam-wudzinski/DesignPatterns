package creational.factoryMethod.example2.utils.analyzer;

import creational.factoryMethod.example2.utils.analysis.UsersAnalysis;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Util class - Analyzes users data.
 * Not a part of this Design Pattern.
 */
public class UsersAnalyzerUtil {

    public UsersAnalysis analyze(List<String> users) {
        Map<String, Long> distinctFirstNamesCount = users.stream()
                .map(user -> user.split(" ")[0])
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> distinctSecondNamesCount = users.stream()
                .map(user -> user.split(" ")[1])
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return new UsersAnalysis(distinctFirstNamesCount, distinctSecondNamesCount);
    }
}
