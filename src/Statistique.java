
public class Statistique {
	
	int nbTrajet;
	int consoElecTotale;
	float tpsAttenteMoy;
	float tpsAttenteTotal;
	float tpsTrajetMoy;
	float tpsTrajetTotal;
	
	public Statistique()
	{
		nbTrajet = 0;
		consoElecTotale = 0;
		tpsAttenteMoy = 0;
		tpsAttenteTotal = 0;
		tpsTrajetMoy = 0;
		tpsTrajetTotal = 0;
	}
	
	void majAttente(float tps)
	{
		tpsAttenteTotal += tps;
		tpsAttenteMoy = (tpsAttenteTotal / nbTrajet);
	}
	
	void majTrajet(float tps)
	{
		tpsTrajetTotal += tps;
		tpsTrajetMoy = (tpsTrajetTotal / nbTrajet);
	}
	
	void majConsoElec(int conso)
	{
		consoElecTotale += conso;
	}
	
	void majNbTrajet(int nb)
	{
		nbTrajet += nb;
	}

}
