package dev.codedred.denytravel.data;

public class Debugger {

	public void execute() {
		DataManager data = DataManager.getInstance();
		
		if (!data.getConfig().contains("entity-travel")) {
			data.getConfig().set("entity-travel.allow-entity.ALL_ANIMALS", true);
			data.getConfig().set("entity-travel.allow-entity.ALL_ENTITIES", false);
			data.getConfig().set("entity-travel.allow-entity.ALL_MONSTERS", true);
			data.getConfig().set("entity-travel.allow-entity.ARMOR_STAND", false);
			data.getConfig().set("entity-travel.allow-entity.ARROW", false);
			data.getConfig().set("entity-travel.allow-entity.BAT", false);
			data.getConfig().set("entity-travel.allow-entity.BEE", false);
			data.getConfig().set("entity-travel.allow-entity.BLAZE", false);
			data.getConfig().set("entity-travel.allow-entity.BOAT", false);
			data.getConfig().set("entity-travel.allow-entity.CAT", false);
			data.getConfig().set("entity-travel.allow-entity.CAVE_SPIDER", false);
			data.getConfig().set("entity-travel.allow-entity.CHICKEN", false);
			data.getConfig().set("entity-travel.allow-entity.CHICKEN_JOCKEY", false);
			data.getConfig().set("entity-travel.allow-entity.COD", false);
			data.getConfig().set("entity-travel.allow-entity.COW", false);
			data.getConfig().set("entity-travel.allow-entity.CREEPER", false);
			data.getConfig().set("entity-travel.allow-entity.DOLPHIN", false);
			data.getConfig().set("entity-travel.allow-entity.DONKEY", false);
			data.getConfig().set("entity-travel.allow-entity.DRAGON_FIREBALL", false);
			data.getConfig().set("entity-travel.allow-entity.DROPPED_ITEM", false);
			data.getConfig().set("entity-travel.allow-entity.DROWNED", false);
			data.getConfig().set("entity-travel.allow-entity.EGG", false);
			data.getConfig().set("entity-travel.allow-entity.ELDER_GUARDIAN", false);
			data.getConfig().set("entity-travel.allow-entity.ENDER_DRAGON", false);
			data.getConfig().set("entity-travel.allow-entity.ENDER_PEARL", false);
			data.getConfig().set("entity-travel.allow-entity.ENDERMAN", false);
			data.getConfig().set("entity-travel.allow-entity.ENDERMITE", false);
			data.getConfig().set("entity-travel.allow-entity.EVOKER", false);
			data.getConfig().set("entity-travel.allow-entity.EXPERIENCE_ORB", false);
			data.getConfig().set("entity-travel.allow-entity.FALLING_BLOCK", false);
			data.getConfig().set("entity-travel.allow-entity.FIREBALL", false);
			data.getConfig().set("entity-travel.allow-entity.FIREWORK", false);
			data.getConfig().set("entity-travel.allow-entity.FISHING_HOOK", false);
			data.getConfig().set("entity-travel.allow-entity.FOX", false);
			data.getConfig().set("entity-travel.allow-entity.GHAST", false);
			data.getConfig().set("entity-travel.allow-entity.GIANT", false);
			data.getConfig().set("entity-travel.allow-entity.GUARDIAN", false);
			data.getConfig().set("entity-travel.allow-entity.HOGLINS", false);
			data.getConfig().set("entity-travel.allow-entity.HORSE", false);
			data.getConfig().set("entity-travel.allow-entity.HUSK", false);
			data.getConfig().set("entity-travel.allow-entity.ITEM_FRAME", false);
			data.getConfig().set("entity-travel.allow-entity.KILLER_RABBIT", false);
			data.getConfig().set("entity-travel.allow-entity.LEASH_HITCH", false);
			data.getConfig().set("entity-travel.allow-entity.LLAMA", false);
			data.getConfig().set("entity-travel.allow-entity.LLAMA_SPIT", false);
			data.getConfig().set("entity-travel.allow-entity.MAGMA_CUBE", false);
			data.getConfig().set("entity-travel.allow-entity.MINECART", false);
			data.getConfig().set("entity-travel.allow-entity.MINECART_CHEST", false);
			data.getConfig().set("entity-travel.allow-entity.MINECART_COMMAND", false);
			data.getConfig().set("entity-travel.allow-entity.MINECART_FURNACE", false);
			data.getConfig().set("entity-travel.allow-entity.MINECART_HOPPER", false);
			data.getConfig().set("entity-travel.allow-entity.MINECART_MOB_SPAWNER", false);
			data.getConfig().set("entity-travel.allow-entity.MINECART_TNT", false);
			data.getConfig().set("entity-travel.allow-entity.MOOSHROOM", false);
			data.getConfig().set("entity-travel.allow-entity.MULE", false);
			data.getConfig().set("entity-travel.allow-entity.OCELOT", false);
			data.getConfig().set("entity-travel.allow-entity.PANDA", false);
			data.getConfig().set("entity-travel.allow-entity.PARROT", false);
			data.getConfig().set("entity-travel.allow-entity.PHANTOM", false);
			data.getConfig().set("entity-travel.allow-entity.PIG", false);
			data.getConfig().set("entity-travel.allow-entity.PIGLINS", false);
			data.getConfig().set("entity-travel.allow-entity.PILLAGER", false);
			data.getConfig().set("entity-travel.allow-entity.POLAR_BEAR", false);
			data.getConfig().set("entity-travel.allow-entity.PRIMED_TNT", false);
			data.getConfig().set("entity-travel.allow-entity.PUFFERFISH", false);
			data.getConfig().set("entity-travel.allow-entity.RABBIT", false);
			data.getConfig().set("entity-travel.allow-entity.RAVAGER", false);
			data.getConfig().set("entity-travel.allow-entity.SALMON", false);
			data.getConfig().set("entity-travel.allow-entity.SHEEP", false);
			data.getConfig().set("entity-travel.allow-entity.SHULKER", false);
			data.getConfig().set("entity-travel.allow-entity.SHULKER_BULLET", false);
			data.getConfig().set("entity-travel.allow-entity.SILVERFISH", false);
			data.getConfig().set("entity-travel.allow-entity.SKELETON", false);
			data.getConfig().set("entity-travel.allow-entity.SKELETON_HORSE", false);
			data.getConfig().set("entity-travel.allow-entity.SLIME", false);
			data.getConfig().set("entity-travel.allow-entity.SMALL_FIREBALL", false);
			data.getConfig().set("entity-travel.allow-entity.SNOWBALL", false);
			data.getConfig().set("entity-travel.allow-entity.SNOWMAN", false);
			data.getConfig().set("entity-travel.allow-entity.SPECTRAL_ARROW", false);
			data.getConfig().set("entity-travel.allow-entity.SPIDER", false);
			data.getConfig().set("entity-travel.allow-entity.SPLASH_POTION", false);
			data.getConfig().set("entity-travel.allow-entity.SQUID", false);
			data.getConfig().set("entity-travel.allow-entity.STRAY", false);
			data.getConfig().set("entity-travel.allow-entity.STRIDER", false);
			data.getConfig().set("entity-travel.allow-entity.THROWN_EXP_BOTTLE", false);
			data.getConfig().set("entity-travel.allow-entity.TRADER_LLAMA", false);
			data.getConfig().set("entity-travel.allow-entity.TROPICAL_FISH", false);
			data.getConfig().set("entity-travel.allow-entity.TURTLE", false);
			data.getConfig().set("entity-travel.allow-entity.UNKNOWN", false);
			data.getConfig().set("entity-travel.allow-entity.VEX", false);
			data.getConfig().set("entity-travel.allow-entity.VILLAGER", false);
			data.getConfig().set("entity-travel.allow-entity.VINDICATOR", false);
			data.getConfig().set("entity-travel.allow-entity.WANDERING_TRADER", false);
			data.getConfig().set("entity-travel.allow-entity.WITCH", false);
			data.getConfig().set("entity-travel.allow-entity.WITHER", false);
			data.getConfig().set("entity-travel.allow-entity.WITHER_SKELETON", false);
			data.getConfig().set("entity-travel.allow-entity.WITHER_SKULL", false);
			data.getConfig().set("entity-travel.allow-entity.WOLF", false);
			data.getConfig().set("entity-travel.allow-entity.ZOGLINS", false);
			data.getConfig().set("entity-travel.allow-entity.ZOMBIE", false);
			data.getConfig().set("entity-travel.allow-entity.ZOMBIE_HORSE", false);
			data.getConfig().set("entity-travel.allow-entity.ZOMBIE_PIGMAN", false);
			data.getConfig().set("entity-travel.allow-entity.ZOMBIE_VILLAGER", false);
			data.getConfig().set("entity-travel.allow-entity.ZOMBIFIED_PIGLIN", false);
			data.save();
		}
		
		if (!data.getConfig().contains("messages")) {
			data.getConfig().set("messages.no-permission", "&cYou do not have permission to run this command!");
			data.save();
		}
		executeUpdateChanges();
	}
	
	private void executeUpdateChanges() {
		DataManager data = DataManager.getInstance();
		if (data.getConfig().contains("portal-travel")) {
			data.getConfig().set("portal-travel", null);
			data.save();
		}
	}
}