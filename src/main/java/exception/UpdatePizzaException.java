package exception;

/**
 * Classe exception de mise à jour pizza
 * 
 * @author diginamic
 *
 */
public class UpdatePizzaException extends StockageException {

	/**
	 * Construteur exception de mise à jour pizza
	 * 
	 * @param message
	 */
	public UpdatePizzaException(String message) {
		super(message);
	}

}
