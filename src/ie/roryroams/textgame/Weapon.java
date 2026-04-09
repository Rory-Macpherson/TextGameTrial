package ie.roryroams.textgame;

import java.util.concurrent.ThreadLocalRandom;

public record Weapon(String weaponType, Quality quality, int baseDamage) {

	public int damage() {
		return (int)(baseDamage * quality.getModifier()); // this is gotten from the Quality Instance that was made by the weapon
	}
	
	public static Weapon randomWeapon() {
        String[] types = {"Long Sword", "Short Sword", "Dagger"};
        int[] baseDamages = {40, 25, 15};

        int index = ThreadLocalRandom.current().nextInt(100);
        int base = 0;
        String type = null;
        if (index < 50) {
        	type = types[2]; 
        	base = baseDamages[2];
        }
        else if (index < 85) {
        	type = types[1]; 
        	base = baseDamages[1];
        }
        else {
        	type = types[0]; 
        	base = baseDamages[0];
        }
        

        Quality quality = randomQuality();

        return new Weapon(type, quality, base);
        
	}
        
        private static Quality randomQuality() {
            int rand = ThreadLocalRandom.current().nextInt(100); // 0-99

            if (rand < 50) return Quality.POOR;    // 50% chance
            else if (rand < 85) return Quality.GOOD; // 35% chance
            else return Quality.PERFECT;           // 15% chance
	}
}
