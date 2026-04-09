package ie.roryroams.textgame;

public enum Quality {
	POOR 			("Poor condition that makes it less effective", 0.5),
	GOOD 			("In Good condition", 1),
	PERFECT 		("Perfect condition, this is highly effective", 1.5);
	
	private final String description;
	private final double modifier;
	
	private Quality(String description, double modifier) {
		this.description = description;
		this.modifier = modifier;
	}
	
	
	public String getDescription() {
		return description;
	}

	public double getModifier() {
		return modifier;
	}
}
