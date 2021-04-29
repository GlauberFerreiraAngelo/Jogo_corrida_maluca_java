package com.jogo;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Corrida extends JFrame {
   
    JLabel lCarroMaquinqDoMal = new JLabel(new ImageIcon(getClass().getResource("./img/maquinadomal.png")));
	JLabel lCarroPenelopeCharmosa = new JLabel(new ImageIcon(getClass().getResource("./img/penelopecharmosa.png")));
	JLabel lCarroQuadrilhaDaMorte = new JLabel(new ImageIcon(getClass().getResource("./img/quadrilhadamorte.png")));
	JLabel lCarroPeterPerfeito = new JLabel(new ImageIcon(getClass().getResource("./img/peterperfeito.png")));
	
	public Corrida(){
		editarJanela();
		new Movimento().start();
	}
	
	public void editarJanela(){

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1200,500);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		lCarroMaquinqDoMal.setBounds(0, 0, 200, 100);
		lCarroPenelopeCharmosa.setBounds(0, 100, 200, 100);
		lCarroQuadrilhaDaMorte.setBounds(0, 200, 200, 100);
		lCarroPeterPerfeito.setBounds(0, 300, 200, 100);
		add(lCarroMaquinqDoMal);
		add(lCarroPenelopeCharmosa);
		add(lCarroQuadrilhaDaMorte);
		add(lCarroPeterPerfeito);
	}
	
	public class Movimento extends Thread{

        Random velocidade = new Random();
        boolean resultado = true;
        int vel = 10;

		public void run(){
			while(resultado){

				try{
					sleep(20);
				}catch(Exception e){
				}

				if(lCarroMaquinqDoMal.getX() < 1000){
					lCarroMaquinqDoMal.setBounds(lCarroMaquinqDoMal.getX() + velocidade.nextInt(vel-2), 0, 200, 100);
				}else{
                    resultado = false;
                }
				
				if(lCarroPenelopeCharmosa.getX() < 1000){
					lCarroPenelopeCharmosa.setBounds(lCarroPenelopeCharmosa.getX() + velocidade.nextInt(vel), 100, 200, 100);
				}else{
                    resultado = false;
                }
				
				if(lCarroQuadrilhaDaMorte.getX() < 1000){
					lCarroQuadrilhaDaMorte.setBounds(lCarroQuadrilhaDaMorte.getX() + velocidade.nextInt(vel), 200, 200, 100);
				}else{
                    resultado = false;
                }
				
				if(lCarroPeterPerfeito.getX() < 1000){
					lCarroPeterPerfeito.setBounds(lCarroPeterPerfeito.getX() + velocidade.nextInt(vel), 300, 200, 100);
				}else{
                    resultado = false;
                }
				
			}
		}
	}
	
	public static void main(String[] args) {
		new Corrida();
	}
}
