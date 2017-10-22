package pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@org.hibernate.annotations.Entity(dynamicUpdate=true)

@Table(name="Book")
public class Book {

	
	@Id
	@Column(name="Bid",unique=true,nullable= true)
	private String bookId;
	private String bookName;
	private String bookAuthor;
	private String bookInfo;
	private String max;
	private String available;
	public Book(String bookId, String bookName, String bookAuthor, String bookInfo, String max, String available) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookInfo = bookInfo;
		this.max = max;
		this.available = available;
	}
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
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
	public String getBookInfo() {
		return bookInfo;
	}
	public void setBookInfo(String bookInfo) {
		this.bookInfo = bookInfo;
	}
	public String getMax() {
		return max;
	}
	public void setMax(String max) {
		this.max = max;
	}
	public String getAvailable() {
		return available;
	}
	public void setAvailable(String available) {
		this.available = available;
	}

	
	
	
}
