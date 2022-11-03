public class Author {
    private String authorName;
    private String authorLastName;

    public Author(String name, String lastName) {
        authorName = name;
        authorLastName = lastName;
    }

    public String getAuthor() {
        return authorName + " " + authorLastName;
    }

    @Override
    public String toString() {
        return authorName + " " + authorLastName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return authorName.equals(c2.authorName) && authorLastName.equals(c2.authorLastName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorName, authorLastName);
    }
}
