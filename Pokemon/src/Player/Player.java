/**
 * The Player will hold everything that the user will need.
 */
package Player;
import Pokemon.*;

/**
 * The Player will hold everything that the user will need.
 * @author Matthew McCaughey
 */
public class Player {
	
	/**
	 * The player's party of Pokemon.
	 */
	private Party party;
	
	/**
	 * Returns the party.
	 * @return Party
	 */
	public Party getParty()
	{
		return this.party;
	} // End getParty.
	
	/**
	 * Constructor.
	 * @param poke Pokemon.
	 */
	public Player(Pokemon poke)
	{
		this.party = new Party(poke);
	} // End constructor.
	

} // End Player class.
