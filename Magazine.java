public class Magazine extends LibaryItem {
    private int issueNumber;
    private String publisher;

    public Magazine(int issueNumber, String title, String publisher, int yearPublished) {
        super(title, yearPublished);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDetail() {
        return "[IssueNumber: "+issueNumber+", title: "+ getTitle()+", Publisher: "+publisher+",YearPublished: "+getYearPublished()+"]";
        
    }
}
