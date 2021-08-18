public class HelloWord 
{
	public static void main(String[] args) 
	{
		Message m = new Message("Hello World");
		Message m1 = new Message("Hello World 2");
		Message m2 = new Message("Hello World 3");
		Message m3 = new Message("Hello World 4");
		Message m4 = new Message("Adicionada no terminal");
		Message m5 = new Message("Teste da chave ssh 2");
		AlternativeMessage am = new AlternativeMessage();
		
		m.setMessage("Olá mundo!");
		
		System.out.println(m.getMessage());
		
	}
	
}
