package pojo;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Entity(dynamicUpdate=true)

@Table(name="Student")
public class Student {
	
		
		
		@Id
		@Column(name="Sid",unique=true,nullable= true)
		private String studentId;
		private String studentName;
		private String studentClass;
		private String studentEmail;
		private String penalty;
		private String status;
		private String count;
		
		
	
		public Student(String studentId, String studentName, String studentClass, String studentEmail, String penalty,
				String status, String count) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.studentClass = studentClass;
			this.studentEmail = studentEmail;
			this.penalty = penalty;
			this.status = status;
			this.count = count;
		}public String getPenalty() {
			return penalty;
		}
		public void setPenalty(String penalty) {
			this.penalty = penalty;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getCount() {
			return count;
		}
		public void setCount(String count) {
			this.count = count;
		}
		public String getStudentId() {
			return studentId;
		}
		public void setStudentId(String studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public String getStudentClass() {
			return studentClass;
		}
		public void setStudentClass(String studentClass) {
			this.studentClass = studentClass;
		}
		public String getStudentEmail() {
			return studentEmail;
		}
		public void setStudentEmail(String studentEmail) {
			this.studentEmail = studentEmail;
		}
		

	}


