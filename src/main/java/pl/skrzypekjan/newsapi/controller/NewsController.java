package pl.skrzypekjan.newsapi.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.skrzypekjan.newsapi.config.HttpClient;
import pl.skrzypekjan.newsapi.dao.NewsDao;

@Controller
public class NewsController {

    private HttpClient httpClient;
    private NewsDao newsDao;

    @Autowired
    public NewsController(HttpClient httpClient, NewsDao newsDao){
        this.httpClient = httpClient;
        this.newsDao = newsDao;
    }

    @GetMapping
    public String getNews(Model model){
        model.addAttribute("news", httpClient.getArticleList());
        return "news";
    }
}
