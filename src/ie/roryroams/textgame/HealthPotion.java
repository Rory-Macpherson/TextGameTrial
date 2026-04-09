package ie.roryroams.textgame;
import java.util.concurrent.ThreadLocalRandom;
public enum HealthPotion {
	Small_Health_Potion 	("A small health potion that recovers 20 health", 20),
	Health_Potion 			("A health potion that recovers 40 health", 40),
	Large_Health_Potion 	("A large health potion that recovers 60 health", 60);
	
	public static HealthPotion randomPotion() {
	    HealthPotion[] potions = HealthPotion.values();
	    int index = ThreadLocalRandom.current().nextInt(potions.length);
	    return potions[index];
	}
	
	private final String description;
	private final int healingAmount;
	
	private HealthPotion(String description, int healingAmount) {
		this.description = description;
		this.healingAmount = healingAmount;
	}

	public String getDescription() {
		return description;
	}

	public int getHealingAmount() {
		return healingAmount;
	}
	
	
}

