public class ProjectMain {
    public static void main(String[] args) {
        PostIt First = new PostIt("Orange", "Blue", "Idea1");
        PostIt Second = new PostIt("Pink","Awesome","Awesome");
        PostIt Third = new PostIt("Yellow","Superb","Green");
        BlogPost FirstBlogPost = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.","2000.05.04.");
        BlogPost SecondBlogPost = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.","2010.10.10.");

        BlogPost ThirdBlogPost = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. \n" +
                "When I asked to take his picture outside one of IBM’s New York City offices, \n" +
                "he told me that he wasn’t really into the whole organizer profile thing.","2017.03.28.");
    }
}
