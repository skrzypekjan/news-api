package pl.skrzypekjan.newsapi.model;

public class News {

    long newsId;
    String title;
    String description;
    String url;
    String urlImage;
    String publishedAt;
    String content;

    public News(long id, String title, String description, String url, String urlImage, String publishedAt, String content) {
        this.newsId = id;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlImage = urlImage;
        this.publishedAt = publishedAt;
        this.content = content;
    }

    public long getId() {
        return newsId;
    }

    public void setId(long id) {
        this.newsId = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", urlImage='" + urlImage + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
