
public class Osoba {
	String ime;
	String prezime;
	String oib;
	String adresa;
	String datRod;
	
	public Osoba() {
		ime = "";
		prezime = "";
		oib = "";
		adresa = "";
		datRod = "";
		}
		 // drugi konstruktor
		public Osoba(String i, String p, String o, String a, String d) {
		ime = i;
		prezime = p;
		oib = o;
		adresa = a;
		datRod = d;
		}
		
		public void AzurirajAdresu(String a) {
			if(a != null && !a.isEmpty())
			adresa = a;
			else System.out.println("Pogresan unos!");;
			}
		
		public void ProvjeraOIB() {
			try {
				long l = Long.parseLong(oib);
				if(l < 0) {
					System.out.println("OIB ne smije biti negativan broj!");
					return;
				}
			}
			catch(NumberFormatException nfe){
				System.out.println("OIB mora sadržavati samo znamenke!");
				return;
				}
				if( oib.length()!=11) {
				System.out.println("OIB mora sadržavati 11 znamenaka!");
				return;
				}
				else {
				System.out.println("OIB je ispravnog formata.");
				}
			}
		
		public void Ispis() {
			System.out.println("Ime: " +ime);
			System.out.println("Prezime: " + prezime);
			System.out.println("OIB: " + oib);
			System.out.println("Adresa: " + adresa);
			System.out.println("Datum Rodenja: " + datRod);
			}

		public void ProvjeraDatuma() {
			
			String[] values = datRod.split("-");
			int day = Integer.parseInt(values[0]);
	        int month = Integer.parseInt(values[1]);
	        int year = Integer.parseInt(values[2]);
	        if (day <= 31 && month <= 12 && year > 1900) {
	        	System.out.println("Datum rođenja je ispravnog formata.");
	        }
	        else {
	        	System.out.println("Datum nije ispravnog formata.");
	        	return;
	        }	      			
		} 
		
		public static boolean ProvjeraStringa(String s) {
		    /*if (s.isEmpty()) {
		        return false;
		    }
		    if (!Character.isJavaIdentifierStart(s.charAt(0))) {
		        return false;
		    }
		    for (int i = 1; i < s.length(); i++) {
		        if (!Character.isJavaIdentifierPart(s.charAt(i))) {
		            return false;
		        }
		    }
		    return true;*/
			if(s != null && !s.trim().isEmpty()) {
				System.out.println("String je validan.");
			}
			else {
				System.out.println("String je ne ispravan.");
				return false;
			}
			return true;
			
		}
		
	public static void main(String[] args) {
	//Osoba o1 = new Osoba(); // kreiramo objekt o1 klase Osoba
	//o1.ime = "Marko"; // definiramo ime objekta o1
	//o1.prezime = "Maric"; // definiramo prezime objekta o1
	//o1.oib = "01234567891"; // definiramo OIB objekta o1
	Osoba o2 = new Osoba("Ivan", "Horvat", "98765432100", "Matije Gupca 11, 33000 Virovitica", "17-11-2000");
	o2.Ispis();
	//System.out.println("Ime: " + o1.ime);
	//System.out.println("Prezime: " + o1.prezime);
	//System.out.println("OIB: " + o1.oib);
	o2.ProvjeraStringa("asdsa");
	o2.ProvjeraDatuma();
	}

}
