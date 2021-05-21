package alchemyGame;

import javax.swing.JFrame;


public class MyFrame extends JFrame {

	DragPanel dragPanel = new DragPanel();
	
	MyFrame(){
		
	this.add(dragPanel);
	this.setTitle("Alchemy Game");
	this.setSize(600, 600);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
	
	

}

}