package com.infraleap.vaadin;

import com.vaadin.ui.renderers.AbstractRenderer;
import elemental.json.Json;
import elemental.json.JsonValue;

public class WolfgangRenderer extends AbstractRenderer<Object /* Can be attached to any Grid<Object> */, Object /* Can render any Object as we use its toString() */ > {
	/**
	 * Creates a new renderer that uses <code>""</code> to represent null
	 * values.
	 */
	public WolfgangRenderer() {
		super(Object.class, "");
	}

	// below: the Renderer part
	@Override
	public JsonValue encode(Object value) {
		if (value == null) {
			return super.encode(null);
		} else {
			return Json.create("Wolfgang- " + new StringBuilder(value.toString()).reverse());
		}
	}

}
