import java.time.LocalDateTime;

import entities.Comment;
import entities.Post;

public class App {
    public static void main(String[] args) {

        // Feito em HARD CODE tudo foi adicionado via codigo sem entrada do usuário externo

        System.out.println();

        String title1 = "Traveling to New Zealand";

        int like1 = 12;

        LocalDateTime momentAtual = LocalDateTime.now();

        String content1 = "I'm going to visit this wonderful country!";

        String c1 = "Have a nice trip";
        String c2 = "Wow that's awesome!";

        Comment comment1 = new Comment(c1);
        Comment comment2 = new Comment(c2);

       Post post1 = new Post(momentAtual, title1, content1, like1);
       post1.addComment(comment1);
       post1.addComment(comment2);

       System.out.println(post1.toString());


       System.out.println();


       String title2 = "Good night guys";
       int like2 = 5;
       momentAtual = momentAtual.plusMinutes(10).plusSeconds(10); // somei 10 min e 10 segundos na hora do primeiro só pra dar uma leve diferença

       String content2 = "See you tomorrow";

       String c3 = "Good night";
       String c4 = "May the Force be with you";

       Comment comment3 = new Comment(c3);
       Comment comment4 = new Comment(c4);

        Post post2 = new Post(momentAtual, title2, content2, like2);
        post2.addComment(comment3);
        post2.addComment(comment4);

        System.out.println(post2.toString());

    }
}
