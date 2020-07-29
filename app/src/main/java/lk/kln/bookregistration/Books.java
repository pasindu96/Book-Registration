package lk.kln.bookregistration;

public class Books {
    private String ISBNo,name,author,pulisher;

    public Books() {
    }

    public Books(String ISBNo, String name, String author, String pulisher) {
        this.ISBNo = ISBNo;
        this.name = name;
        this.author = author;
        this.pulisher = pulisher;
    }

    public String getISBNo() {
        return ISBNo;
    }

    public void setISBNo(String ISBNo) {
        this.ISBNo = ISBNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPulisher() {
        return pulisher;
    }

    public void setPulisher(String pulisher) {
        this.pulisher = pulisher;
    }

    @Override
    public String toString() {
        return "Books{" +
                "ISBNo='" + ISBNo + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pulisher='" + pulisher + '\'' +
                '}';
    }
}
