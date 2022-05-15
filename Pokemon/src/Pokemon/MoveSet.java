/**
 * Holds the Pokemon's move set.
 */
package Pokemon;

import Moves.Move;

/**
 * @author Matthew McCaughey
 */
public class MoveSet {
	
	/**
	 * First move in the moveset.
	 */
	private Move move1;
	
	/**
	 * Second move in the moveset.
	 */
	private Move move2;
	
	/**
	 * Third move in the moveset.
	 */
	private Move move3;
	
	/**
	 * Fourth move in the moveset.
	 */
	private Move move4;
	
	/**
	 * Array of the moveset.
	 */
	Move moves[] = {move1, move2, move3, move4};
	
	/**
	 * Returns move1.
	 * @return First move in the moveset.
	 */
	public Move getMove1()
	{
		return move1;
	} // End getMove1.
	
	/**
	 * Returns move2.
	 * @return Second move in the moveset.
	 */
	public Move getMove2()
	{
		return move2;
	} // End getMove2.
	
	/**
	 * Returns move3.
	 * @return Third move in the moveset.
	 */
	public Move getMove3()
	{
		return move3;
	} // End getMove3.
	
	/**
	 * Returns move4.
	 * @return Fourth move in the moveset.
	 */
	public Move getMove4()
	{
		return move4;
	} // End getMove4.
	
	/**
	 * Checks to see if there is an empty slot in the moveset.
	 * @return true if there is an empty slot, false if all slots are full.
	 */
	public boolean hasEmpty()
	{	
		for(int i = 0; i < this.moves.length; i++)
		{
			if(this.moves[i] == null)
			{
				return true;
			}
		}
		return false;
	} // End hasEmpty.
	
	/**
	 * Adds a new attack to the first empty MoveSet slot.
	 * @param move The move to be added.
	 */
	public void newAttack(Move move)
	{
		for(int i = 0; i < this.moves.length; i++)
		{
			if(this.moves[i] == null)
			{
				if(i == 1)
				{
					this.move1 = move;
				}
				else if(i == 2)
				{
					this.move2 = move;
				}
				else if(i == 3)
				{
					this.move3 = move;
				}
				else if(i == 4)
					this.move4 = move;
			}
		}
	} // End newAttack.
	
	// TODO newOverwriteAttack
	// Constructor
	// toString
	
} // End MoveSet.
