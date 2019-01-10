package testexception;

public class Main {

	public static void main(String[] args) {
		Personne personne = new Personne();
		// personne.setDateDeNaissance(Calendar.getInstance().getTime());

		try {
			boolean estValide = personne.valide();
			System.out.println(estValide);
		} catch (RuntimeException e) {
			e.printStackTrace();
			System.out.println("Une erreur de type runtime est survenue");
		} catch (Exception e) {
			System.out.println("Une erreur est survenue: " + e.getMessage());
		}
		System.out.println("C'est fini");
	}
}
