package model;
/**
 * @author sonjaml 20.2.2019
 */
public class Valuuttakone implements Valuuttakone_IF {
	private Valuutta[] valuutat;
	
	public Valuuttakone() {
		Valuutta euro = new Valuutta("Euroopan euro", 1.0);
		Valuutta ruotsinKruunu = new Valuutta("Ruotsin kruunu", 9.4780);
		Valuutta norjanKruunu = new Valuutta("Norjan kruunu", 8.9018);
		Valuutta usd = new Valuutta("Yhdysvaltain dollari", 1.0629);
		this.valuutat = new Valuutta[] {euro, ruotsinKruunu, norjanKruunu, usd};
	}

	@Override
	public String[] getVaihtoehdot() {
		String[] vaihtoehdot = new String[this.valuutat.length];
		int i = 0;
		for (Valuutta valuutta : this.valuutat) {
			vaihtoehdot[i] = valuutta.getNimi();
			i++;
		}
		return vaihtoehdot;
	}

	@Override
	public double muunna(int mistäIndeksi, int mihinIndeksi, double määrä) {
		return ( määrä / this.valuutat[mistäIndeksi].getVaihtokurssi()) * 
				this.valuutat[mihinIndeksi].getVaihtokurssi();		
	}

}
