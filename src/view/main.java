package view;

import javax.swing.JOptionPane;

import controller.killcontroler;

public class main {
	public static void main (String[] args) {
		killcontroler kill = new killcontroler();
		int opc = 0 ;
		while (opc!=9){
		opc = Integer.parseInt(JOptionPane.showInputDialog("1- mostrar tasklist \n 2- matar processo \n 9- Finaliza"));
		switch (opc) {
		       case 1: kill.lerprocesso(null);
		                break;
		       case 2: 	 
		    	   String param = JOptionPane.showInputDialog("Digite a chamada por nome ou pid");
					kill.killProcess(param, kill.os());
		               break;
		       case 9:  JOptionPane.showMessageDialog(null,"Programa finalizado");
		                break;
		       default: JOptionPane.showMessageDialog(null,"Opção Inválida");
   }
}
	}
}