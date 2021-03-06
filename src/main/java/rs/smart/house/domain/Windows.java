package rs.smart.house.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
public class Windows extends AbstractEntity {

	@JsonIgnore
	@ManyToOne
	Devices device;
	
	boolean power;
	
	String room;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Devices getDevice() {
		return device;
	}

	public void setDevice(Devices device) {
		this.device = device;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
	public boolean changePower(){
		power = !power;
		return power;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}
	

}
