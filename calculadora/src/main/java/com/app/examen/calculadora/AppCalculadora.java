package com.app.examen.calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AppCalculadora extends JFrame {

	private JPanel contentPane;
	private int panel;
	private JButton calculo;
	private JButton calculo2;
	private JLabel ope;
	private JLabel result;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppCalculadora frame = new AppCalculadora();
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
	public AppCalculadora() {
		panel = 1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel resultado = new JLabel("");
		resultado.setHorizontalAlignment(SwingConstants.RIGHT);
		resultado.setFont(new Font("Tahoma", Font.PLAIN, 17));
		resultado.setBounds(95, 148, 374, 42);
		
		contentPane.add(resultado);

		JButton btnC1 = new JButton("");
		btnC1.setBackground(new Color(255, 255, 255));
		btnC1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel = 1;
			}
		});
		btnC1.setBounds(10, 39, 170, 87);
		contentPane.add(btnC1);
		
		JButton btnC2 = new JButton("");
		btnC2.setBackground(new Color(255, 255, 255));
		btnC2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel = 2;
			}
		});
		btnC2.setBounds(263, 39, 179, 87);
		contentPane.add(btnC2);
		JLabel operador = new JLabel("");
		operador.setHorizontalAlignment(SwingConstants.CENTER);
		operador.setFont(new Font("Tahoma", Font.PLAIN, 25));
		operador.setBounds(190, 48, 63, 65);
		contentPane.add(operador);
		calculo = btnC1;
		calculo2 = btnC2;
		this.ope = operador;
		result = resultado;
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(panel == 1) {
					calculo.setText(calculo.getText()+"1");
				}else {
					calculo2.setText(calculo2.getText()+"1");
				}
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn1.setBounds(0, 200, 85, 85);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(panel == 1) {
					calculo.setText(calculo.getText()+"2");
				}else {
					calculo2.setText(calculo2.getText()+"2");
				}
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn2.setBounds(95, 200, 85, 85);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(panel == 1) {
					calculo.setText(calculo.getText()+"3");
				}else {
					calculo2.setText(calculo2.getText()+"3");
				}
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn3.setBounds(194, 200, 85, 85);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(panel == 1) {
					calculo.setText(calculo.getText()+"4");
				}else {
					calculo2.setText(calculo2.getText()+"4");
				}
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn4.setBounds(0, 295, 85, 85);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(panel == 1) {
					calculo.setText(calculo.getText()+"5");
				}else {
					calculo2.setText(calculo2.getText()+"5");
				}
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn5.setBounds(95, 295, 85, 85);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(panel == 1) {
					calculo.setText(calculo.getText()+"6");
				}else {
					calculo2.setText(calculo2.getText()+"6");
				}
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn6.setBounds(194, 295, 85, 85);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(panel == 1) {
					calculo.setText(calculo.getText()+"7");
				}else {
					calculo2.setText(calculo2.getText()+"7");
				}
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn7.setBounds(0, 390, 85, 85);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(panel == 1) {
					calculo.setText(calculo.getText()+"8");
				}else {
					calculo2.setText(calculo2.getText()+"8");
				}
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn8.setBounds(95, 390, 85, 85);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(panel == 1) {
					calculo.setText(calculo.getText()+"9");
				}else {
					calculo2.setText(calculo2.getText()+"9");
				}
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn9.setBounds(194, 390, 85, 85);
		contentPane.add(btn9);
		
		JButton btnNewButton_3 = new JButton("=");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculadora calculadora = new Calculadora();
				try {
					int a = Integer.parseInt(calculo.getText());
					int b = Integer.parseInt(calculo2.getText());
					result.setText(calculadora.calculo(ope.getText(), a, b));
				} catch (Exception e2) {
					result.setText("SyntaxError");
				}
				
				
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton_3.setBounds(384, 387, 85, 85);
		contentPane.add(btnNewButton_3);
		
		JButton suma = new JButton("+");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ope.setText("+");
			}
		});
		suma.setFont(new Font("Tahoma", Font.PLAIN, 27));
		suma.setBounds(289, 200, 85, 85);
		contentPane.add(suma);
		
		JButton resta = new JButton("-");
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ope.setText("-");
			}
		});
		resta.setFont(new Font("Tahoma", Font.PLAIN, 27));
		resta.setBounds(384, 200, 85, 85);
		contentPane.add(resta);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ope.setText("/");
			}
		});
		div.setFont(new Font("Tahoma", Font.PLAIN, 27));
		div.setBounds(384, 295, 85, 85);
		contentPane.add(div);
		
		JButton multi = new JButton("X");
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ope.setText("*");
			}
		});
		multi.setFont(new Font("Tahoma", Font.PLAIN, 27));
		multi.setBounds(289, 295, 85, 85);
		contentPane.add(multi);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(panel == 1) {
					calculo.setText(calculo.getText()+"0");
				}else {
					calculo2.setText(calculo2.getText()+"0");
				}
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn0.setBounds(289, 390, 85, 85);
		contentPane.add(btn0);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(panel == 1) {
					calculo.setText("");
				}else {
					calculo2.setText("");
				}
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnC.setBounds(10, 138, 75, 52);
		contentPane.add(btnC);
		 
	}
	


	

}
