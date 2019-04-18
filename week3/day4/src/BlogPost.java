import java.util.ArrayList;
import java.util.List;

public class BlogPost {
    String austhorName;
    String title;
    String text;
    String duplicationDate;

    public BlogPost(String austhorName, String title, String text, String duplicationDate) {
    }


    public static void main(String[] args) {
        BlogPost FirstBlogPost = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
        BlogPost SecondBlogPost = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");

        BlogPost ThirdBlogPost = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. \n" +
                "When I asked to take his picture outside one of IBM’s New York City offices, \n" +
                "he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28.");
        List<BlogPost> blogPosts = new ArrayList<>();
        blogPosts.add(0,FirstBlogPost);
        blogPosts.add(1,SecondBlogPost);
        blogPosts.add(2,ThirdBlogPost);
        System.out.println(blogPosts);
        blogPosts.remove(1);
        blogPosts.add(1,ThirdBlogPost);


    }
}