import javax.swing.JOptionPane;


public class Ascenseur extends Thread  {
	
	protected int numero;
	protected int p_actuel;
	protected int p_final;
	protected int etage_intermediaire[];
	protected int zone;
	protected int etat; // 0=libre ; 1=monter ; 2=descendre ; 3=porte ouverte ; 4=panne

	public Ascenseur()
	{
		super("0");
		this.numero = 0;
		this.p_actuel = 0;
		this.p_final = 0;
		this.zone = 0;
		this.etat = 0;
	}
	
	public Ascenseur(int num,int actuel,int zone, int etat)
	{
		super(String.valueOf(num));
		this.numero = num;
		this.p_actuel = actuel;
		this.p_final = actuel;
		this.zone = zone;
		this.etat = etat;		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getP_actuel() {
		return p_actuel;
	}

	public void setP_actuel(int p_actuel) {
		this.p_actuel = p_actuel;
	}

	public int getP_final() {
		return p_final;
	}

	public void setP_final(int p_final) {
		this.p_final = p_final;
	}

	public int[] getEtage_intermediaire() {
		return etage_intermediaire;
	}

	public void setEtage_intermediaire(int[] etage_intermediaire) {
		this.etage_intermediaire = etage_intermediaire;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}
	
	public void raz()
	{
		this.p_actuel = 0;
		this.p_final = 0;
		this.zone = 0;
		this.etat = 0;
	}
	
	public void run()
	{
		//JOptionPane.showMessageDialog(null, this.getName(), "Nom du thread", JOptionPane.INFORMATION_MESSAGE);
		while (this.p_final != this.p_actuel)
		{
			this.p_actuel += 1;
			try {
			    Thread.sleep(1000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
		}
	}
	
}
