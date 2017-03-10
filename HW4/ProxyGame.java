/**
 * 
 */
package Game;

/**
 * @author HUNG V LE
 *
 */
public class ProxyGame implements Game{

	protected Game wrappee;
	
	public ProxyGame (Game _wrappee) {
		this.wrappee = _wrappee;
	}
	@Override
	public int option() {
		if (this.wrappee == null) {
			wrappee = new GameMenu();
		}
		wrappee.option();		
		return 0;
	}

}
