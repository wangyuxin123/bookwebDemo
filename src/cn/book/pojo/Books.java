package cn.book.pojo;


import java.util.Date;

public class Books {

  private long bookId;
  private String bookName;
  private String bookAuthor;
  private String bookPublish;
  private long bookPage;
  private double bookPrive;
  private Date createDate;


  public long getBookId() {
    return bookId;
  }

  public void setBookId(long bookId) {
    this.bookId = bookId;
  }


  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }


  public String getBookAuthor() {
    return bookAuthor;
  }

  public void setBookAuthor(String bookAuthor) {
    this.bookAuthor = bookAuthor;
  }


  public String getBookPublish() {
    return bookPublish;
  }

  public void setBookPublish(String bookPublish) {
    this.bookPublish = bookPublish;
  }


  public long getBookPage() {
    return bookPage;
  }

  public void setBookPage(long bookPage) {
    this.bookPage = bookPage;
  }


  public double getBookPrive() {
    return bookPrive;
  }

  public void setBookPrive(double bookPrive) {
    this.bookPrive = bookPrive;
  }


  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

}
