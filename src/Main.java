
public class Main {
	
	
	public static void main(String[] args)
	{
		Test_Simulation 		model	= new Test_Simulation();
		PanneauControle IHM		= new PanneauControle(model);
		new Gestionnaire(model,IHM);
	}
}