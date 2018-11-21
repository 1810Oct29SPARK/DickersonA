
public class Llama extends Vehicle{
	
	
	public Llama() {
		System.out.println("Jeremy's Llama has escaped!");
					}
	
	public Llama(String hair){
			this.hair = hair;
	}
	private String hair;
	
	/*private void Spit (){
	System.out.println("The Llama prepares it's spit attack!");
	}*/
	
	public void move() {
		System.out.println("This Llama is on a rampage");
	}
	
	public void setHair(String hair){
		this.hair = hair;
		
	}
	
	public String getHair(){
		return this.hair;
}
}