package creational.factoryMethod.example2.creator;

import creational.factoryMethod.example2.product.SocialDataSource;
import creational.factoryMethod.example2.product.TwitterDataSource;
import creational.factoryMethod.example2.utils.analyzer.CommentsAnalyzerUtil;
import creational.factoryMethod.example2.utils.analyzer.UsersAnalyzerUtil;

/**
 * Concrete 'Product' class - Uses Twitter as dataSource
 */
public class TwitterDataAnalyzer extends SocialDataAnalyzer {

    public TwitterDataAnalyzer(CommentsAnalyzerUtil commentsAnalyzer, UsersAnalyzerUtil usersAnalyzer) {
        super(commentsAnalyzer, usersAnalyzer);
    }

    @Override
    protected SocialDataSource createDataSource() {
        return new TwitterDataSource();
    }
}
