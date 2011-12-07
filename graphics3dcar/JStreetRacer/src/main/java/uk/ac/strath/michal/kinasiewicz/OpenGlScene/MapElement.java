package uk.ac.strath.michal.kinasiewicz.OpenGlScene;

import org.lwjgl.util.vector.Vector3f;

/**
 * The each object on map is stored in two parts graphical model 'phisical part'
 * and logical Duo to several logical models can share this same graphical
 * model.
 * 
 * @author mikiones
 * 
 */
public class MapElement {
	/**
	 * Cordinates where the element is on map
	 */
	private Vector3f cors;
	private Vector3f angels;
}
