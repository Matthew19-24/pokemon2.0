/**
 * The Party will hold 3 of the users Pokemon ready for battle.
 */

package Player;

import Pokemon.*;

/**
 * The Party will hold 3 of the users Pokemon ready for battle.
 * @author Matthew McCaughey
 */
public class Party {
	
	/**
	 * The first Pokemon slot.
	 */
	private Pokemon slot1;
	
	/**
	 * The second Pokemon slot.
	 */
	private Pokemon slot2;
	
	/**
	 * The third Pokemon slot.
	 */
	private Pokemon slot3;
	
	/**
	 * Sets the Pokemon in slot1.
	 * @param poke Pokemon.
	 */
	public void setSlot1(Pokemon poke) 
	{
		this.slot1 = poke;
	} // End setSlot1
	
	/**
	 * Returns the Pokemon in slot1
	 * @return Pokemon.
	 */
	public Pokemon getSlot1()
	{
		return this.slot1;
	} // End getSlot1.
	
	/**
	 * Sets the Pokemon in slot2.
	 * @param poke Pokemon.
	 */
	public void setSlot2(Pokemon poke)
	{
		this.slot2 = poke;
	} // End setSlot2.
	
	/**
	 * Returns the Pokemon in slot3.
	 * @return Pokemon.
	 */
	public Pokemon getSlot2()
	{
		return this.slot2;
	} // End getSlot2.
	
	/**
	 * Sets the Pokemon in slot3.
	 * @param poke Pokemon.
	 */
	public void setSlot3(Pokemon poke)
	{
		this.slot3 = poke;
	} // End setSlot3.
	
	/**
	 * Returns the Pokemon in slot3
	 * @return Pokemon.
	 */
	public Pokemon getSlot3()
	{
		return this.slot3;
	} // End getSlot3.
	
	/**
	 * Constructor
	 * @param poke Pokemon
	 */
	public Party(Pokemon poke)
	{
		this.setSlot1(poke);
	} // End constructor.
	
	/**
	 * Constructor
	 * @param poke Pokemon.
	 * @param poke2 Pokemon.
	 */
	public Party(Pokemon poke, Pokemon poke2)
	{
		this(poke);
		this.setSlot2(poke2);
	} // End constructor.
	
	/**
	 * Constructor
	 * @param poke Pokemon.
	 * @param poke2 Pokemon.
	 * @param poke3 Pokemon.
	 */
	public Party(Pokemon poke, Pokemon poke2, Pokemon poke3)
	{
		this(poke, poke2);
		this.setSlot3(poke3);
	} // End constructor.

} // End Party class.
