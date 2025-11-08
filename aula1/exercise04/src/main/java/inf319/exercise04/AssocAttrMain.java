package inf319.exercise04;

public class AssocAttrMain {

	private static Companhia cb, ca, cc;
	private static Pessoa pa, pb, pc;
	
	public static void main(String[] args) {
		ca = new Companhia("CA");
		cb = new Companhia("CB");
		cc = new Companhia("CC");
		pa = new Pessoa("NA", "SA");
		pb = new Pessoa("NB", "SB");
		pc = new Pessoa("NC", "SC");
		
		ca.emprega(pa, 10000.00);
		ca.emprega(pb, 5000.00);
		
		cb.emprega(pa, 1000.0);
		cb.emprega(pb, 12000.0);
		
		cb.demite(pa);
        cb.demite(pb);
        cc.emprega(pa, 2000.00);

        cc.emprega(pc, 2000.00);
	}

}
