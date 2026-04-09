package ie.roryroams.textgame;

import java.util.concurrent.ThreadLocalRandom;

public record Armour(String armourType, Quality quality, int protection) {

	public int protectionAmount() {
		return (int)(protection * quality.getModifier()); 
		}
	
	
	public static Armour randomArmour() {
        String[] types = {"Leather", "Bronze", "Steel"};
        int[] baseProtection = {4, 7, 10};

        int index = ThreadLocalRandom.current().nextInt(types.length);
        String type = types[index];
        int base = baseProtection[index];

        Quality quality = randomQuality();

        return new Armour(type, quality, base);
	}
	private static Quality randomQuality() {
        int rand = ThreadLocalRandom.current().nextInt(100); // 0-99

        if (rand < 50) return Quality.POOR;    // 50% chance
        else if (rand < 85) return Quality.GOOD; // 35% chance
        else return Quality.PERFECT;           // 15% chance
}
}

