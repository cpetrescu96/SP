public class Paragraf implements ElementPagina{
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

	public void addElement(ElementPagina e){}		
	public void removeElement(ElementPagina e) {}
	public int getElements() { return 0;}

	public void print() {
		System.out.println(this.text);
		
	}

}
