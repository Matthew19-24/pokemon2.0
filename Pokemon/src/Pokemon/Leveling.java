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
	 * Returns the Pokemon's xp.
	 * @return Pokemon's xp.
	 */
	public int getXp()
	{
		return this.xp;
	} // End getXp.
	
	/**
	 * Pokemon raises one level.
	 */
	public void levelUp()
	{
		this.lvl++;
	} // End levelUp.
	
	public void gainXp(int xp)
	{
		this.xp += xp;
	} // End gainXp.
	
	/**
	 * Returns the Pokemon's experience cap.
	 * @return Experience cap.
	 */
	private int xpCap() {
		switch(this.growthGroup) 
		{
		case "fast":
			return (int) Math.floor(.8 * (Math.pow((this.getLvl() + 1), 3)));
		case "med_fast":
			return (int) Math.floor(Math.pow((this.getLvl() + 1), 3));
		case "med_slow":
			return (int) Math.floor((1.2 * Math.pow((this.getLvl() + 1), 3)) - 
									(15 * Math.pow((this.getLvl() + 1), 2)) + 
									(100 * (this.getLvl() + 1) - 140));
		case "slow":
			return (int) Math.floor(1.25 * Math.pow((this.getLvl() + 1), 3));
		default:
			return 0;
		} // End switch statement.
	} // End xpCap.
	
	/**
	 * Checks the xp points, if it reaches xpCap, Pokemon levels up.
	 */
	public void checkXp()
	{
		for(int i = 0; i < 99; i++)
		{
			if(this.getXp() >= this.xpCap())
			{
				this.levelUp();
			}
			else
			{
				break;
			}
		}
	} // End checkXp.
	
	/**
	 * Constructor
	 * @param lvl The Pokemon's level.
	 */
	public Leveling(int lvl, String group)
	{
		this.lvl = lvl;
		this.xp = 0;
		this.growthGroup = group;
	} // End constructor.
	
	/**
	 * Returns a String representation of the object.
	 * @return String representation of the object.
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Level: ").append(this.getLvl());
		sb.append("\nXP: ").append(this.getXp());
		sb.append("\nNext Level: ").append(this.xpCap());
		
		return sb.toString();
	} // End toString.
	
} // End leveling.
