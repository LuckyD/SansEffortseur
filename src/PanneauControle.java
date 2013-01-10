import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JLayeredPane;
import javax.swing.Timer;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;


public class PanneauControle
{

	//public Gestionnaire gestion = new Gestionnaire();
	
	JFrame frmSansEfforceur;
	JTextField txt_asc1;
	JTextField txt_asc2;
	JTextField txt_asc3;
	JTextField txt_asc4;
	JTextField txt_asc5;
	JTextField txt_asc6;
	JTextField txt_etage_depart;
	JTextField txt_etage_arrive;
	JTextField txt_label_asc1;
	JTextField txt_label_asc2;
	JTextField txt_label_asc3;
	JTextField txt_label_asc4;
	JTextField txt_label_asc5;
	JTextField txt_label_asc6;
	JSeparator separateur_simulation;
	JSeparator separateur_algorithme;
	JDesktopPane panneau_affichage;
	JDesktopPane panneau_simulation;
	JLabel lblEtageDeDpart;
	JLabel lblEtageDarriv;
	JButton bouton_reset;
	JButton bouton_appel;
	JLabel lblSimulation;
	JLabel label_ascenseur_appel;
	JDesktopPane panneau_information;
	JTable table;
	JTable table2;
	JScrollPane scrollPane;
	JScrollPane scrollPane2;
	JLabel lblInformations;
	JSeparator separator;
	JDesktopPane panneau_algorithme;
	JLabel lblAlgorithme;
	JComboBox comboBox_algorithme;
	JCheckBox checkBox_nuit;
	
	Test_Simulation m_model;
	
