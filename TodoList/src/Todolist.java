import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.TextField;
import java.awt.Button;
import javax.swing.JList;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Todolist {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Todolist window = new Todolist();
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
	public Todolist() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 561);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JList list = new JList();
		list.setBounds(28, 150, 374, 295);
		panel.add(list);
		
		JLabel lblTodoList = new JLabel("TODO List");
		lblTodoList.setHorizontalAlignment(SwingConstants.CENTER);
		lblTodoList.setBounds(0, 0, 434, 69);
		panel.add(lblTodoList);
		
		Button button = new Button("Supprimer");
		button.setBackground(Color.RED);
		button.setBounds(28, 451, 374, 41);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(button);
		
		TextField textField = new TextField();
		textField.setBounds(28, 75, 286, 59);
		panel.add(textField);
		
		Button button_1 = new Button("+");
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(331, 75, 71, 59);
		panel.add(button_1);
	}
}
