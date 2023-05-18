package team0301.CalendarExportService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="event")
public class Event {
	
	@Id
	private Integer eventID;
	
	private String eventName;
    private String date;
    private String location;
    private String description;
    
    public Event() {
		this(0, "", "", "", "");
	}

	public Event(Integer eventID, String eventName, String date, String location, String description) {
		this.eventID = eventID;
		this.eventName = eventName;
		this.date = date;
		this.location = location;
		this.description = description;
	}

	public Integer getEventID() {
		return eventID;
	}

	public void setEventID(Integer eventID) {
		this.eventID = eventID;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
    
    

}
