package model;

/**
 * @author sonjaml 2.3.2019
 */
 
public class Valuutta {
	private String tunnus;
	private double vaihtokurssi;
	private String nimi;
	
	public Valuutta(String tunnus, double vaihtokurssi, String nimi) {
		this.tunnus = tunnus;
		this.vaihtokurssi = vaihtokurssi;
		this.nimi = nimi;
	}
	
	public void setTunnus(String tunnus) {
		this.tunnus = tunnus;
	}
	
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public void setVaihtokurssi(double vaihtokurssi) {
		this.vaihtokurssi = vaihtokurssi;
	}
	
	public String getTunnus() {
		return this.tunnus;
	}

	
	public String getNimi() {
		return this.nimi;
	}

	public double getVaihtokurssi() {
		return this.vaihtokurssi;
	}

	@Override
	public String toString() {
		return "Valuutan tiedot: " + tunnus + ", " + vaihtokurssi + ", " + nimi;
	}

}
