package calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CasiCalculadora extends JFrame {
	// Create four buttons
	private JTextField numero1 = new JTextField(1);
	private JTextField numero2 = new JTextField(1);
	private JButton botonSumar = new JButton("Sumar");
	private JButton botonRestar = new JButton("Restar");
	private JButton botonMultiplicar = new JButton("Multiplicar");
	private JButton botonDividir = new JButton("Dividir");
	private JButton botonx2 = new JButton("x2");
	private JButton botonx3 = new JButton("x3");
	private JButton sen = new JButton("sen");
	private JButton boton1 = new JButton("1");
	private JButton boton2 = new JButton("2");
	private JButton boton3 = new JButton("3");
	private JButton boton4 = new JButton("4");
	private JButton boton5 = new JButton("5");
	private JButton boton6 = new JButton("6");
	private JButton boton7 = new JButton("7");
	private JButton boton8 = new JButton("8");
	private JButton boton9 = new JButton("9");
	private JButton boton10 = new JButton("          ");
	private JButton boton11 = new JButton("          ");
	private JButton boton0 = new JButton("0");
	/*private JButton boton1b = new JButton("1");
	private JButton boton2b = new JButton("2");
	private JButton boton3b = new JButton("3");
	private JButton boton4b = new JButton("4");
	private JButton boton5b = new JButton("5");
	private JButton boton6b = new JButton("6");
	private JButton boton7b = new JButton("7");
	private JButton boton8b = new JButton("8");
	private JButton boton9b = new JButton("9");
	private JButton boton10b = new JButton("    >>   ");
	private JButton boton11b = new JButton("    >>   ");
	private JButton boton0b = new JButton("0");*/

	private JLabel jlabel = new JLabel();
	private JPanel panelSuperior = new JPanel();
	private JPanel panelDerecho = new JPanel();
	private JPanel panelCentral1 = new JPanel(new GridLayout(4,3));
	/*private JPanel panelCentral2 = new JPanel(new GridLayout(4,3));*/

	private boolean botonTocado = false;

	public CasiCalculadora() { //constructor
		setLayout (new BorderLayout ());
		jlabel.setText("            ");
		jlabel.setBackground(Color.WHITE);
		jlabel.setOpaque(true);
		// Create a panel to hold buttons
		panelSuperior.add(numero1);
		panelSuperior.add(numero2);
		panelSuperior.add(jlabel);

		panelCentral1.add(boton1);
		panelCentral1.add(boton2);
		panelCentral1.add(boton3);
		/*panelCentral2.add(boton1b);
		panelCentral2.add(boton2b);
		panelCentral2.add(boton3b);*/
		panelCentral1.add(boton4);
		panelCentral1.add(boton5);
		panelCentral1.add(boton6);
		/*panelCentral2.add(boton4b);
		panelCentral2.add(boton5b);
		panelCentral2.add(boton6b);*/
		panelCentral1.add(boton7);
		panelCentral1.add(boton8);
		panelCentral1.add(boton9);
		/*panelCentral2.add(boton7b);
		panelCentral2.add(boton8b);
		panelCentral2.add(boton9b);*/
		panelCentral1.add(boton10);
		panelCentral1.add(boton0);
		panelCentral1.add(boton11);
		/*panelCentral2.add(boton10b);
		panelCentral2.add(boton0b);
		panelCentral2.add(boton11b);*/

		panelDerecho.add(botonSumar);
		panelDerecho.add(botonRestar);
		panelDerecho.add(botonMultiplicar);
		panelDerecho.add(botonDividir);
		panelDerecho.add(botonx2);
		panelDerecho.add(botonx3);
		panelDerecho.add(sen);


		add(panelSuperior,BorderLayout.NORTH);
		add(panelCentral1,BorderLayout.CENTER);
		/*add(panelCentral1,BorderLayout.WEST);
		add(panelCentral2,BorderLayout.EAST);*/
		add(panelDerecho,BorderLayout.SOUTH);

		// Create a listener 
		OyenteBoton oyente = new OyenteBoton(); 

		// Register listener with buttons 
		boton1.addActionListener(oyente);
		boton2.addActionListener(oyente);
		boton3.addActionListener(oyente);
		boton4.addActionListener(oyente);
		boton5.addActionListener(oyente);
		boton6.addActionListener(oyente);
		boton7.addActionListener(oyente);
		boton8.addActionListener(oyente);
		boton9.addActionListener(oyente);
		boton0.addActionListener(oyente);
		/*boton1b.addActionListener(oyente);
		boton2b.addActionListener(oyente);
		boton3b.addActionListener(oyente);
		boton4b.addActionListener(oyente);
		boton5b.addActionListener(oyente);
		boton6b.addActionListener(oyente);
		boton7b.addActionListener(oyente);
		boton8b.addActionListener(oyente);
		boton9b.addActionListener(oyente);
		boton0b.addActionListener(oyente);*/
		botonSumar.addActionListener(oyente);
		botonRestar.addActionListener(oyente);
		botonMultiplicar.addActionListener(oyente);
		botonDividir.addActionListener(oyente);
		botonx2.addActionListener(oyente);
		botonx3.addActionListener(oyente);
		sen.addActionListener(oyente);
		setTitle("iCalc");
		setLocationRelativeTo(null); // Center the frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setSize(620,400);
		setVisible(true);
	}

	class OyenteBoton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int num1 = 0, num2 = 0;
			if(!numero1.getText().isEmpty() && !numero2.getText().isEmpty()) {
				num1 = Integer.parseInt(numero1.getText());
				num2 = Integer.parseInt(numero2.getText());
			}

			if(!botonTocado){
				if (e.getSource() == boton1)
					numero1.setText(String.valueOf("1"));
				if (e.getSource() == boton2)
					numero1.setText(String.valueOf("2"));
				if (e.getSource() == boton3)
					numero1.setText(String.valueOf("3"));
				if (e.getSource() == boton4)
					numero1.setText(String.valueOf("4"));
				if (e.getSource() == boton5)
					numero1.setText(String.valueOf("5"));
				if (e.getSource() == boton6)
					numero1.setText(String.valueOf("6"));
				if (e.getSource() == boton7)
					numero1.setText(String.valueOf("7"));
				if (e.getSource() == boton8)
					numero1.setText(String.valueOf("8"));
				if (e.getSource() == boton9)
					numero1.setText(String.valueOf("9"));
				if (e.getSource() == boton0)
					numero1.setText(String.valueOf("0"));

				botonTocado = true;
			} else {
				if (e.getSource() == boton1)
					numero2.setText(String.valueOf("1"));
				if (e.getSource() == boton2)
					numero2.setText(String.valueOf("2"));
				if (e.getSource() == boton3)
					numero2.setText(String.valueOf("3"));
				if (e.getSource() == boton4)
					numero2.setText(String.valueOf("4"));
				if (e.getSource() == boton5)
					numero2.setText(String.valueOf("5"));
				if (e.getSource() == boton6)
					numero2.setText(String.valueOf("6"));
				if (e.getSource() == boton7)
					numero2.setText(String.valueOf("7"));
				if (e.getSource() == boton8)
					numero2.setText(String.valueOf("8"));
				if (e.getSource() == boton9)
					numero2.setText(String.valueOf("9"));
				if (e.getSource() == boton0)
					numero2.setText(String.valueOf("0"));

				botonTocado = false;
			}

			/*	if (e.getSource() == boton1b)
				numero2.setText(String.valueOf("1"));
			if (e.getSource() == boton2b)
				numero2.setText(String.valueOf("2"));
			if (e.getSource() == boton3b)
				numero2.setText(String.valueOf("3"));
			if (e.getSource() == boton4b)
				numero2.setText(String.valueOf("4"));
			if (e.getSource() == boton5b)
				numero2.setText(String.valueOf("5"));
			if (e.getSource() == boton6b)
				numero2.setText(String.valueOf("6"));
			if (e.getSource() == boton7b)
				numero2.setText(String.valueOf("7"));
			if (e.getSource() == boton8b)
				numero2.setText(String.valueOf("8"));
			if (e.getSource() == boton9b)
				numero2.setText(String.valueOf("9"));
			if (e.getSource() == boton0b)
				numero2.setText(String.valueOf("0"));*/

			if (e.getSource() == botonSumar)  
				jlabel.setText(String.valueOf("La suma da " + (num1 + num2)));
			else if (e.getSource() == botonRestar)
				jlabel.setText(String.valueOf("La resta da " + (num1 - num2)));
			else if (e.getSource() == botonMultiplicar)
				jlabel.setText(String.valueOf("La multiplicación da " + (num1 * num2)));
			else if (e.getSource() == botonDividir)
				jlabel.setText(String.valueOf("El cociente da " + (num1 / num2)));
			else if (e.getSource() == botonx2)
				jlabel.setText(String.valueOf("El cuadrado del primer valor da " + (num1 * num1) + " y el cuadrado del segundo valor da " + (num2 * num2)));
			else if (e.getSource() == botonx3)
				jlabel.setText(String.valueOf("El cubo del primer valor da " + (num1 * num1 * num1) + " y el cubo del segundo valor da " + (num2 * num2 * num2)));

			else if (e.getSource() == sen) {
				double seno1 = Math.sin(num1);
				double seno2 = Math.sin(num2);
				jlabel.setText(String.valueOf("El seno del 1er. valor da " + (seno1) + " y el seno del 2º valor da " + (seno2)));
			}

		}
	}
}
