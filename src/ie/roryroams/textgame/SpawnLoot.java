package ie.roryroams.textgame;
//import java.util.List;
//import java.util.concurrent.ThreadLocalRandom;
public class SpawnLoot {

	
		//public static final List<String> LOOT_TYPE = List.of("Weapon", "Armour", "Health Potion");
	
		
		

		public static String generateLoot() {
	       // int type = ThreadLocalRandom.current().nextInt(3);
	        
	       // switch (type) {
			//case 0:
				Weapon w = Weapon.randomWeapon();
				
				  return "Weapon: " + w.quality() + " " + w.weaponType() + " (Damage: " + w.damage() + ")";
			
		//	case 1:
			//	Armour a = Armour.randomArmour();
			//	  return "Armour: " + a.quality() + " " + a.armourType() + " (protection: " + a.protection() + ")";
			
			//case 2:
			//	HealthPotion p = HealthPotion.randomPotion();
				
			//	return "Health Potion: " + p.getDescription();
				
			//	default:
		//		return null;
			//}
	    }



			
		
}
