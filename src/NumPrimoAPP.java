import javax.swing.JOptionPane;

public class NumPrimoAPP {

	public static void main(String[] args) {
		
		String textoNum = JOptionPane.showInputDialog("Introduce un número");
		int numero = Integer.parseInt(textoNum);
		
		if(numPrimo(numero)) {
			JOptionPane.showMessageDialog(null, "El numero " + numero + " es primo");
		}else {
			JOptionPane.showMessageDialog(null, "El numero " + numero + " no es primo");
		}
	}
	
	public static boolean numPrimo(int numero) {
		
		if(numero <= 1) {
			return false;
		}
		
		int divisibles = 0;
		
		for(int divisor=(int)Math.sqrt(numero); divisor > 1; divisor--) {
			if(numero % divisor == 0) {
				divisibles += 1;
			}
		}
		
		if(divisibles >= 1) {
			return false;
		}else {
			return true;
		}		
	}
}
