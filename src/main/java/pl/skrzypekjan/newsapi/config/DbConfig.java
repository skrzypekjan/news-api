package pl.skrzypekjan.newsapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DbConfig {

    private DataSource dataSource;

    @Autowired
    public DbConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(dataSource);
    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void init() {
//        String sql = "CREATE TABLE news(news_id int, title varchar(255), description varchar(255), url varchar(255)," +
//                " urlImage varchar(255), publishedAt varchar(255), content varchar(255), PRIMARY KEY (news_id))";
//        getJdbcTemplate().update(sql);
//    }
}
