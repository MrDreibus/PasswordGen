import javax.swing.JOptionPane;

public class PasswordGen {

	public static void main(String[] args) {
		//Atributes
		int digitos, random;
		char randoml = 0;
		String contraseña = "";
		
		//Ask for the number of digits the user wants in his password
		digitos = Integer.parseInt(JOptionPane.showInputDialog("¿De cuantos digitos quiere que sea la contraseña?"));
		
		for (int i = 0; i < digitos; i++) {
			random = (int) (Math.random() * 4 +1);
			
			if (random==1) {
				randoml = (char) Math.floor(Math.random()*(90-65+1)+65);
				contraseña += randoml;
			} else if (random==2) {
				randoml = (char) Math.floor(Math.random()*(122-97+1)+97);
				contraseña += randoml;
			} else if (random==3) {
				random = (int) Math.floor(Math.random()*(46-33+1)+33);
				contraseña += (char) random;
				
			} else {
				random = (int) Math.floor(Math.random()*(57-48+1)+48);
				contraseña += (char) random;
				
			}
			
		}
		
		//Show password
		JOptionPane.showMessageDialog(null, contraseña);
		
	}

}
