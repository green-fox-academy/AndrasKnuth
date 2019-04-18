import java.util.ArrayList;
import java.util.List;

public class Blog {
    public List<BlogPost> blogPosts;

    public Blog () {
        this.blogPosts = new ArrayList<>();
    }
    void add(BlogPost blogPost) {
        this.blogPosts.add(blogPost);
    }
    void delete(int index) {
        this.blogPosts.remove(index);
    }
    void update(int index, BlogPost blogPost) {
        this.blogPosts.set(index, blogPost);
    }
}
/*
Create a Blog class which can
 - store a list of BlogPosts
 - add BlogPosts to the list
 - delete(int) one item at given index
 - update(int, BlogPost) one item at the given index and update it with another BlogPost
 */

