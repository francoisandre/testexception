package testexception;

import java.util.Date;

public class Personne {

	public Date dateDeNaissance;

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public boolean valide() throws Exception {
		// ...
		try {
			getAge();
			System.out.println("ici");
		} finally {
			System.out.println("la");
		}
		// ...
		return true;
	}

	public int getAge() throws Exception {
		if (dateDeNaissance == null) {
			dateDeNaissance.getTime();
			throw new Exception("La date de naissance n'est pas renseignée");
		} else {
			return 42;
		}
	}

}
