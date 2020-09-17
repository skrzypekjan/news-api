package pl.skrzypekjan.newsapi.dao;

import pl.skrzypekjan.newsapi.model.News;

import java.util.List;

public interface NewsDao {
    List<News> getNews();
    void saveNews();
}
