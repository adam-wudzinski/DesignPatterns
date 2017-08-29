package creational.factoryMethod.example2.product;

import java.util.Arrays;
import java.util.List;

/**
 * Concrete Product class - Gets basic data from Twitter
 */
public class TwitterDataSource implements SocialDataSource {

    @Override
    public List<String> getComments() {
        return Arrays.asList("Very long comment...","Hello world", "Nice pattern", "Welcome everyone", "Last comment");
    }

    @Override
    public Integer getLikesCount() {
        return Integer.valueOf(532);
    }

    @Override
    public List<String> getUsers() {
        return Arrays.asList("Pawel Noga", "Olek Polanski", "Domino Sobo","Marek Mario", "Bartek Haliniak");
    }
}
