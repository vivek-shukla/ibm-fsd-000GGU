package Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="instructor")
@Data
@NoArgsConstructor
public class Instructor {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  private int id;
  @Column(name="firstName")
  private String firstName;
  @Column(name="lastName")
  private String lastName;
  @Column(name = "email")
  private String email;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name="instructor_id")
  private InstructorDetail instructorDetail;
  public Instructor(String firstName, String lastName, String email) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
  }
  public InstructorDetail getInstructorDetail() {
	return instructorDetail;
   }
  public void setInstructorDetail(InstructorDetail instructorDetail) {
	this.instructorDetail = instructorDetail;
  }

  
  
  
}
