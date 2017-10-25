public class Paragraf extends AbstractElement{
	public String text;
	
	public Paragraf(String text){
		this.text = text;
	}
	
	public void addText(String text){
		this.text+=text;
	}
	
	public void show(){
		System.out.println("Paragraf");
	}

	public void print() {
		System.out.println(this.text);	
	}

}
