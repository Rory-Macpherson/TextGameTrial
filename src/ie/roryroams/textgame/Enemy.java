package ie.roryroams.textgame;

import java.util.concurrent.ThreadLocalRandom;

public class Enemy extends Character {

	private int damageDealt = 0;
	private String attackType = null;
	
	
	public String typeSelector() {
		String [] attacks = {"Curse's", "Fireball's", "Etherial Attack's", "Spits and swear's"};
		String [] types = {"Witch", "Wizard", "Ghost", "Bandit"};
		   int index = ThreadLocalRandom.current().nextInt(4);
		   attackType = attacks[index];
		   if(index == 0) {
			   super.setName(types[index]);
			   super.setCurrentHealth(20);
			   damageDealt = 15;
		   }
		   else if(index == 1) {
			   super.setName(types[index]);
			   super.setCurrentHealth(25);
			   damageDealt = 12;
		   }
		   else if(index == 2) {
			   super.setName(types[index]);
			   super.setCurrentHealth(30);
			   damageDealt = 10;
		   }
		   else {
			   super.setName(types[index]);
			   super.setCurrentHealth(40);
			   damageDealt = 6;
		   }
		return types[index];
	}
	
	protected int getDamageDealt() {
		return damageDealt;
	}

	protected void setDamageDealt(int damageDealt) {
		this.damageDealt = damageDealt;
	}

	protected String getAttackType() {
		return attackType;
	}

	protected void setAttackType(String attackType) {
		this.attackType = attackType;
	}

	public Enemy() {
		super();
		
		// TODO Auto-generated constructor stub
	}

}
