package dev.codedred.denytravel.enums;

import java.util.Arrays;

public enum Travelers {

	ALL_ANIMALS(true),
	ALL_ENTITIES(false),
	ALL_MONSTERS(true),
	ARMOR_STAND(false),
	ARROW(false),
	BAT(false),
	BEE(false),
	BLAZE(false),
	BOAT(false),
	CAT(false),
	CAVE_SPIDER(false),
	CHICKEN(false),
	CHICKEN_JOCKEY(false),
	COD(false),
	COW(false),
	CREEPER(false),
	DOLPHIN(false),
	DONKEY(false),
	DRAGON_FIREBALL(false),
	DROPPED_ITEM(false),
	DROWNED(false),
	EGG(false),
	ELDER_GUARDIAN(false),
	ENDER_DRAGON(false),
	ENDER_PEARL(false),
	ENDERMAN(false),
	ENDERMITE(false),
	EVOKER(false),
	EXPERIENCE_ORB(false),
	FALLING_BLOCK(false),
	FIREBALL(false),
	FIREWORK(false),
	FISHING_HOOK(false),
	FOX(false),
	GHAST(false),
	GIANT(false),
	GUARDIAN(false),
	HOGLINS(false),
	HORSE(false),
	HUSK(false),
	ITEM_FRAME(false),
	KILLER_RABBIT(false),
	LEASH_HITCH(false),
	LLAMA(false),
	LLAMA_SPIT(false),
	MAGMA_CUBE(false),
	MINECART(false),
	MINECART_CHEST(false),
	MINECART_COMMAND(false),
	MINECART_FURNACE(false),
	MINECART_HOPPER(false),
	MINECART_MOB_SPAWNER(false),
	MINECART_TNT(false),
	MOOSHROOM(false),
	MULE(false),
	OCELOT(false),
	PANDA(false),
	PARROT(false),
	PHANTOM(false),
	PIG(false),
	PIGLINS(false),
	PILLAGER(false),
	POLAR_BEAR(false),
	PRIMED_TNT(false),
	PUFFERFISH(false),
	RABBIT(false),
	RAVAGER(false),
	SALMON(false),
	SHEEP(false),
	SHULKER(false),
	SHULKER_BULLET(false),
	SILVERFISH(false),
	SKELETON(false),
	SKELETON_HORSE(false),
	SLIME(false),
	SMALL_FIREBALL(false),
	SNOWBALL(false),
	SNOWMAN(false),
	SPECTRAL_ARROW(false),
	SPIDER(false),
	SPLASH_POTION(false),
	SQUID(false),
	STRAY(false),
	STRIDER(false),
	THROWN_EXP_BOTTLE(false),
	TRADER_LLAMA(false),
	TROPICAL_FISH(false),
	TURTLE(false),
	UNKNOWN(false),
	VEX(false),
	VILLAGER(false),
	VINDICATOR(false),
	WANDERING_TRADER(false),
	WITCH(false),
	WITHER(false),
	WITHER_SKELETON(false),
	WITHER_SKULL(false),
	WOLF(false),
	ZOGLINS(false),
	ZOMBIE(false),
	ZOMBIE_HORSE(false),
	ZOMBIE_PIGMAN(false),
	ZOMBIE_VILLAGER(false),
	ZOMBIFIED_PIGLIN(false);
	
	public static final Travelers[] VALUES = Travelers.values();
	private boolean permission;
	
	Travelers(boolean permission) {
		this.setPermission(permission);
	}

	public boolean isDenied() {
		return permission;
	}

	public void setPermission(boolean permission) {
		this.permission = permission;
	}
	
	public static boolean isValid(String value) {
         return Arrays.stream(Travelers.class.getEnumConstants()).anyMatch((e) -> value.equals(
                 e.toString()));
    }
	
}
