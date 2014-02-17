package model;

/**
 * Classe modélisant les cubes de ressources ainsi que les larves
 * 
 * @author Jean-Yves Delmotte
 * 
 */

public class Ressource {

	/**
	 * variable d'instance :
	 */
	protected int nombre;

	/**
	 * constructeur principal
	 * 
	 * @param nombre
	 *            le nombre de ressources
	 */
	public Ressource(int nombre) {
		this.nombre = nombre;
	}

	/**
	 * constructeur par défaut
	 * 
	 */
	public Ressource() {
		this(0);
	}

	/**
	 * Méthode indiquant le nombre de ressources
	 * 
	 * @return le nombre de Ressource dispo
	 */
	public int getNombre() {
		return nombre;
	}

	/**
	 * change le nombre de ressouces dispo
	 * 
	 * @param nombre
	 *            le nouveau nombre de Ressource dispo
	 */
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * incrémente de 1 le nombre de ressources
	 */
	public void ajout() {
		nombre++;
	}
	
	/**
	 * lorsqu'on consomme une seule ressource
	 * @return true si la ressource existe
	 * 		   false sinon
	 */
	public boolean consommer() {
		return consommer(1);
	}
	
	/**
	 * lorsqu'on consomme nb ressources
	 * @param nb le nombre de ressouces à consommer
	 * @return true si la ressource existe
	 * 		   false sinon
	 */
	public boolean consommer(int nb) {
		if (nombre - nb >= 0) {
			nombre -= nb;
			return true;
		} else {
			return false;
		}
		
	}

}
