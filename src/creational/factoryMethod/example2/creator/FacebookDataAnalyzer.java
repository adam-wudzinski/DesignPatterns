package creational.factoryMethod.example2.creator;

import creational.factoryMethod.example2.product.FacebookDataSource;
import creational.factoryMethod.example2.product.SocialDataSource;
import creational.factoryMethod.example2.utils.analyzer.CommentsAnalyzerUtil;
import creational.factoryMethod.example2.utils.analyzer.UsersAnalyzerUtil;

/**
 * Concrete 'Creator' class - Uses Facebook as dataSource
 */
public class FacebookDataAnalyzer extends SocialDataAnalyzer {

    public FacebookDataAnalyzer(CommentsAnalyzerUtil commentsAnalyzer, UsersAnalyzerUtil usersAnalyzer) {
        super(commentsAnalyzer, usersAnalyzer);
    }

    @Override
    protected SocialDataSource createDataSource() {
        return new FacebookDataSource();
    }
}
