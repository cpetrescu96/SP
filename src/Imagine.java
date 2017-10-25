
public class Imagine implements ElementPagina {
	public String imagePath;
	
	public Imagine(String imagePath){
		this.imagePath = imagePath;
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
		System.out.println("Showing image from :"+this.imagePath);
	}

}
