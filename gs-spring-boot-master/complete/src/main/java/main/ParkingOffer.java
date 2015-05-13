package main;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
public class ParkingOffer {

	@Id
	@GeneratedValue
	private long id;
	
	@OneToOne
	User user;
	Location location;
	
	@CreatedDate
	private Date createdDate;
	
	@LastModifiedDate
	private Date modifiedDate;
	
	public ParkingOffer(User user, Location location) {
		this.user = user;
		this.location = location;
	}
	
	protected ParkingOffer() {}
	
}
