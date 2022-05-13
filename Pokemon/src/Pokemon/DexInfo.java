/**
 * The DexInfo class will read and hold the information about a specific Pokemon from the DataDex.
 */
package Pokemon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The DexInfo class will read and hold the information about a specific Pokemon from the DataDex.
 * 
 * @author Matthew McCaughey
 */
public class DexInfo {
	
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
	 */
	private void readDataDex(String dexNum)
	{
		// Create list.
		int[] baseStats = new int[7];
		
		try {
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
		}
		catch (FileNotFoundException e) {
			System.out.println("FILE NOT READ");
		}
		
		this.base = new Base(baseStats);
	} // End readDataDex.
	
	/**
	 * Constructor
	 * @param dexNumber Pokemon's pokedex number.
	 */
	public DexInfo(String dexNumber)
	{
		this.readDataDex(dexNumber);
	} // End DexInfo method.
	
	/**
	 * Returns a String representation of the object.
	 * @return String representation of the object.
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Species: ").append(this.species);
		sb.append("\nType: ").append(this.type);
		sb.append("\nType 2: ").append(this.type2);
		sb.append("\nGrowth Group: ").append(this.growthGroup);
		
		return sb.toString();
	} // End toString.

} // End DexInfo class.
