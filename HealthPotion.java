package a52112401;

/**
 * HealthPotions increase the consumer's mana
 */
public class HealthPotion extends Potion {
	/**
	 * Must not be negative
	 */
	private int health;

	/**
	 * @param name name
	 * @param usages number of usages still left
	 * @param price price
	 * @param weight weight
	 * @param health change of health on consumer
	 */
	public HealthPotion(String name, int usages, int price, int weight, int health) {
		super(name, usages, price, weight);
		if (health <0) {
			throw new IllegalArgumentException("Health must not be negative");
		}
		this.health = health;
	}
	
	/**
	 * returns "; +'health' HP".
	 * e.g. (total result of toString) "[Health Potion; 1 g; 1 Knut; 5 gulps; +10 HP]"
	 * @return "; +'health' HP"
	 */
	@Override
	public String additionalOutputString() {
		return String.format("; +%s HP", health);
	}

	/**
	 * If usages is greater than 0 reduce usages by 1 (tryUsage method) and
	 * increase HP of target by health (call method heal(health))
	 * @param target target on which to object is to be used on
	 */
	@Override  
	public void useOn(MagicEffectRealization target) {
		if (tryUsage()) {
			target.heal(health);
		}
	}
}