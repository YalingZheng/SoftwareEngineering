import java.util.Date;

public class Twits {
	Date date;
	String user;
	String message;	
	
	public Twits(String user, String message) {
		super();
		Date curdate = new Date();
		setDate(curdate);
		setUser(user);
		setMessage(message);
	}
	public Date getDate() {
		return date;
	}
	private void setDate(Date date) {
		this.date = date;
	}
	public String getUser() {
		return user;
	}
	private void setUser(String user) {
		this.user = user;
	}
	public String getMessage() {
		return message;
	}
	private void setMessage(String message) {
		this.message = message;
	}

}
