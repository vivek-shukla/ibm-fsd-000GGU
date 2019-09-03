package src.main.java.com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="instructor_detail")
@Data
@NoArgsConstructor
public class InstructorDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	@Column(name="youtube_channel")
	String youtubeChannel;
	@Column(name="hobby")
	String hobby;
	
	

}
