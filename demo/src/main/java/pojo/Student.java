package pojo;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Entity(dynamicUpdate=true)

@Table(name="Student")
public class Student {
	
		
		
		@Id
		@Column(name="Sid",unique=true,nullable= true)
		private String studentId;
		public Boolean getPenalty() {
			return penalty;
		}
		public void setPenalty(Boolean penalty) {
			this.penalty = penalty;
		}
		public Boolean getStatus() {
			return status;
		}
		public void setStatus(Boolean status) {
			this.status = status;
		}
		public Boolean getCount() {
			return count;
		}
		public void setCount(Boolean count) {
			this.count = count;
		}
		private String studentName;
		private String studentClass;
		private String studentEmail;
		private Boolean penalty;
		private Boolean status;
		private Boolean count;
		
		
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


