package org.comp;

public class Desktop extends Computer {
	
	private void desktopSize() {
		System.out.println("17 inch");
	}
	
	public static void main(String[] args) {
		
		Desktop a=new Desktop();
		a.desktopSize();
		a.computerModel();
		
		
	}

}
