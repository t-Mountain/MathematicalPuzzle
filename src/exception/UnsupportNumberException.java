package exception;

public class UnsupportNumberException extends Exception {
	
	public UnsupportNumberException() {};
	
	public UnsupportNumberException(String message) {
		super(message);
	}
	
	public UnsupportNumberException(Throwable cause) {
		super(cause);
	}
	
	public UnsupportNumberException(String message, Throwable cause) {
		super(message, cause);
	}

}
