package aplication;

import entities.Comment;
import entities.Post;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's aweosome!");

        Post p1 = new Post(LocalDateTime.now(),
            "Traveling to New Zeland",
            "I'm going to visito this wonderful country!",
            12);


        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
    }
}
