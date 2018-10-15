package com.infraleap.vaadin.client;

import com.vaadin.client.connectors.grid.AbstractGridRendererConnector;
import com.vaadin.shared.ui.Connect;

@Connect(com.infraleap.vaadin.WolfgangRenderer.class)
public class WolfgangRendererConnector
		extends AbstractGridRendererConnector<String> {

	@Override
	public WolfgangRenderer getRenderer() {
		return (WolfgangRenderer) super.getRenderer();
	}

	@Override
	public WolfgangRendererState getState() {
		return (WolfgangRendererState) super.getState();
	}
}
