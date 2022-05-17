package Pokemon;

public class StatStages {
	
	/**
	 * Attack stat stage
	 */
	private int attack;
	
	/**
	 * Defense stat stage
	 */
	private int defense;
	
	/**
	 * Speed stat stage
	 */
	private int speed;
	
	/**
	 * Special attack stage
	 */
	private int specialAttack;
	
	/**
	 * Special defense stage
	 */
	private int specialDefense;
	
	/**
	 * Adds one stat stage to attack field.
	 */
	public void addAttack()
	{
		if (this.attack < 6) 
		{
			this.attack++;
		}
	} // End addAttack.
	
	/**
	 * Removes one stat stage to attack field.
	 */
	public void removeAttack()
	{
		if (this.attack > -6)
		{
			this.attack--;
		}
	} // End removeAttack.
	
	/**
	 * Returns the value in the attack field.
	 * @return Attack stat stage.
	 */
	public int getAttack()
	{
		return this.attack;
	} // End getAttack.
	
	/**
	 * Adds one stat stage to the defense field.
	 */
	public void addDefense()
	{
		if (this.attack < 6)
		{
			this.defense++;
		}
	} // End addDefense.
	
	/**
	 * Remove one stat stage from the defense field.
	 */
	public void removeDefense()
	{
		if (this.attack > -6)
		{
			this.defense--;
		}
	} // End removeDefense.
	
	/**
	 * Returns the value in the defense field.
	 * @return Defense stat stage.
	 */
	public int getDefense()
	{
		return this.defense;
	} // End getDefense.
	
	/**
	 * Adds one stat stage to the speed field.
	 */
	public void addSpeed()
	{
		if (this.speed < 6)
		{
			this.speed++;
		}
	} // End addSpeed.
	
	/**
	 * Removes one stat stage from the speed field.
	 */
	public void removeSpeed()
	{
		if (this.speed > -6)
		{
			this.speed--;
		}
	} // End removeSpeed.
	
	/**
	 * Returns the value in the speed field.
	 * @return Speed stat stage.
	 */
	public int getSpeed()
	{
		return this.speed;
	} // End getSpeed.
	
	/**
	 * Adds one stat stage to the special attack field.
	 */
	public void addSpecialAttack()
	{
		if (this.specialAttack < 6)
		{
			this.specialAttack++;
		}
	} // End addSpecialAttack.
	
	/**
	 * Removes one stat stage from the special attack field.
	 */
	public void removeSpecialAttack()
	{
		if (this.specialAttack > -6)
		{
			this.specialAttack++;
		}
	} // End removeSpecialAttack
	
	/**
	 * Returns the value in the special attack field.
	 * @return Special attack stat stage
	 */
	public int getSpecialAttack()
	{
		return this.specialAttack;
	} // Return specialAttack.
	
	/**
	 * Adds one value to the special defense field.
	 */
	public void addSpecialDefense()
	{
		if (this.specialDefense < 6)
		{
			this.specialDefense++;
		}
	} // End addSpecialDefense.
	
	/**
	 * Removes one value from the special defense field.
	 */
	public void removeSpecialDefense()
	{
		if (this.specialDefense > -6)
		{
			this.specialDefense--;
		}
	} // End removeSpecialDefense.
	
	/**
	 * Returns the value stored in the special defense field.
	 * @return special defense stat stage.
	 */
	public int getSpecialDefense()
	{
		return this.specialDefense;
	} // End getSpecialDefense.
	
	/**
	 * Resets all stat stages
	 */
	public void reset()
	{
		this.attack = 0;
		this.defense = 0;
		this.speed = 0;
		this.specialAttack = 0;
		this.specialDefense = 0;
	} // End reset.
	
	/**
	 * Returns a String representation of the object.
	 * @return String representation of the object.
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Attack Stat Stage: ").append(this.getAttack());
		sb.append("\nDefense Stat Stage: ").append(this.getDefense());
		sb.append("\nSpeed Stat Stage: ").append(this.getSpeed());
		sb.append("\nSpecial Attack Stat Stage: ").append(this.getSpecialAttack());
		sb.append("\nSpecial Defense Stat Stage: ").append(this.getSpecialDefense());
		
		return sb.toString();
	} // End toString.
	

} // End statStages
