package Activities;

public class CustomException8 extends Exception{
	private String message;
	
	public CustomException8(String msg) {
		message = msg;
	}
	
	public String getmessage() {
		return message;
	}

}