	/**
	 * Create the application.
	 */
	public PanneauControle(Test_Simulation model)
	{

		initialize();
		m_model = model;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frmSansEfforceur = new JFrame();
		frmSansEfforceur.getContentPane().setBackground(UIManager.getColor("Button.background"));
		frmSansEfforceur.setTitle("Sans Efforceur");
		frmSansEfforceur.setBounds(100, 100, 660, 465);
		frmSansEfforceur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSansEfforceur.getContentPane().setLayout(null);
		
		panneau_affichage = new JDesktopPane();
		panneau_affichage.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panneau_affichage.setBackground(Color.WHITE);
		panneau_affichage.setBounds(10, 11, 630, 112);
		frmSansEfforceur.getContentPane().add(panneau_affichage);
		
		txt_asc1 = new JTextField();
		txt_asc1.setToolTipText("");
		txt_asc1.setText("0");
		txt_asc1.setHorizontalAlignment(SwingConstants.CENTER);
		txt_asc1.setEditable(false);
		txt_asc1.setColumns(10);
		txt_asc1.setBackground(Color.GREEN);
		txt_asc1.setBounds(22, 49, 86, 35);
		panneau_affichage.add(txt_asc1);
		
		txt_asc2 = new JTextField();
		txt_asc2.setText("0");
		txt_asc2.setHorizontalAlignment(SwingConstants.CENTER);
		txt_asc2.setEditable(false);
		txt_asc2.setColumns(10);
		txt_asc2.setBackground(Color.GREEN);
		txt_asc2.setBounds(118, 49, 86, 35);
		panneau_affichage.add(txt_asc2);
		
		txt_asc3 = new JTextField();
		txt_asc3.setText("0");
		txt_asc3.setHorizontalAlignment(SwingConstants.CENTER);
		txt_asc3.setEditable(false);
		txt_asc3.setColumns(10);
		txt_asc3.setBackground(Color.GREEN);
		txt_asc3.setBounds(214, 49, 86, 35);
		panneau_affichage.add(txt_asc3);
		
		txt_asc4 = new JTextField();
		txt_asc4.setText("0");
		txt_asc4.setHorizontalAlignment(SwingConstants.CENTER);
		txt_asc4.setEditable(false);
		txt_asc4.setColumns(10);
		txt_asc4.setBackground(Color.GREEN);
		txt_asc4.setBounds(312, 49, 86, 35);
		panneau_affichage.add(txt_asc4);
		
		txt_asc5 = new JTextField();
		txt_asc5.setText("0");
		txt_asc5.setHorizontalAlignment(SwingConstants.CENTER);
		txt_asc5.setEditable(false);
		txt_asc5.setColumns(10);
		txt_asc5.setBackground(Color.GREEN);
		txt_asc5.setBounds(410, 49, 86, 35);
		panneau_affichage.add(txt_asc5);
		
		txt_asc6 = new JTextField();
		txt_asc6.setText("0");
		txt_asc6.setHorizontalAlignment(SwingConstants.CENTER);
		txt_asc6.setEditable(false);
		txt_asc6.setColumns(10);
		txt_asc6.setBackground(Color.GREEN);
		txt_asc6.setBounds(508, 49, 86, 35);
		panneau_affichage.add(txt_asc6);
		
		txt_label_asc1 = new JTextField();
		txt_label_asc1.setToolTipText("");
		txt_label_asc1.setText("Ascenseur 1");
		txt_label_asc1.setHorizontalAlignment(SwingConstants.CENTER);
		txt_label_asc1.setEditable(false);
		txt_label_asc1.setColumns(10);
		txt_label_asc1.setBackground(Color.WHITE);
		txt_label_asc1.setBounds(22, 15, 86, 35);
		panneau_affichage.add(txt_label_asc1);
		
		txt_label_asc2 = new JTextField();
		txt_label_asc2.setText("Ascenseur 2");
		txt_label_asc2.setHorizontalAlignment(SwingConstants.CENTER);
		txt_label_asc2.setEditable(false);
		txt_label_asc2.setColumns(10);
		txt_label_asc2.setBackground(Color.WHITE);
		txt_label_asc2.setBounds(118, 15, 86, 35);
		panneau_affichage.add(txt_label_asc2);
		
		txt_label_asc3 = new JTextField();
		txt_label_asc3.setText("Ascenseur 3");
		txt_label_asc3.setHorizontalAlignment(SwingConstants.CENTER);
		txt_label_asc3.setEditable(false);
		txt_label_asc3.setColumns(10);
		txt_label_asc3.setBackground(Color.WHITE);
		txt_label_asc3.setBounds(214, 15, 86, 35);
		panneau_affichage.add(txt_label_asc3);
		
		txt_label_asc4 = new JTextField();
		txt_label_asc4.setText("Ascenseur 4");
		txt_label_asc4.setHorizontalAlignment(SwingConstants.CENTER);
		txt_label_asc4.setEditable(false);
		txt_label_asc4.setColumns(10);
		txt_label_asc4.setBackground(Color.WHITE);
		txt_label_asc4.setBounds(312, 15, 86, 35);
		panneau_affichage.add(txt_label_asc4);
		
		txt_label_asc5 = new JTextField();
		txt_label_asc5.setText("Ascenseur 5");
		txt_label_asc5.setHorizontalAlignment(SwingConstants.CENTER);
		txt_label_asc5.setEditable(false);
		txt_label_asc5.setColumns(10);
		txt_label_asc5.setBackground(Color.WHITE);
		txt_label_asc5.setBounds(410, 15, 86, 35);
		panneau_affichage.add(txt_label_asc5);
		
		txt_label_asc6 = new JTextField();
		txt_label_asc6.setText("Ascenseur 6");
		txt_label_asc6.setHorizontalAlignment(SwingConstants.CENTER);
		txt_label_asc6.setEditable(false);
		txt_label_asc6.setColumns(10);
		txt_label_asc6.setBackground(Color.WHITE);
		txt_label_asc6.setBounds(508, 15, 86, 35);
		panneau_affichage.add(txt_label_asc6);
		
		panneau_simulation = new JDesktopPane();
		panneau_simulation.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panneau_simulation.setBackground(Color.WHITE);
		panneau_simulation.setBounds(10, 134, 224, 172);
		frmSansEfforceur.getContentPane().add(panneau_simulation);
		
		lblEtageDeDpart = new JLabel("Etage de d\u00E9part");
		lblEtageDeDpart.setBounds(10, 43, 129, 14);
		panneau_simulation.add(lblEtageDeDpart);
		
		lblEtageDarriv = new JLabel("Etage d'arriv\u00E9");
		lblEtageDarriv.setBounds(10, 74, 129, 14);
		panneau_simulation.add(lblEtageDarriv);
		
		txt_etage_depart = new JTextField();
		txt_etage_depart.setBounds(170, 44, 42, 20);
		panneau_simulation.add(txt_etage_depart);
		txt_etage_depart.setColumns(10);
		
		txt_etage_arrive = new JTextField();
		txt_etage_arrive.setColumns(10);
		txt_etage_arrive.setBounds(170, 75, 42, 20);
		panneau_simulation.add(txt_etage_arrive);
		
		bouton_reset = new JButton("Reset");
		bouton_reset.setBounds(10, 138, 78, 23);
		panneau_simulation.add(bouton_reset);
		
		bouton_appel = new JButton("Appel");
		bouton_appel.setBounds(134, 138, 78, 23);
		panneau_simulation.add(bouton_appel);
		
		lblSimulation = new JLabel("Simulation");
		lblSimulation.setHorizontalAlignment(SwingConstants.CENTER);
		lblSimulation.setBounds(10, 6, 202, 14);
		panneau_simulation.add(lblSimulation);
		
		label_ascenseur_appel = new JLabel("Aucun appel");
		label_ascenseur_appel.setHorizontalAlignment(SwingConstants.CENTER);
		label_ascenseur_appel.setBounds(10, 107, 202, 14);
		panneau_simulation.add(label_ascenseur_appel);
		
		separateur_simulation = new JSeparator();
		separateur_simulation.setForeground(UIManager.getColor("Button.shadow"));
		separateur_simulation.setBounds(10, 29, 202, 2);
		panneau_simulation.add(separateur_simulation);
		
		panneau_information = new JDesktopPane();
		panneau_information.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panneau_information.setBounds(246, 134, 394, 284);
		frmSansEfforceur.getContentPane().add(panneau_information);
		panneau_information.setBackground(Color.WHITE);
		
		Object rowData[][] = {	{ "1", "0", "0", "Libre"},
								{ "2", "0", "0", "Libre"},
								{ "3", "0", "0", "Libre"},
								{ "4", "0", "0", "Libre"},
								{ "5", "0", "0", "Libre"},
								{ "6", "0", "0", "Libre"}};

		Object columnNames[] = { "N° Ascenseur", "Etage actuel", "Destination", "Status"};

		table = new JTable(rowData, columnNames);
		table.setEnabled(false);
		table.setRowSelectionAllowed(false);
		((JLabel)table.getDefaultRenderer(String.class)).setHorizontalAlignment(JLabel.CENTER);
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 39, 374, 120);
		panneau_information.add(scrollPane,JLayeredPane.POPUP_LAYER);
		
