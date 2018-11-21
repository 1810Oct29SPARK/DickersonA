public class Llama extends Vehicle{
	
	
	private Llama(){
		System.out.println("Jeremy's Llama has escaped!");
	}
	
	private Llama(String Hair){
			this.Hair=Hair;
	}
	private void Spit (){
	System.out.println("The LLama prepares it's spit attack!");
	}
	private String Hair;
	public void move() {
		System.out.println("This Llama is on a rampage");
	}
	
	public void setHair(){
		this.Hair=Hair;
		
	}
	
	public String getHair(){
		return this.Hair;
}
}