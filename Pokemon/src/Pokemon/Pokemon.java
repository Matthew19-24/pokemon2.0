/**
 * The Pokemon class holds all the stats for each Pokemon.
 */

package Pokemon;

/**
 * The Pokemon class holds the stats for each Pokemon.
 * 
 * @author Matthew McCaughey
 */
public class Pokemon {
	
	/**
	 * The Pokemon's effort values (EV's).
	 */
	private EV ev;
	
	/**
	 * The Pokemon's individual strength values (IV's).
	 */
	private IV iv;
	
	/**
	 * The Pokemon's nature and it's corresponding values.
	 */
	private Nature nature;
	
	/**
	 * The Pokemon's information from the DataDex
	 */
	private DexInfo dexInfo; 
	
	/**
	 * The Pokemon's leveling information.
	 */
	private Leveling levels;
	
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
	 * @return IV's.
	 */
	public IV getIVs()
	{
		return this.iv;
	} // End getIVs.
	
	/**
	 * Returns the nature object.
	 * @return Nature.
	 */
	public Nature getNature()
	{
		return this.nature;
	} // End getNature.
	
	/**
	 * Returns the base object.
	 * @return Base.
	 */
	public Base getBase()
	{
		return this.dexInfo.getBase();
	} // End getBase.
	
	/**
	 * Returns the dexInfo object.
	 * @return DexInfo.
	 */
	public DexInfo getDexInfo()
	{
		return this.dexInfo;
	} // End getDexInfo.
	
	/**
	 * The Pokemon's attack stat for battle.
	 * @return Pokemon's attack stat.
	 */
	public int attack()
	{
		return (int) Math.floor(Math.floor((2 * this.getBase().getAttack() + this.getIVs().getAttack() + this.getEVs().getAttack()) *
				this.levels.getLvl() / 100 + 5 ) * this.getNature().getAttack());
	} // End attackStat.
	
	/**
	 * The Pokemon's defense stat for battle.
	 * @return Pokemon's defense stat.
	 */
	public int defense()
	{
		return (int) Math.floor(Math.floor((2 * this.getBase().getDefense() + this.getIVs().getDefense() + this.getEVs().getDefense()) * 
				this.levels.getLvl() / 100 + 5) * this.nature.getDefense());
	} // End defenseStat.
	
	/**
	 * The Pokemon's speed stat for battle.
	 * @return Pokemon's speed stat.
	 */
	public int speed()
	{
		return (int) Math.floor(Math.floor((2 * this.getBase().getSpeed() + this.getIVs().getSpeed() + this.getEVs().getSpeed()) * 
				this.levels.getLvl() / 100 + 5) * this.nature.getSpeed());
	} // End speedStat.
	
	/**
	 * The Pokemon's special attack stat for battle.
	 * @return Pokemon's special attack stat.
	 */
	public int specialAttack()
	{
		return (int) Math.floor(Math.floor((2 * this.getBase().getSpecialAttack() + this.getIVs().getSpecialAttack() + 
				this.getEVs().getSpecialAttack()) * this.levels.getLvl() / 100 + 5) * this.getNature().getSpecialAttack());
	} // End specialAttackStat
	
	/**
	 * The Pokemon's special defense stat for battle.
	 * @return Pokemon's special defense stat.
	 */
	public int specialDefense()
	{
		return (int) Math.floor(Math.floor((2 * this.getBase().getSpecialDefense() + this.getIVs().getSpecialAttack() + 
				this.getEVs().getSpecialDefense()) * this.levels.getLvl() / 100 + 5) * this.getNature().getSpecialDefense());
	} // End specialDefense.
	
	/**
	 * The Pokemon's hp stat for battle
	 * @return Pokemon's hp stat.
	 */
	public int hp()
	{
		return (int) Math.floor((2 * this.getBase().getHP() + this.getIVs().getHP() + this.getEVs().getHP()) * 
				this.levels.getLvl() / 100 + this.levels.getLvl() + 10);
	} // End hp.
	
	/**
	 * Constructor
	 * @param Pokedex number.
	 */
	public Pokemon(String dexNum, int lvl)
	{
		this.ev = new EV();
		this.iv = new IV();
		this.nature = new Nature();
		this.dexInfo = new DexInfo(dexNum);
		this.levels = new Leveling(lvl, this.dexInfo.getGrowthGroup());
	} // End constructor.
	
	/**
	 * Returns a String representation of the object.
	 * @return String representation of the object.
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		return sb.toString();
	} // End toString.

} // End Pokemon Class.
