package pojo;
import java.util.Date;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@org.hibernate.annotations.Entity(dynamicUpdate=true)

@Table(name="IssuedDetails")
public class IssuedDetails {

	//private String bookId;
	private String bookName;
	//private String studentId;
	private Date issueDate;
	private Date returnDate;
	private Boolean returnedStatus;
	
	@ManyToOne(optional=false)
    @JoinColumn(name="studentId")
	private Student student;
	
	@ManyToOne(optional=false)
    @JoinColumn(name="bookId")
	private Book book;
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
/*	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
*/	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/*public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}*/
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date issueDate) {
		issueDate.setDate(issueDate.getDate()+14);
		this.returnDate=issueDate;
	}
	public Boolean getReturnedStatus() {
		return returnedStatus;
	}
	public void setReturnedStatus(Boolean returnedStatus) {
		this.returnedStatus = returnedStatus;
	}
	
	
}
