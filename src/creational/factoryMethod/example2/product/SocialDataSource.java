package creational.factoryMethod.example2.product;

import java.util.List;

/**
 * All 'Product' classes have to implement this interface in order to let 'Creator' class use them
 */
public interface SocialDataSource {
    List<String> getComments();
    Integer getLikesCount();
    List<String> getUsers();
}
