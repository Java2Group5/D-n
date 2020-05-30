package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import BLL.LoginBLL;
import DTO.LoginDTO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.BoxLayout;
import java.awt.Panel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class F_Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserName;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F_Login frame = new F_Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public F_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setForeground(Color.BLUE);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblUsername.setBounds(104, 73, 55, 30);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(158, 73, 150, 30);
		txtUserName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(104, 114, 55, 30);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(158, 114, 150, 30);
		txtPassword.setColumns(10);
		panel.setLayout(null);
		panel.add(lblUsername); 	
		panel.add(txtUserName);
		panel.add(lblNewLabel);
		panel.add(txtPassword);
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginDTO loginDTO =new LoginDTO(txtUserName.getText(),txtPassword.getText());
				LoginBLL loginBLL=new LoginBLL();
				int role =loginBLL.login(loginDTO);
				if (role!=0){
					JOptionPane.showMessageDialog(panel, "Login success!", "About", 
                            JOptionPane.INFORMATION_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(panel, "Login fail", "About", 
                            JOptionPane.INFORMATION_MESSAGE);
				}
			}
			private void setBackground(Color blue) {
				// TODO Auto-generated method stub
			}
		});
		btnNewButton.setBounds(104, 165, 204, 30);
		panel.add(btnNewButton);
	}
}
