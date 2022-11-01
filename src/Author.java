public class Author {
    private String authorName;
    private String authorLastName;
    public Author (String name, String lastName){
        this.authorName = name;
        this.authorLastName = lastName;
    }

    public String getAuthor() {
        return this.authorName + " " + this.authorLastName;
    }
}
