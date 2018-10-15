package com.infraleap.vaadin.client;

import com.google.gwt.dom.client.Element;
import com.vaadin.client.renderers.Renderer;
import com.vaadin.client.widget.grid.RendererCellReference;

public class WolfgangRenderer implements Renderer<String> {

	@Override
	public void render(RendererCellReference cell, String text) {
		// optimization suggested by Oskar Hýbl, Cleverbee solutions
		setTextContent(cell.getElement(), text);
	}

	private native void setTextContent(Element elem, String text)
		/*-{elem.textContent = text;}-*/;
}
