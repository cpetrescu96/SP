
public class Tabel implements ElementPagina {
	public String numeTabel;
	
	public Tabel(String numeTabel){
		this.numeTabel = numeTabel;
	}
	
	public void show(){
		System.out.print("Tabel");
	}

	public void addElement(ElementPagina e) {
		// TODO Auto-generated method stub
		
	}

	public void removeElement(ElementPagina e) {
		// TODO Auto-generated method stub
		
	}

	public int getElements() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void print() {
		System.out.println("Showing table :"+this.numeTabel);
	}

}
