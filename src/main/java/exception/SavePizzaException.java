package exception;

/**
 * Classe exception de sauvegarde de pizza
 * 
 * @author diginamic
 *
 */
public class SavePizzaException extends StockageException {

	/**
	 * Construteur exception de sauvegarde de pizza
	 * 
	 * @param message
	 */
	public SavePizzaException(String message) {
		super(message);

	}
}
