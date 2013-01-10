import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.*;
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


public class Gestionnaire implements ActionListener
{
	
	Statistique stats = new Statistique();
	int coutDesc;
	int coutMont;
	int indexPrecedentAlgo = 0;
	
	Test_Simulation m_model;
	PanneauControle m_IHM;
	
	
	public Gestionnaire(Test_Simulation model, PanneauControle IHM)
	{
		coutDesc = 700;
		coutMont = 1400;
		m_model = model;
		m_IHM = IHM;
		actionListenerMeth(this);
		initialize();
	}
	
	private void initialize()
	{
		Timer t = new Timer(1000, new ActionListener() {
	
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	updateIHM();
	        }
	    });
		t.start();
	}
	
	public void actionListenerMeth(ActionListener ae)
	 {
	 	m_IHM.bouton_reset.addActionListener(ae);
	 	m_IHM.bouton_appel.addActionListener(ae);
	 	m_IHM.comboBox_algorithme.addActionListener(ae);
	 	m_IHM.checkBox_nuit.addActionListener(ae);
	 }
	
	public void updateIHM()
	{
		m_IHM.txt_asc1.setText(Integer.toString(m_model.Asc1.p_actuel));
		m_IHM.txt_asc2.setText(Integer.toString(m_model.Asc2.p_actuel));
		m_IHM.txt_asc3.setText(Integer.toString(m_model.Asc3.p_actuel));
		m_IHM.txt_asc4.setText(Integer.toString(m_model.Asc4.p_actuel));
		m_IHM.txt_asc5.setText(Integer.toString(m_model.Asc5.p_actuel));
		m_IHM.txt_asc6.setText(Integer.toString(m_model.Asc6.p_actuel));
		m_IHM.table.setValueAt(new Integer(m_model.Asc1.p_actuel), 0, 1);
		m_IHM.table.setValueAt(new Integer(m_model.Asc1.p_final), 0, 2);
		m_IHM.table.setValueAt(new Integer(m_model.Asc2.p_actuel), 1, 1);
		m_IHM.table.setValueAt(new Integer(m_model.Asc2.p_final), 1, 2);
		m_IHM.table.setValueAt(new Integer(m_model.Asc3.p_actuel), 2, 1);
		m_IHM.table.setValueAt(new Integer(m_model.Asc3.p_final), 2, 2);
		m_IHM.table.setValueAt(new Integer(m_model.Asc4.p_actuel), 3, 1);
		m_IHM.table.setValueAt(new Integer(m_model.Asc4.p_final), 3, 2);
		m_IHM.table.setValueAt(new Integer(m_model.Asc5.p_actuel), 4, 1);
		m_IHM.table.setValueAt(new Integer(m_model.Asc5.p_final), 4, 2);
		m_IHM.table.setValueAt(new Integer(m_model.Asc6.p_actuel), 5, 1);
		m_IHM.table.setValueAt(new Integer(m_model.Asc6.p_final), 5, 2);
		
		//JOptionPane.showMessageDialog(null, m_model.Asc5.p_actuel, "postion actuelle", JOptionPane.INFORMATION_MESSAGE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == m_IHM.bouton_reset)
 		{
			m_IHM.txt_etage_arrive.setText("");
			m_IHM.txt_etage_depart.setText("");
 		}
		
		if(e.getSource() == m_IHM.bouton_appel)
		{
			if (m_IHM.txt_etage_arrive.getText().isEmpty() || m_IHM.txt_etage_depart.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(null, "Selectionner un étage de départ et un étage d'arrivé.", "Erreur", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				if (m_IHM.comboBox_algorithme.getSelectedIndex() == 0)
				{
					// algorithme Base selectionné
					int a1,a2,a3,a4,a5,a6,asc_selectionne;
					
					
					a1 = m_model.algoBase(m_model.Asc1,Integer.parseInt(m_IHM.txt_etage_depart.getText()),Integer.parseInt(m_IHM.txt_etage_arrive.getText()));
					a2 = m_model.algoBase(m_model.Asc2,Integer.parseInt(m_IHM.txt_etage_depart.getText()),Integer.parseInt(m_IHM.txt_etage_arrive.getText()));
					a3 = m_model.algoBase(m_model.Asc3,Integer.parseInt(m_IHM.txt_etage_depart.getText()),Integer.parseInt(m_IHM.txt_etage_arrive.getText()));
					a4 = m_model.algoBase(m_model.Asc4,Integer.parseInt(m_IHM.txt_etage_depart.getText()),Integer.parseInt(m_IHM.txt_etage_arrive.getText()));
					a5 = m_model.algoBase(m_model.Asc5,Integer.parseInt(m_IHM.txt_etage_depart.getText()),Integer.parseInt(m_IHM.txt_etage_arrive.getText()));
					a6 = m_model.algoBase(m_model.Asc6,Integer.parseInt(m_IHM.txt_etage_depart.getText()),Integer.parseInt(m_IHM.txt_etage_arrive.getText()));
					
					asc_selectionne = m_model.traitement(a1,a2,a3,a4,a5,a6);
					
					JOptionPane.showMessageDialog(null, asc_selectionne, "postion actuelle", JOptionPane.INFORMATION_MESSAGE);
					
					if (asc_selectionne == 1) // si c'est l'ascenseur 1 le plus apte, alors on l'utilise
					{
						m_model.Asc1.start();
					}
					if (asc_selectionne == 2) // si c'est l'ascenseur 2 le plus apte, alors on l'utilise
					{
						m_model.Asc2.p_final = Integer.parseInt(m_IHM.txt_etage_arrive.getText());
						this.updateIHM();
						m_model.Asc2.start();
					}
					if (asc_selectionne == 3) // si c'est l'ascenseur 3 le plus apte, alors on l'utilise
					{
						m_model.Asc3.p_final = Integer.parseInt(m_IHM.txt_etage_arrive.getText());
						this.updateIHM();
						m_model.Asc3.start();
					}
					if (asc_selectionne == 4) // si c'est l'ascenseur 4 le plus apte, alors on l'utilise
					{
						m_model.Asc4.start();
					}
					if (asc_selectionne == 5) // si c'est l'ascenseur 5 le plus apte, alors on l'utilise
					{
						m_model.Asc5.p_final = Integer.parseInt(m_IHM.txt_etage_arrive.getText());
						this.updateIHM();
						m_model.Asc5.start();
					}
					if (asc_selectionne == 6) // si c'est l'ascenseur 6 le plus apte, alors on l'utilise
					{
						m_model.Asc6.start();
					}
						
				}
				else
				{
					if (m_IHM.comboBox_algorithme.getSelectedIndex() == 1)
					{
						// algorithme 2 selectionné
						
						
					}
					else
					{
						if (m_IHM.comboBox_algorithme.getSelectedIndex() == 2)
						{
							// algorithme 3 selectionné
							
							
						}
					}
				}
			}
		}
		
		if(e.getSource() == m_IHM.comboBox_algorithme)
		{	
			int option;
			option = JOptionPane.showConfirmDialog(null, "Voulez-vous activer l'algorithme sélectionné ?", "Lancement de l'algorithme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			
			if(option == JOptionPane.OK_OPTION)
			{
				//JOptionPane.showMessageDialog(null, "algorithme activé.", "Erreur", JOptionPane.ERROR_MESSAGE);		
				indexPrecedentAlgo = m_IHM.comboBox_algorithme.getSelectedIndex();
			}
			else
			{
				m_IHM.comboBox_algorithme.setSelectedIndex(indexPrecedentAlgo);	
			}
			
		}
		
		if(e.getSource() == m_IHM.checkBox_nuit)
 		{
			if(m_IHM.checkBox_nuit.isSelected() == true)
			{
				m_IHM.panneau_affichage.setBackground(Color.black);			
			}
			else
			{
				m_IHM.panneau_affichage.setBackground(Color.white);
			}
 		}
		
	}
	
}
