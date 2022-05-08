/**
 * The EV class is the Pokemon's effort values.
 */

package Pokemon;

/**
 * The EV class is the Pokeon's effort values.
 * @author Matthew McCaughey
 */
public class EV {
	
	/**
	 * Attack effort value.
	 */
	private int attack;
	
	/**
	 * Defense effort value.
	 */
	private int defense;
	
	/**
	 * Speed effort value.
	 */
	private int speed;
	
	/**
	 * Special attack effort value.
	 */
	private int specialAttack;
	
	/**
	 * Special defense effort value.
	 */
	private int specialDefense;
	
	/**
	 * HP effort value.
	 */
	private int hp;
	
	/**
	 * Returns the attack effort value.
	 * @return Attack effort value.
	 */
	public int getAttack()
	{
		return this.attack;
	} // End getAttack.
	
	/**
	 * Adds an effort value to the attack field.
	 */
	public void addAttack()
	{
		this.attack += 1;
	} // End addAttack.
	
	/**
	 * Removes an effort value to the attack field.
	 */
	public void removeAttack()
	{
		this.attack -= 1;
	} // End removeAttack.
	
	/**
	 * Returns the defense effort value.
	 * @return Defense effort value.
	 */
	public int getDefense()
	{
		return this.defense;
	} // End getDefense.
	
	/**
	 * Adds an effort value to the defense field.
	 */
	public void addDefense()
	{
		this.defense += 1;
	} // End addDefense.
	
	/**
	 * Removes an effort value from the defense field.
	 */
	public void removeDefense()
	{
		this.defense -= 1;
	} // End removeDefense.
	
	/**
	 * Returns the speed effort value.
	 * @return Speed effort value.
	 */
	public int getSpeed()
	{
		return this.speed;
	} // End getSpeed.
	
	/**
	 * Adds an effort value to the speed field.
	 */
	public void addSpeed()
	{
		this.speed += 1;
	} // End addSpeed.
	
	/**
	 * Removes an effort value from the speed field
	 */
	public void removeSpeed()
	{
		this.speed -= 1;
	} // End removeSpeed.
	
	/**
	 * Returns the special attack effort value.
	 * @return Special attack effort value.
	 */
	public int getSpecialAttack()
	{
		return this.specialAttack;
	} // End getSpecialAttack.
	
	/**
	 * Adds an effort value to the special attack field.
	 */
	public void addSpecialAttack()
	{
		this.specialAttack += 1;
	} // End addSpecialAttack.
	
	/**
	 * Removes an effort value from the special attack field.
	 */
	public void removeSpecialAttack()
	{
		this.specialAttack -= 1;
	} // End removeSpecialAttack.
	
	/**
	 * Returns the special defense effort value.
	 * @return Special defense effort value.
	 */
	public int getSpecialDefense()
	{
		return this.specialDefense;
	} // End getSpecialDefense;
	
	/**
	 * Adds an effort value to the special defense field.
	 */
	public void addSpecialDefense()
	{
		this.specialDefense += 1;
	} // End addSpecialDefense.
	
	/**
	 * Removes an effort value from the special defense field.
	 */
	public void removeSpecialDefense()
	{
		this.specialDefense -= 1;
	} // End removeSpecialDefense.
	
	/**
	 * Returns the HP effort value.
	 * @return HP effort value.
	 */
	public int getHP()
	{
		return this.hp;
	} // End getHP.
	
	/**
	 * Adds an effort value to the HP field.
	 */
	public void addHP()
	{
		this.hp += 1;
	} // End addHP.
	
	/**
	 * Removes an effort value from the HP field.
	 */
	public void removeHP()
	{
		this.hp -= 1;
	} // End removeHP.
	
	/**
	 * Returns a String representation of the object.
	 * @return String representation of the object.
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nAttack EV: ").append(this.getAttack());
		sb.append("\nDefense EV: ").append(this.getDefense());
		sb.append("\nSpeed EV: ").append(this.getSpeed());
		sb.append("\nSpecial Attack EV: ").append(this.getSpecialAttack());
		sb.append("\nSpecial Defense EV: ").append(this.getSpecialDefense());
		sb.append("\nHP EV: ").append(this.getHP());
		
		return sb.toString();
	} // End toString.
	
} // End EV class.