		Object rowData2[][] = {	{ "Trajets simulés", "0"},
								{ "Consommation électrique totale", "0"},
								{ "Temps d'attente moyen / total", "0 / 0"},
								{ "Temps de trajet moyen / total", "0 / 0"}};

		Object columnNames2[] = { "Indicateur", "Valeur"};
		
		table2 = new JTable(rowData2, columnNames2);
		table2.setRowSelectionAllowed(false);
		table2.setEnabled(false);
		((JLabel)table2.getDefaultRenderer(String.class)).setHorizontalAlignment(JLabel.CENTER);
		scrollPane2 = new JScrollPane(table2);
		scrollPane2.setBounds(10, 185, 374, 87);
		panneau_information.add(scrollPane2,JLayeredPane.POPUP_LAYER);
		
		lblInformations = new JLabel("Informations");
		lblInformations.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformations.setBounds(10, 6, 374, 14);
		panneau_information.add(lblInformations);
		
		separator = new JSeparator();
		separator.setForeground(UIManager.getColor("Button.shadow"));
		separator.setBounds(10, 29, 374, 2);
		panneau_information.add(separator);
		
		panneau_algorithme = new JDesktopPane();
		panneau_algorithme.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panneau_algorithme.setBackground(Color.WHITE);
		panneau_algorithme.setBounds(10, 317, 224, 101);
		frmSansEfforceur.getContentPane().add(panneau_algorithme);
		
		lblAlgorithme = new JLabel("Parametres");
		lblAlgorithme.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlgorithme.setBounds(10, 6, 202, 14);
		panneau_algorithme.add(lblAlgorithme);
		
		separateur_algorithme = new JSeparator();
		separateur_algorithme.setForeground(UIManager.getColor("Button.shadow"));
		separateur_algorithme.setBounds(10, 25, 202, 2);
		panneau_algorithme.add(separateur_algorithme);
		
		comboBox_algorithme = new JComboBox();
		comboBox_algorithme.addItem("Algorithme de base");
		comboBox_algorithme.addItem("Algorithme 2");
		comboBox_algorithme.addItem("Algorithme 3");
		comboBox_algorithme.setBounds(10, 36, 202, 23);
		comboBox_algorithme.setSelectedIndex(0);
		panneau_algorithme.add(comboBox_algorithme);
		
		JLabel lblModeNuit = new JLabel("Mode nuit");
		lblModeNuit.setBounds(10, 74, 97, 15);
		panneau_algorithme.add(lblModeNuit);
		
		checkBox_nuit = new JCheckBox("");
		checkBox_nuit.setBounds(121, 66, 21, 23);
		panneau_algorithme.add(checkBox_nuit);
		
		this.frmSansEfforceur.setVisible(true);
		
	}
	
	/*
	@SuppressWarnings("serial")
	class MyJFrame extends JFrame
	{
		public void paintComponents(Graphics g)
	   	 {
	   		super.paintComponents(g);
	   	 }
	}
	*/

	
}