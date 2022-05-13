/**
 * The Base class will hold the base information about a specific species of Pokemon.
 */
package Pokemon;

/**
 * The Base class will hold the base information about a specific species of Pokemon.
 * 
 * @author Matthew McCaughey
 *
 */
public class Base {
	
	/**
	 * The base attack stat.
	 */
	private int attack;
	
	/**
	 * The base defense stat.
	 */
	private int defense;
	
	/**
	 * The base speed stat.
	 */
	private int speed;
	
	/**
	 * The base special attack stat.
	 */
	private int specialAttack;
	
	/**
	 * The base special defense stat.
	 */
	private int specialDefense;
	
	/**
	 * The base HP stat.
	 */
	private int hp;
	
	/**
	 * The base EXP stat.
	 */
	private int exp;
	
	/**
	 * Returns the attack base stat.
	 * @return Attack base stat.
	 */
	public int getAttack()
	{
		return this.attack;
	} // End getAttack.
	
	/**
	 * Returns the defense base stat.
	 * @return Defense base stat.
	 */
	public int getDefense()
	{
		return this.defense;
	} // End getDefense.
	
	/**
	 * Returns the speed base stat.
	 * @return Speed base stat.
	 */
	public int getSpeed()
	{
		return this.speed;
	} // End getSpeed.
	
	/**
	 * Returns the special attack base stat.
	 * @return Special Attack base stat.
	 */
	public int getSpecialAttack()
	{
		return this.specialAttack;
	} // End getSpecialAttack.
	
	/**
	 * Returns the special defense base stat.
	 * @return Special Defense base stat.
	 */
	public int getSpecialDefense()
	{
		return this.specialDefense;
	} // End getSpecialDefense.
	
	/**
	 * Returns the HP base stat.
	 * @return HP base stat.
	 */
	public int getHP()
	{
		return this.hp;
	} // End getHP.
	
	/**
	 * Returns the EXP base stat.
	 * @return EXP base stat.
	 */
	public int getEXP()
	{
		return this.exp;
	} // End getEXP
	
	/**
	 * Constructor 
	 * 
	 * @param atk Attack base stat
	 * @param def Defense base stat
	 * @param speed Speed base stat
	 * @param sp_atk Special attack base stat
	 * @param sp_def Special defense base stat
	 * @param hp HP base stat
	 * @param exp EXP base stat
	 */
	public Base (int[] data)
	{	
		this.attack = data[0];
		this.defense = data[1];
		this.speed = data[2];
		this.specialAttack = data[3];
		this.specialDefense = data[4];
		this.hp = data[5];
		this.exp = data[6];
	} // End constructor.
	
	/**
	 * Returns a String representation of the object.
	 * @return String representation of the object.
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Base attack: ").append(this.getAttack());
		sb.append("\nBase Defense: ").append(this.getDefense());
		sb.append("\nBase Speed: ").append(this.getSpeed());
		sb.append("\nBase Special Attack: ").append(this.getSpecialAttack());
		sb.append("\nBase Special Defense: ").append(this.getSpecialDefense());
		sb.append("\nBase HP: ").append(this.getHP());
		sb.append("\nBase EXP: ").append(this.getEXP());
		
		return sb.toString();
	} // End toString.

} // End Base class.
