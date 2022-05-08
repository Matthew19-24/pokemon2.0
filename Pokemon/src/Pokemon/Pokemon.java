/**
 * The Pokemon class holds all the stats for each Pokemon.
 */

package Pokemon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The Pokemon class holds the stats for each Pokemon.
 * 
 * @author Matthew McCaughey
 */
public class Pokemon {
	
	/**
	 * The Pokemon's species.
	 */
	private String species;
	
	/**
	 * The Pokemon's type.
	 */
	private String type;
	
	/**
	 * The Pokemon's second type.
	 */
	private String type2;
	
	/**
	 * The Pokemon's growth group.
	 */
	private String growthGroup;
	
	/**
	 * The Pokemon's effort values (EV's).
	 */
	private EV ev;
	
	/**
	 * The Pokemon's individual strength values (IV's).
	 */
	private IV iv;
	
	/**
	 * The Pokenon's base stats and info (Passed from species)
	 */
	private Base base;
	
	/**
	 * Returns the value stored in the species field.
	 * @return Species
	 */
	public String getSpecies()
	{
		return this.species;
	} // End getSpecies.
	
	/**
	 * Returns the value stored in the type field.
	 * @return Type.
	 */
	public String getType()
	{
		return this.type;
	} // getType.
	
	/**
	 * Returns the value stored in the type2 field.
	 * @return Type2.
	 */
	public String getType2()
	{
		return this.type2;
	} // End getType2.
	
	/**
	 * Returns the value stored in the growth group field.
	 * @return Growth Group
	 */
	public String getGrowthGroup()
	{
		return this.growthGroup;
	} // End getGrowthGroup.
	
	/**
	 * Returns the EV object.
	 * @return EV's
	 */
	public EV getEVs()
	{
		return this.ev;
	} // End getEVs.
	
	/**
	 * Returns the IV object.
	 * @return IV's
	 */
	public IV getIVs()
	{
		return this.iv;
	} // End getIVs.
	
	/**
	 * Returns the Base object.
	 * @return Base stats.
	 */
	public Base getBase()
	{
		return this.base;
	} // End getBase.
	
	/**
	 * Reads a Pokemon's set data from the DataDex. Setting it's species, type, growth group and base stats.
	 * @param dexNum Pokedex number.
	 * @throws FileNotFoundException For reading through the files.
	 */
	private void readDataDex(String dexNum) throws FileNotFoundException
	{
		// Create list.
		int[] baseStats = new int[7];
		
		// Open file to read.
		File data = new File("DataDex\\" + dexNum + ".txt");
		Scanner inputFile = new Scanner(data);
		
		this.species = inputFile.nextLine();
		this.type = inputFile.nextLine();
		this.type2 = inputFile.nextLine();
		this.growthGroup = inputFile.nextLine();
		baseStats[0] = inputFile.nextInt();
		baseStats[1] = inputFile.nextInt();
		baseStats[2] = inputFile.nextInt();
		baseStats[3] = inputFile.nextInt();
		baseStats[4] = inputFile.nextInt();
		baseStats[5] = inputFile.nextInt();
		baseStats[6] = inputFile.nextInt();
		
		inputFile.close();
		
		this.base = new Base(baseStats);
	} // End readDataDex.
	
	/**
	 * Constructor
	 * @param Pokedex number.
	 * @throws FileNotFoundException 
	 */
	public Pokemon(String dexNum) throws FileNotFoundException
	{
		this.readDataDex(dexNum);
		this.ev = new EV();
		this.iv = new IV();
	} // End constructor.
	
	/**
	 * Returns a String representation of the object.
	 * @return String representation of the object.
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nSpecies: ").append(this.getSpecies());
		sb.append("\nType: ").append(this.getType());
		sb.append("\nType2: ").append(this.getType2());
		sb.append("\nGrowth Group: ").append(this.getGrowthGroup());
		
		return sb.toString();
	} // End toString.

} // End Pokemon Class.
