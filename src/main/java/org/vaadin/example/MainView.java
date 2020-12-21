package org.vaadin.example;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
@Theme(value = Lumo.class)
@PWA(name = "Project Base for Vaadin", shortName = "Project Base", enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

    public MainView() {

        // addClassName("centered-content");

        add(header(), mainBody(), footer());

    }

    /**
     * 
     */
    private VerticalLayout header() {
        VerticalLayout div = new VerticalLayout();
        div.addClassName("header-content");

        H3 headerThree = new H3("Bottom Feeder Software Presents");
        headerThree.addClassName("centered-header-content");

        H1 headerOne = new H1("Point of Sale");
        headerOne.addClassName("centered-header-content");

        div.add(headerThree, headerOne);

        return div;
    }

    /**
     * 
     */
    private Div mainBody() {
        Div view = new Div();

        // Use TextField for standard text input
        TextField textField = new TextField("Your name");
        textField.addThemeName("bordered");

        // Button click listeners can be defined as lambda expressions
        GreetService greetService = new GreetService();
        Button button = new Button("Say hello", e -> Notification.show(greetService.greet(textField.getValue())));

        // Theme variants give you predefined extra styles for components.
        // Example: Primary button is more prominent look.
        button.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        // You can specify keyboard shortcuts for buttons.
        // Example: Pressing enter in this view clicks the Button.
        button.addClickShortcut(Key.ENTER);

        // Use custom CSS classes to apply styling. This is defined in
        // shared-styles.css.
        view.addClassName("centered-content");

        view.add(textField, button);

        return view;
    }

    /**
     * 
     * @return
     */
    private VerticalLayout footer() {
        VerticalLayout div = new VerticalLayout();
        div.addClassName("footer-content");
        H3 h3 = new H3("Footer");
        h3.addClassName("centered-header-content");
        div.add(h3);
        return div;
    }

}
