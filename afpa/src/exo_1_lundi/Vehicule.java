package exo_1_lundi;

public class Vehicule {
	private int roues;
	private String carburant;
	private int vitesseMax;
	private int contenanceReservoir;
	private int contenuReservoir;
	
	public Vehicule(int roues, String carburant, int vitesseMax, int contenanceReservoir, int contenuReservoir) {
		super();
		this.roues = roues;
		this.carburant = carburant;
		this.vitesseMax = vitesseMax;
		this.contenanceReservoir = contenanceReservoir;
		this.contenuReservoir = contenuReservoir;
	}
	
	public void fairePlein(Pompe p) {
		int contenuPompe = p.getContenu();
		int besoinMoteur = this.contenanceReservoir - this.contenuReservoir;
		if(contenuPompe>=besoinMoteur) {
			int newContenuPompe = contenuPompe - besoinMoteur;
			this.contenuReservoir += besoinMoteur;
			p.setContenu(newContenuPompe);
		}else {
			int newContenuPompe = 0;
			this.contenuReservoir += contenuPompe;
			p.setContenu(newContenuPompe);
		}
	}
	
	public int getRoues() {
		return roues;
	}
	public void setRoues(int roues) {
		this.roues = roues;
	}
	public String getCarburant() {
		return carburant;
	}
	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}

	public int getVitesseMax() {
		return vitesseMax;
	}

	public void setVitesseMax(int vitesseMax) {
		this.vitesseMax = vitesseMax;
	}

	public int getContenanceReservoir() {
		return contenanceReservoir;
	}

	public void setContenanceReservoir(int contenanceReservoir) {
		this.contenanceReservoir = contenanceReservoir;
	}

	public int getContenuReservoir() {
		return contenuReservoir;
	}

	public void setContenuReservoir(int contenuReservoir) {
		this.contenuReservoir = contenuReservoir;
	}
	
}
