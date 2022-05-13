/**
 * The IV class is the Pokemon's individual strengths.
 */
package Pokemon;

import java.util.Random;

/**
 * The IV class is the Pokenon's individual strengths.
 * 
 * @author Matthew McCaughey
 */
public class IV {
	
	/**
	 * Attack IV.
	 */
	private int attack;
	
	/**
	 * Defense IV.
	 */
	private int defense;
	
	/**
	 * Speed IV.
	 */
	private int speed;
	
	/**
	 * Special Attack IV.
	 */
	private int specialAttack;
	
	/**
	 * Special Defense IV.
	 */
	private int specialDefense;
	
	/**
	 * HP IV.
	 */
	private int hp;
	
	/**
	 * Returns the attack IV.
	 * @return Attack IV.
	 */
	public int getAttack()
	{
		return this.attack;
	} // End getAttack.
	
	/**
	 * Returns the defense IV.
	 * @return Defense IV.
	 */
	public int getDefense()
	{
		return this.defense;
	} // End getDefense.
	
	/**
	 * Returns the speed IV.
	 * @return Speed IV.
	 */
	public int getSpeed()
	{
		return this.speed;
	} // End getSpeed.
	
	/**
	 * Returns the special attack IV.
	 * @return Special Attack IV.
	 */
	public int getSpecialAttack()
	{
		return this.specialAttack;
	} // End getSpecialAttack.
	
	/**
	 * Returns the special defense IV.
	 * @return Special Defense IV.
	 */
	public int getSpecialDefense()
	{
		return this.specialDefense;
	} // End getSpecialDefense.
	
	/**
	 * Returns the HP IV.
	 * @return HP IV.
	 */
	public int getHP()
	{
		return this.hp;
	} // End getHP.
	
	/**
	 * Constructor initializes all stats as a random number from 0-31.
	 */
	public IV()
	{
		Random random = new Random();
		
		this.attack = random.nextInt(32);
		this.defense = random.nextInt(32);
		this.speed = random.nextInt(32);
		this.specialAttack = random.nextInt(32);
		this.specialDefense = random.nextInt(32);
		this.hp = random.nextInt(32);
	} // End constructor.
	
	/**
	 * Returns a String representation of the object.
	 * @return String representation of the object.
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Attack IV: ").append(this.getAttack());
		sb.append("\nDefense IV: ").append(this.getDefense());
		sb.append("\nSpeed IV: ").append(this.getSpeed());
		sb.append("\nSpecial Attack IV: ").append(this.getSpecialAttack());
		sb.append("\nSpecial Defense IV: ").append(this.getSpecialDefense());
		sb.append("\nHP IV: ").append(this.getHP());
		
		return sb.toString();
	} // End toString.

} // End IV class.
