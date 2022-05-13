/**
 * The Leveling class will track the Pokemon's leveling process.
 */

package Pokemon;

/**
 * The Leveling class will track the Pokemon's leveling process.
 * @author Matthew McCaughey
 *
 */
public class Leveling {

	/**
	 * The Pokemon's level.
	 */
	private int lvl;
	
	/**
	 * The Pokemon's experience gain.
	 */
	private int xp;
	
	/**
	 * The Pokemon's growth group.
	 */
	private String growthGroup;
	
	/**
	 * Returns the Pokemon's level.
	 * @return Pokemon's level.
	 */
	public int getLvl()
	{
		return this.lvl;
	} // End getLvl.
	
	/**
	 * Returns the Pokemon's experience cap.
	 * @return Experience cap.
	 */
	private int xpCap() {
		int xp = 0;
		
		switch(this.growthGroup) 
		{
		case "fast":
			return (int) Math.floor(.8 * (Math.pow((this.getLvl() + 1), 3)));
		case "med_fast":
			//TODO FIX!!
			return 4;
		default:
			return 0;
		} // End switch statement.
	} // End xpCap.
	
	/**
	 * Constructor
	 * @param lvl The Pokemon's level.
	 */
	public Leveling(int lvl, String group)
	{
		this.lvl = lvl;
		this.growthGroup = group;
	} // End constructor.
	
} // End leveling.
