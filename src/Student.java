import java.util.ArrayList;
import java.util.List;

public class Student extends Osoba{


	String jmbag;
	///int sumaECTS;
	ArrayList<Predmet> lista_predmeta;
		

	public Student(String i, String p, String o, String a, String d, String jmbag, /*int sumaECTS,*/
			ArrayList<Predmet> lista_predmeta) {
		super(i, p, o, a, d);
		this.jmbag = jmbag;
		//this.sumaECTS = sumaECTS;
		this.lista_predmeta = lista_predmeta;
	}

	/*public Student(String j, int suma, ArrayList<Predmet> l) {
		jmbag = j;
		sumaECTS = suma;
		lista_predmeta = l;
	}*/
	int suma = 0;
	public int SumaEctsa() {
		
		lista_predmeta.forEach(lp -> {
		   suma += lp.ECTS; 
		});
		return suma;
	}
	public static void main(String[] args) {
		
		ArrayList<Predmet> predmeti = new ArrayList<Predmet>();
		predmeti.add(new Predmet("OOP", 9));
		predmeti.add(new Predmet("MAT", 9));
		predmeti.add(new Predmet("FIZ", 3));
		ArrayList<Predmet> predmeti2 = new ArrayList<Predmet>();
		predmeti2.add(new Predmet("OOP", 3));
		predmeti2.add(new Predmet("MAT", 3));
		predmeti2.add(new Predmet("FIZ", 3));
		ArrayList<Student> studenti = new ArrayList<Student>();
		
		Student s1 = new Student("Ivan", "Horvat", "98765432100", "Matije Gupca 11, 33000 Virovitica", "17-11-2000", "123123123",  predmeti);
		Student s2 = new Student("Matej", "Zec", "98765432100", "Matije Gupca 11, 33000 Virovitica", "17-11-2000", "123123123",  predmeti2);
		studenti.add(s1);
		studenti.add(s2);
		studenti.forEach(s -> {
			System.out.println(s.ime + " " + s.prezime + " " + s.SumaEctsa() ); 
			});
		
		//System.out.println("Ime: " + o1.ime);
		//System.out.println("Prezime: " + o1.prezime);
		//System.out.println("OIB: " + o1.oib);
		//o2.ProvjeraStringa("");
		}

}
