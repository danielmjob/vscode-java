package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {

    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); // formatar a data usando um padrão statico

    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<Comment>();

    public Post() {
    }

 //Por padrão o tipo List NÃO está dentro do construtor
    public Post(LocalDateTime moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

 // Por padrão não é criado o set para o tipo LIST
    public void addComment(Comment comment){
        comments.add(comment);
    }

    public void removeComment(Comment comment){
        comments.remove(comment);
    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();

        sb.append(title + "\n \n");
        sb.append(likes + " likes - ");
        sb.append(dtf.format(moment) + "\n"); // aqui uso a formatação da data
        sb.append(content + "\n");
        sb.append("Comments: \n");
        
     //percorrer todos os comentários
        for (Comment allcomment : comments) {
            sb.append(allcomment.getText() + "\n");
        }

        return sb.toString();
    }
    
}
