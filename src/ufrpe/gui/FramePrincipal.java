package ufrpe.gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import ufrpe.excecoes.ExcecaoSistema;
import ufrpe.negocios.FachadaSistema;

public class FramePrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField cpfTextField;
	private JPasswordField senhaTextField;
	private FachadaSistema fachada;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrincipal frame = new FramePrincipal();
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
	public FramePrincipal() {
		fachada = FachadaSistema.getInstance();
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		JLabel lblNomelable = new JLabel("CPF:");
		lblNomelable.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNomelable.setBounds(77, 41, 73, 44);
		contentPane.add(lblNomelable);
		
		cpfTextField = new JTextField();
		cpfTextField.setBounds(142, 56, 160, 20);
		contentPane.add(cpfTextField);
		cpfTextField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSenha.setBounds(77, 122, 88, 44);
		contentPane.add(lblSenha);
		
		senhaTextField = new JPasswordField();
		senhaTextField.setBounds(142, 137, 160, 20);
		contentPane.add(senhaTextField);
		senhaTextField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cpf = cpfTextField.getText();
				String senha = senhaTextField.getText();
				
				int i = 0;
				try{
					i = fachada.autenticarUser(cpf, senha);
					if(i == 0){
						//chamada tela funcionario
					}else if(i == 1){
						//chamada tela paciente
					}
				}catch (ExcecaoSistema e){
					if(e.getCodigo() == 1){
						senhaTextField.setText(null);	
					}else if(e.getCodigo() == 2){
						cpfTextField.setText(null);
						senhaTextField.setText(null);	
					}
					JOptionPane.showConfirmDialog(null, e.getMessage(), "ERRO", -1);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnLogin.setBounds(219, 193, 83, 31);
		contentPane.add(btnLogin);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(100, 193, 81, 30);
		contentPane.add(btnCadastrar);
	}
}
