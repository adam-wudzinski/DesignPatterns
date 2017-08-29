package creational.factoryMethod.example2.product;

import java.util.Arrays;
import java.util.List;

/**
 * Concrete 'Product' class - Gets basic data from Facebook
 */
public class FacebookDataSource implements SocialDataSource {

    @Override
    public List<String> getComments() {
        return Arrays.asList("#FB","Only FB", "I <3 FB");
    }

    @Override
    public Integer getLikesCount() {
        return Integer.valueOf(100);
    }

    @Override
    public List<String> getUsers() {
        return Arrays.asList("Pawel Noga", "Mariusz Marek", "Marek Mario",  "Marek Kozak");
    }
}
