package exception;

/**
 * Classe exception de supprimer pizza
 * 
 * @author diginamic
 *
 */
public class DeletePizzaException extends StockageException {

	/**
	 * Construteur exception de supprimer pizza
	 * 
	 * @param message
	 */
	public DeletePizzaException(String message) {
		super(message);
	}

}
