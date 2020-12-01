import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JInternalFrame;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Calculatrice {

	private JFrame frame;
	private static String valeur = "0";
	private static boolean on;
	private static String operateur = "";
	private static double resultat;
	private static boolean clickOperator = false ;
	public JLabel label;
	private static boolean click = false;
	private static double memoryValue = 0;
	private static boolean memoryValueNotEmpty = false;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculatrice window = new Calculatrice();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculatrice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 376, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_label = new JPanel();
		panel_label.setBackground(Color.GRAY);
		panel_label.setBounds(10, 11, 340, 71);
		frame.getContentPane().add(panel_label);
		panel_label.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 330, 71);
		panel_label.add(label);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JPanel panel_top = new JPanel();
		panel_top.setBackground(Color.DARK_GRAY);
		panel_top.setBounds(10, 106, 340, 65);
		frame.getContentPane().add(panel_top);
		panel_top.setLayout(new GridLayout(1, 5, 4, 4));
		
		JPanel panel_left = new JPanel();
		panel_left.setBackground(Color.DARK_GRAY);
		panel_left.setBounds(10, 182, 202, 270);
		frame.getContentPane().add(panel_left);
		panel_left.setLayout(new GridLayout(4, 3, 4, 4));
		
		JPanel panel_right = new JPanel();
		panel_right.setBackground(Color.DARK_GRAY);
		panel_right.setBounds(219, 182, 131, 134);
		frame.getContentPane().add(panel_right);
		panel_right.setLayout(new GridLayout(2, 3, 4, 4));
		
		JPanel panel_plus = new JPanel();
		panel_plus.setBackground(Color.DARK_GRAY);
		panel_plus.setBounds(220, 319, 62, 132);
		frame.getContentPane().add(panel_plus);
		panel_plus.setLayout(new GridLayout(0, 1, 4, 4));
	
		JPanel panel_moisegal = new JPanel();
		panel_moisegal.setBackground(Color.DARK_GRAY);
		panel_moisegal.setBounds(287, 319, 62, 133);
		frame.getContentPane().add(panel_moisegal);
		panel_moisegal.setLayout(new GridLayout(2, 1, 4, 4));
		
		JButton btn_mrc = new JButton("MRC");
		btn_mrc.setBackground(Color.LIGHT_GRAY);
		panel_top.add(btn_mrc);
		
		JButton btn_mplus = new JButton("M+");
		btn_mplus.setBackground(Color.LIGHT_GRAY);
		panel_top.add(btn_mplus);
		
		JButton btn_mmoins = new JButton("M-");
		btn_mmoins.setBackground(Color.LIGHT_GRAY);
		panel_top.add(btn_mmoins);
		
		JButton btn_ce = new JButton("CE");
		btn_ce.setBackground(Color.LIGHT_GRAY);
		panel_top.add(btn_ce);
		
		JButton btn_on = new JButton("ON-C");
		btn_on.setBackground(Color.LIGHT_GRAY);
		panel_top.add(btn_on);
		
		JButton btn_7 = new JButton("7");
		btn_7.setBackground(Color.LIGHT_GRAY);
		panel_left.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.setBackground(Color.LIGHT_GRAY);
		panel_left.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.setBackground(Color.LIGHT_GRAY);
		panel_left.add(btn_9);
		
		JButton btn_4 = new JButton("4");
		btn_4.setBackground(Color.LIGHT_GRAY);
		panel_left.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.setBackground(Color.LIGHT_GRAY);
		panel_left.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.setBackground(Color.LIGHT_GRAY);
		panel_left.add(btn_6);
		
		JButton btn_1 = new JButton("1");
		btn_1.setBackground(Color.LIGHT_GRAY);
		panel_left.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.setBackground(Color.LIGHT_GRAY);
		panel_left.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.setBackground(Color.LIGHT_GRAY);
		panel_left.add(btn_3);
		
		JButton btn_0 = new JButton("0");
		btn_0.setBackground(Color.LIGHT_GRAY);
		panel_left.add(btn_0);
		
		JButton btn_coma = new JButton(".");
		btn_coma.setBackground(Color.LIGHT_GRAY);
		panel_left.add(btn_coma);
		
		JButton btn_plusmoins = new JButton("+/-");
		btn_plusmoins.setBackground(Color.LIGHT_GRAY);
		panel_left.add(btn_plusmoins);
		
		JButton btn_pourcent = new JButton("%");
		btn_pourcent.setBackground(Color.LIGHT_GRAY);
		panel_right.add(btn_pourcent);
		
		JButton btn_racine = new JButton("\u221A");
		btn_racine.setBackground(Color.LIGHT_GRAY);
		panel_right.add(btn_racine);
		
		JButton btn_multiplication = new JButton("x");
		btn_multiplication.setBackground(Color.LIGHT_GRAY);
		panel_right.add(btn_multiplication);
		
		JButton btn_division = new JButton("/");
		btn_division.setBackground(Color.LIGHT_GRAY);
		panel_right.add(btn_division);
		
		JButton btn_plus = new JButton("+");
		btn_plus.setBackground(Color.LIGHT_GRAY);
		panel_plus.add(btn_plus);
		
		JButton btn_moins = new JButton("-");
		btn_moins.setBackground(Color.LIGHT_GRAY);
		panel_moisegal.add(btn_moins);
		
		JButton btn_egal = new JButton("=");
		btn_egal.setBackground(Color.LIGHT_GRAY);
		panel_moisegal.add(btn_egal);
		
		/*
		 * ActionListener
		 */

		// Buttons number
		
		/**
		 * Btn 1
		 */
		btn_1.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 btnNbrs(1, label);
			 }
		});
		
		/**
		 * Btn 2
		 */
		btn_2.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 btnNbrs(2, label);
			 }
		});
		
		/**
		 * Btn 3
		 */
		btn_3.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 btnNbrs(3, label);
			 }
		});
		
		/**
		 * Btn 4
		 */
		btn_4.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 btnNbrs(4, label);
			 }
		});
		
		/**
		 * Btn 5
		 */
		btn_5.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 btnNbrs(5, label);
			 }
		});
		
		/**
		 * Btn 6
		 */
		btn_6.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 btnNbrs(6, label);
			 }
		});
		
		/**
		 * Btn 7
		 */
		btn_7.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 btnNbrs(7, label);
			 }
		});
	
		/**
		 * Btn 8
		 */
		btn_8.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 btnNbrs(8, label);
			 }
		});
		
		/**
		 * Btn 9
		 */
		btn_9.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 btnNbrs(9, label);
			 }
		});

		/**
		 * Btn 0
		 */
		btn_0.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 btnNbrs(0, label);
			 }
		});
		
		/**
		 * Btn ON
		 */
		btn_on.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 // si ell est eteinte
				 if (panel_label.getBackground() == Color.GRAY) {
					 panel_label.setBackground(Color.LIGHT_GRAY);
					 on = true;
				
				 } 
				 // Si la calculette est déja allumé
				 else {
					 valeur = "";
					 label.setText("");
					 resultat = 0;
					 operateur = "";
				 }
			 }
		});
		
		/**
		 * Btn CE
		 */
		btn_ce.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 if (on) {
					 label.setText("");
					 click = true;
					 valeur = "";
					 resultat = 0;
					 operateur = "";
				 }
			 }
		});
		
		// Buttons operator

		/**
		 * Btn +
		 */
		btn_plus.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 if (on && !label.getText().isEmpty()) {
					if (!clickOperator) {
						clickOperator = true;
						calcul(label);
						operateur = "+";
					}
				 }
				 
			 }
		});
		
		/**
		 * Btn -
		 */
		btn_moins.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 if (on && !label.getText().isEmpty()) {
					if (!clickOperator) {
						clickOperator = true;
						calcul(label);
						operateur = "-";
					}
				}
			 }
		});
		
		/**
		 * Btn *
		 */
		btn_multiplication.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 if (on && !label.getText().isEmpty()) {
					 if (!clickOperator) {
						clickOperator = true;
						calcul(label);
						operateur = "*";
					 }
				 }
			 }
		});
		
		/**
		 * Btn /
		 */
		btn_division.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 if (on && !label.getText().isEmpty()) {
					 if (!clickOperator) {
						clickOperator = true;
						calcul(label);
						operateur = "/";
					 }
				 }
			 }
		});
		
		// Other buttons
			
		/**
		 * Btn =
		 */
		btn_egal.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 if (on && !label.getText().isEmpty()) {
					 calcul(label);
					 click = true;
					 
				 }
			 }
		});
		
		/**
		 * Btn .
		 */
		btn_coma.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 if (on && !label.getText().isEmpty()) {
					 
					 if (label.getText().indexOf(".") == -1) {
						 
						 if (label.getText().isEmpty()) {
						  label.setText("0.");
						 }
						 else {
							 label.setText(label.getText() + ".");
						 }
					 }
				 }
			 }
		});
		
		/**
		 * Btn Square root
		 */
		btn_racine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (on && !label.getText().isEmpty()) {
					if (!clickOperator) {
						double resultatRacine = Double.parseDouble(label.getText());
						if( resultatRacine >= 0) {
							resultatRacine = Math.sqrt(resultatRacine);
							label.setText(format(resultatRacine));
						}
						else {
							label.setText("ERREUR");
						}
					}
				}
			}
			
		});
		
		/**
		 * Btn %
		 */
		btn_pourcent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (on && !label.getText().isEmpty()) {
					if (!clickOperator) {
						double resultatPourcent = Double.parseDouble(label.getText());
						resultatPourcent = resultatPourcent / 100;
						label.setText(format(resultatPourcent));
					}
				}
			}
		});
		
		/**
		 * Btn +/-
		 */
		btn_plusmoins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (on && !label.getText().isEmpty()) {
					double valeurOppose = -Double.parseDouble(label.getText());
					label.setText(format(valeurOppose));
				}
				
			}
		});
		
		/**
		 * Btn M+
		 */
		btn_mplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (on && !label.getText().isEmpty()) {
					memoryValueNotEmpty = true;
					memoryValue += Double.parseDouble(label.getText());
				}
			}
		});
		
		/**
		 * Btn M-
		 */
		btn_mmoins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (on && !label.getText().isEmpty()) {
					memoryValueNotEmpty = true;
					memoryValue -= Double.parseDouble(label.getText());
					if (memoryValue == 0) {
						memoryValueNotEmpty = false;
					}
				}
			}
		});
		
		/**
		 * Btn MRC
		 */
		btn_mrc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (on && memoryValueNotEmpty) {
					label.setText(format(memoryValue));
					click = false;
				}
			}
		});
		
	}
	
	/**
	 * General function for number buttons
	 * @param number
	 * @param label
	 */
	public static void btnNbrs(int number, JLabel label) {
		// Si la calculette est allumée
		String oldLabel;
		
		if (on) {
			if (clickOperator || click) {
				label.setText("");
			}
			
			if (label.getText().equals("0")) {
				label.setText(String.valueOf(number));
			}
			else {
				oldLabel = label.getText();
				label.setText(oldLabel + String.valueOf(number));
				clickOperator = false;
				click = false;
			}
			
			
		}
	}

	/**
	 * Function that performs calculations according to the different operators
	 * @param label
	 */
	public static void calcul(JLabel label) {
		double valeurDouble = 0;
		String valeurAffiche = "";
		
		if (!click) {
			valeur = label.getText();
		}
		if (operateur == "+") {
			label.setText("");
			valeurDouble = Double.parseDouble(valeur);
			resultat += Double.parseDouble(valeur);
			valeurAffiche = format(resultat);
		}
		if (operateur == "-") {
			label.setText("");
			valeurDouble = Double.parseDouble(valeur);
			resultat -= Double.parseDouble(valeur);
			valeurAffiche = format(resultat);
		}
		if (operateur == "*") {
			label.setText("");
			valeurDouble = Double.parseDouble(valeur);
			resultat = Double.parseDouble(valeur) * resultat ;
			valeurAffiche = format(resultat);
		}
		if (operateur == "/") {
			
			if (valeur.equals("0")) {
				valeurAffiche = "ERROR";
			}
			else {
				label.setText("");
				valeurDouble = Double.parseDouble(valeur);
				resultat = resultat / Double.parseDouble(valeur);	
				valeurAffiche = format(resultat);
			}
		}
		
		if (operateur.isEmpty()) {
		    resultat = Double.parseDouble(valeur);
		    valeurAffiche = format(resultat);
		}
		
		label.setText(valeurAffiche);
	}
	
	/**
	 * Function which formats the results of calculations
	 * @param result
	 * @return
	 */
	public static String format(Double result) {
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("#.###############", otherSymbols);
        String resultFormat = df.format(result);
        return resultFormat;
    }

}
