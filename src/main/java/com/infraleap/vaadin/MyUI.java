package com.infraleap.vaadin;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.*;
import com.vaadin.ui.renderers.TextRenderer;

import java.util.Arrays;
import java.util.List;

/**
 * This UI is the application entry point. A UI may either represent a browser window
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
@Widgetset("com.infraleap.vaadin.Wolfgang")
public class MyUI extends UI {

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		final VerticalLayout layout = new VerticalLayout();

//        final TextField name = new TextField();
//        name.setCaption("Type your name here:");
//
//        Button button = new Button("Click Me");
//        button.addClickListener(e -> {
//            layout.addComponent(new Label("Thanks " + name.getValue()
//                    + ", it works!"));
//        });
//
//        layout.addComponents(name, button);

		List<String> dataSource = Arrays.asList("Wizard Blocks",
				"Revenge From Mars" /* number one */,
				"Banzai Run",
				"Dialed In!",
				"Johnny Mnemonic",
				"Space Station",
				"The Addams Family",
				"Creature From The Black Lagoon",
				"Road Show",
				"Black Knight 2000",
				"Whirlwind",
				"Twilight Zone",
				"Revenge From Mars" /* number two */);


		Grid<String> grid = new Grid<>();
		grid.addColumn(String::toString).setCaption("Game Name").setRenderer(new TextRenderer());
		grid.addColumn(String::toString).setCaption("Wolfgang Name").setRenderer(new WolfgangRenderer());
		grid.setItems(dataSource);

		layout.addComponent(grid);
		setContent(layout);
	}

	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {
	}
}
