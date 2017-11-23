
public class Test {
	
	public static void main(String[] args) {

		Carte c = new Carte("Awesome Title",new Cuprins());
		c.getCapitole().add(new Sectiune("Sectiunea I"));

		
		Sectiune a = new Sectiune("Sectiunea I.1");
		a.elemente.add(new Imagine("	Image 1"));
		a.elemente.add(new Paragraf("paragraf nou",c.leftAlign));
		a.elemente.add(new Paragraf("paragraf nou",c.centerAlign));
		
		
		c.getCapitole().add(a);
		
		Sectiune b = new Sectiune("Sectiunea II");
		b.elemente.add(new Paragraf("A paragraph conveying important information",c.rightAlign));
		b.elemente.add(new Imagine("Image 10"));
		b.elemente.add(new Imagine("Image 11"));
		
		
		c.getCapitole().add(b);
		
		c.printBook();
		
}
}
