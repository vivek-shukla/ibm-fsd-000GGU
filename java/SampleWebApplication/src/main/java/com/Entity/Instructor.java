package src.main.java.com.Entity;

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
  int id;
  @Column(name="firstName")
  String firstName;
  @Column(name="lastName")
  String lastName;
  @Column(name = "email")
  String email;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name="instructor_id")
  int instructorDetailId;
  
}
