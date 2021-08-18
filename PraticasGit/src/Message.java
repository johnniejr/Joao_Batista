//This class shows a message
public class Message 
{
	private String msg;
	
	Message(String phrase)
	{
		this.msg = phrase;
		System.out.println("A mensagem que construiu essa classe é: " + msg);
		
	}
	
	public String getMessage()
	{
		return msg;
	}
	
	public void setMessage(String phrase)
	{
		this.msg = phrase;
	}
}
