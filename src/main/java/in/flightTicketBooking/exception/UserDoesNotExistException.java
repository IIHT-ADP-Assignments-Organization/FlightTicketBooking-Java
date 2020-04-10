package in.flightTicketBooking.exception;

public class UserDoesNotExistException extends Exception{
	public static  String message="user already exists !..please login";


	public UserDoesNotExistException()
	{
		
	}
	public UserDoesNotExistException(String message)
	{
		this.message=message;
	}
}
