package creational.factoryMethod.example2.utils.analyzer;

import creational.factoryMethod.example2.utils.analysis.CommentsAnalysis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Util class - Analyzes comments data.
 * Not a part of this Design Pattern.
 */
public class CommentsAnalyzerUtil {

    public CommentsAnalysis analyze(List<String> comments) {
        long commentsCount = comments.size();
        long wordsCount = comments.stream()
                .map(string -> string.split(" "))
                .flatMap(Arrays::stream)
                .count();
        Optional<String> longestWord = comments.stream()
                .map(string -> string.split(" "))
                .flatMap(Arrays::stream)
                .max(Comparator.comparingInt(String::length));
        return new CommentsAnalysis(commentsCount, wordsCount, longestWord.orElse(""));
    }
}
