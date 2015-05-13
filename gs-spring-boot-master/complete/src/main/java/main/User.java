package main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	private String nickname;
	private Vehicle vehicle;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id; 
	
	public User (String nickname) {
		this.nickname = nickname;
	}
	
	public void setVehicle(Vehicle setVehicle) {
		this.vehicle = vehicle;
	}
	
	protected User() {}
	
	public String getNickname() {
		return this.nickname;
	}
	
	public Vehicle getVehicle() {
		return this.vehicle;
	}
	
	@Override
    public String toString() {
        return String.format("User[nickname='%s']", nickname);
    }
}
