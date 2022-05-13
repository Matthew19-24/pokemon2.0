/**
 * The Nature class will hold the Pokemon's nature, and it's corresponding values.
 */

package Pokemon;

import java.util.Random;

/**
 * The Nature class will hold the Pokemon's nature, and it's corresponding values.
 * 
 * @author Matthew McCaughey
 */
public class Nature {
	
	/**
	 * Attack boost or reduction.
	 */
	private double attack = 1;
	
	/**
	 * Defense boost or reduction.
	 */
	private double defense = 1;
	
	/**
	 * Speed boost or reduction.
	 */
	private double speed = 1;
	
	/**
	 * Special attack boost or reduction.
	 */
	private double specialAttack = 1;
	
	/**
	 * Special defense boost or reduction.
	 */
	private double specialDefense = 1;
	
	/**
	 * Nature value.
	 */
	private Natures nature;
	
	/**
	 * All natures.
	 */
	enum Natures {ADAMANT, BASHFUL, BRAVE, BOLD, CALM, CAREFUL, DOCILE, GENTLE, HARDY,
					HASTY, IMPISH, JOLLY, LAX, LONELY, MILD, MODEST, NAIVE, NAUGHTY, QUIET, 
					QUIRKY, RASH, RELAXED, SASSY, SERIOUS, TIMID}
	
	/**
	 * Returns the attack nature stat.
	 * @return Attack nature stat.
	 */
	public double getAttack()
	{
		return this.attack;
	} // End getAttack.
	
	/**
	 * Returns the defense nature stat.
	 * @return Defense nature stat.
	 */
	public double getDefense()
	{
		return this.defense;
	} // End getDefense.
	
	/**
	 * Returns the speed nature stat.
	 * @return Speed nature stat.
	 */
	public double getSpeed()
	{
		return this.speed;
	} // End getSpeed.
	
	/**
	 * Returns the special attack nature stat.
	 * @return Special Attack nature stat.
	 */
	public double getSpecialAttack()
	{
		return this.specialAttack;
	} // End getSpecialAttack.
	
	/**
	 * Returns the special defense nature stat.
	 * @return Special Defense nature stat.
	 */
	public double getSpecialDefense()
	{
		return this.specialDefense;
	} // End getSpecialDefense.
	
	/**
	 * Returns the value in the nature field.
	 * @return Nature.
	 */
	public String getNature()
	{
		return this.nature.toString();
	} // End getNature.
	
	private void setNatureValues()
	{
		switch(this.nature) {
		case ADAMANT:
			this.attack = 1.1;
			this.specialAttack = 0.9;
			break;
		case LONELY:
			this.attack = 1.1;
			this.defense = 0.9;
			break;
		case BRAVE:
			this.attack = 1.1;
			this.speed = 0.9;
			break;
		case NAUGHTY:
			this.attack = 1.1;
			this.specialDefense = 0.9;
			break;
		case BOLD:
			this.defense = 1.1;
			this.attack = 0.9;
			break;
		case RELAXED:
			this.defense = 1.1;
			this.speed = 0.9;
			break;
		case IMPISH:
			this.defense = 1.1;
			this.specialAttack = 0.9;
			break;
		case LAX:
			this.defense = 1.1;
			this.specialDefense = 0.9;
			break;
		case TIMID:
			this.speed = 1.1;
			this.attack = 0.9;
			break;
		case HASTY:
			this.speed = 1.1;
			this.defense = 0.9;
			break;
		case JOLLY:
			this.speed = 1.1;
			this.specialAttack = 0.9;
			break;
		case NAIVE:
			this.speed = 1.1;
			this.specialDefense = 0.9;
			break;
		case MODEST:
			this.specialAttack = 1.1;
			this.attack = 0.9;
			break;
		case MILD:
			this.specialAttack = 1.1;
			this.attack = 0.9;
			break;
		case QUIET:
			this.specialAttack = 1.1;
			this.speed = 0.9;
			break;
		case RASH:
			this.specialAttack = 1.1;
			this.specialDefense = 0.9;
			break;
		case CALM:
			this.specialDefense = 1.1;
			this.attack = 0.9;
			break;
		case GENTLE:
			this.specialDefense = 1.1;
			this.defense = 0.9;
			break;
		case SASSY:
			this.specialDefense = 1.1;
			this.speed = 0.9;
			break;
		case CAREFUL:
			this.specialDefense = 1.1;
			this.specialAttack = 0.9;
			break;
		default:
			break;
		}
	} // End setNatureValues.
	
	
	/**
	 * Constructor
	 */
	public Nature()
	{
		Random random = new Random();
		
		this.nature = Natures.values()[random.nextInt(25)];
		this.setNatureValues();
	} // End constructor.
	
	/**
	 * Returns a String representation of the object.
	 * @return String representation of the object.
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.getNature());
		
		return sb.toString();
	} // End toString.

} // End Nature class.
