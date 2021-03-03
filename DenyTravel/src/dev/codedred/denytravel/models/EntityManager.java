package dev.codedred.denytravel.models;

public class EntityManager {

	private static EntityManager instance = null;
	
	public static EntityManager getInstance() {
		if (instance == null)
			instance = new EntityManager();
		return instance;
	}
}
