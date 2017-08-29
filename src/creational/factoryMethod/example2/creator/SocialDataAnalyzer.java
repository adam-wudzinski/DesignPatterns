package creational.factoryMethod.example2.creator;

import creational.factoryMethod.example2.utils.analysis.CommentsAnalysis;
import creational.factoryMethod.example2.utils.analysis.UsersAnalysis;
import creational.factoryMethod.example2.utils.analyzer.CommentsAnalyzerUtil;
import creational.factoryMethod.example2.utils.Summary;
import creational.factoryMethod.example2.product.SocialDataSource;
import creational.factoryMethod.example2.utils.analyzer.UsersAnalyzerUtil;

/**
 * Main 'Creator' class.
 *
 * Uses createDataSource() as Factory Method.
 * Factory method returns specific object which is later used in other methods in this class.
 * Class is more focused on these other tasks. In this scenario it's focused on analyzing data,
 * and Factory Method is used to avoid tight coupling with DataSource.
 */
public abstract class SocialDataAnalyzer {

    private CommentsAnalyzerUtil commentsAnalyzer;
    private UsersAnalyzerUtil usersAnalyzer;
    private SocialDataSource dataSource;

    public SocialDataAnalyzer(CommentsAnalyzerUtil commentsAnalyzer, UsersAnalyzerUtil usersAnalyzer) {
        this.commentsAnalyzer = commentsAnalyzer;
        this.usersAnalyzer = usersAnalyzer;
        this.dataSource = createDataSource();
    }

    /**
     * This is the main responsibility of this class - to analyze data.
     * Factory Method is used to provide source of data.
     *
     * @return result of analysis
     */
    public Summary analyzeData(){
        CommentsAnalysis commentsAnalysis = commentsAnalyzer.analyze(dataSource.getComments());
        UsersAnalysis usersAnalysis = usersAnalyzer.analyze(dataSource.getUsers());
        long likesCount = dataSource.getLikesCount();
        return new Summary(commentsAnalysis, usersAnalysis, likesCount);
    }

    /**
     * Factory method to be overriden.
     *
     * @return specific DataSource Implementation
     */
    protected abstract SocialDataSource createDataSource();

}
