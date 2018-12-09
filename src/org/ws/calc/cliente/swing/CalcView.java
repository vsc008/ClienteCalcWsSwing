package org.ws.calc.cliente.swing;

import java.awt.Container;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcView {
	private static final long serialVersionUID = 1L;
	private JTextField tfValor1;
	private JTextField tfValor2;
	private JButton bLimpar;
	private JButton bSoma;
	private JButton bSubtracao;
	private JButton bMultiplicacao;
	private JButton bDivisao;
	private JLabel lValor1;
	private JLabel lValor2;
	private JLabel lResultado;
	private JLabel lResultadoLabel;
	private JLabel lOperacao;
	private JLabel lOperacaoLabel;
	private JLabel pPanelLeft;
	private JPanel pPanelRight;
	private JPanel pPanelCenter;
	DecimalFormat df = new DecimalFormat("###,##0.00");
	//Construtor
	public CalcView() {
		super("Calculadora");
		pPanelLeft = new JPanel();
		pPanelRight = new JPanel();
		pPanelCenter = new JPanel();
		lValor1 = new JLabel("Valor 1:");
		lValor2 = new JLabel("Valor 2:");
		lResultado = new JLabel("Resultado:");
		lResultadoLabel = new JLabel("");
		lOperacao = new JLabel("");
		lOperacaoLabel = new JLabel("Operação:");
		tfValor1 = new JTextField("");
		tfValor2 = new JTextField("");
		bLimpar = new javax.swing.JButton("Limpar");
		bSoma = new javax.swing.JButton("Soma");
		bSubtracao = new javax.swing.JButton("Subtração");
		bMultiplicacao = new javax.swing.JButton("Multiplicação");
		bDivisao = new javax.swing.JButton("Divisão");
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(1,3));
		pPanelLeft.setLayout(new GridLayourt(4,1));
		pPanelCenter.setLayout(new GridLayout(4,1));
		pPanelRight.setLayout(new GridLayout(5,1));
		cp.add(pPanelLeft);
		cp.add(pPanelCenter);
		cp.add(pPanelRight);
		pPanelLeft.add(lValor1);
		pPanelLeft.add(lValor2);
		pPanelLeft.add(lOperacaoLabel);
		pPanelLeft.add(lResultadoLabel);
		pPanelCenter.add(tfValor1);
		pPanelCenter.add(tfValor2);
		pPanelCenter.add(lOperacao);
		pPanelCenter.add(lResultado);
		pPanelRight.add(bSoma);
		pPanelRight.add(bSubtracao);
		pPanelRight.add(bMultiplicacao);
		pPanelRight.add(bDivisao);
		pPanelRight.add(bLimpar);
		// Registro dos event listeners
	}
}
