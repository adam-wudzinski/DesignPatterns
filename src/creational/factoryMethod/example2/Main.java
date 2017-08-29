package creational.factoryMethod.example2;


import creational.factoryMethod.example2.creator.FacebookDataAnalyzer;
import creational.factoryMethod.example2.creator.SocialDataAnalyzer;
import creational.factoryMethod.example2.creator.TwitterDataAnalyzer;
import creational.factoryMethod.example2.product.SocialDataSource;
import creational.factoryMethod.example2.product.FacebookDataSource;
import creational.factoryMethod.example2.product.TwitterDataSource;
import creational.factoryMethod.example2.utils.Summary;
import creational.factoryMethod.example2.utils.analyzer.CommentsAnalyzerUtil;
import creational.factoryMethod.example2.utils.analyzer.UsersAnalyzerUtil;

/**
 *  Factory pattern implementation
 *  Idea is to:
 *  1. Get data from social media (DataSource).
 *  2. Analyze it (Analyzer)
 *  3. Display summary
 *
 *  Analyzer class is 'Creator' class - class which has Factory Method, and uses objects created by it
 *  DataSource classes are 'Product' classes - classes which are created by Factory Method
 *
 *  @see SocialDataAnalyzer - abstract Creator class
 *  @see TwitterDataAnalyzer - concrete implementation
 *  @see FacebookDataAnalyzer - concrete implementation
 *
 *  @see SocialDataSource - interface for Product classes
 *  @see FacebookDataSource - concrete implementaton
 *  @see TwitterDataSource - concrete implementaton
 *
 */
public class Main {

    public static void main(String[] args) {
        /* Example using Twitter as data source */
        SocialDataAnalyzer twitterDataAnalyzer = new TwitterDataAnalyzer(new CommentsAnalyzerUtil(), new UsersAnalyzerUtil());
        Summary twitterSummary = twitterDataAnalyzer.analyzeData();
        System.out.println(twitterSummary);

        /* Example using Facebook as data source */
        SocialDataAnalyzer facebookDataAnalyzer = new FacebookDataAnalyzer(new CommentsAnalyzerUtil(), new UsersAnalyzerUtil());
        Summary facebookSummary = facebookDataAnalyzer.analyzeData();
        System.out.println(facebookSummary);
    }
}
