package ie.roryroams.textgame;

public class Character {
	private final static int MAX_HEALTH = 150; /* static means thats its shared by 
	every instance. the max they can have is 150 */
	private String name = null;
	private int currentHealth = 150; //they all start with 150 health
	private Armour currentArmour = null; // start with no armor
	private HealthPotion currentPotion = null; //start with no potion
	private Weapon currentWeapon = null; // start with no weapon
	
	
	

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public Armour getCurrentArmour() {
		return currentArmour;
	}

	public void setCurrentArmour(Armour currentArmour) {
		this.currentArmour = currentArmour;
	}

	public HealthPotion getCurrentPotion() {
		return currentPotion;
	}

	public void setCurrentPotion(HealthPotion currentPotion) {
		this.currentPotion = currentPotion;
	}

	public Weapon getCurrentWeapon() {
		return currentWeapon;
	}

	public void setCurrentWeapon(Weapon currentWeapon) {
		this.currentWeapon = currentWeapon;
	}

	public static int getMaxHealth() {
		return MAX_HEALTH;
	}

	public Character() {
		
	}
	
	
	
}
