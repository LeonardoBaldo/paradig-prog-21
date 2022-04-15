package br.com.unifacef.lista3.ex4;

import java.util.ArrayList;

public class Post {
    private int code, likes;
    private String author, text;
    // objeto-parte
    private ArrayList<Comment>comments;

    public Post() {
        comments = new ArrayList();
    }

    public Post(int code, int likes, String author, String text, ArrayList<Comment> comments) {
        this.code = code;
        this.likes = likes;
        this.author = author;
        this.text = text;
        this.comments = comments;
    }
    

    public Post(int code, String author, String text) {
        this.code = code;
        this.author = author;
        this.text = text;
        this.likes = 0;
        this.comments = new ArrayList();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }
    
    public void addComment(Comment comment)
    {
        this.comments.add(comment);
        System.out.println("Comentário inserido");
    }

    public void removeComment(Comment comment)
    {
        if (this.comments.remove(comment))
        {
            System.out.println("Comentário removido");
        }
        else
        {
            System.out.println("Comentárip não existe");
        }
    }

    @Override
    public String toString() {
        return "Post{" + "code=" + code + ", likes=" + likes + ", author=" + author + ", text=" + text + ", comments=" + comments + '}';
    }
    
    
    
}
