import java.util.List;

public class BlogPost {
    private String authorName;
    private String title;
    private String text;
    private String duplicationDate;

    public BlogPost(String authorName, String title, String text, String duplicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.duplicationDate = duplicationDate;
    }


    public static void main(String[] args){
        BlogPost first = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolo...", "01. 02. 2019.");
        BlogPost second = new BlogPost("X.y.", "Blabla","SGRWHFEWGRHTBEQAFSFGDTSTHN","02.01.2018.");
        Blog blog = new Blog();
        blog.add(first);
        blog.add(second);
        blog.delete(1);
        blog.update(0, second);

    }
}