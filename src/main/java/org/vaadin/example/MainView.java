package org.vaadin.example;

import java.util.List;

import com.google.inject.Inject;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

import org.vaadin.example.models.Product;
import org.vaadin.example.models.ProductLineDetail;
import org.vaadin.example.service.GreetService;
import org.vaadin.example.service.HelloWorldService;
import org.vaadin.example.service.persist.ProductLineService;
import org.vaadin.example.service.persist.ProductService;

/**
 * The main view contains a button and a click listener.
 */
@Route(value = "pos")
@Theme(value = Lumo.class)
@PWA(name = "Project Base for Vaadin", shortName = "Project Base", enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

    private static final String CENTERED_HEADER_CONTENT = "centered-header-content";
    private static final String CENTERED_CONTENT = "centered-content";

    private HelloWorldService helloWorldService;// hello service
    private GreetService greetService;
    private ProductLineService productLineService;
    private ProductService productService;

    @Inject
    public MainView(HelloWorldService service, GreetService greetService, ProductLineService productLineService,
            ProductService productService) {
        this.helloWorldService = service;
        this.greetService = greetService;
        this.productLineService = productLineService;
        this.productService = productService;

        add(header(), mainBody(), footer());

    }

    /**
     * 
     */
    private VerticalLayout header() {

        helloWorldService.sayHello();

        final VerticalLayout div = new VerticalLayout();
        div.addClassName("header-content");

        final H3 headerThree = new H3("Bottom Feeder Software Presents");
        headerThree.addClassName(CENTERED_HEADER_CONTENT);

        final H1 headerOne = new H1("Point of Sale");
        headerOne.addClassName(CENTERED_HEADER_CONTENT);

        div.add(headerThree, headerOne);

        return div;
    }

    /**
     * 
     * @return
     */
    private Div mainButtonBody() {
        final Div view = new Div();

        // Use TextField for standard text input
        final TextField textField = new TextField("Your name");
        textField.addThemeName("bordered");

        // Button click listeners can be defined as lambda expressions
        final Button button = new Button("Say hello", e -> Notification.show(greetService.greet(textField.getValue())));

        // Theme variants give you predefined extra styles for components.
        // Example: Primary button is more prominent look.
        button.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        // You can specify keyboard shortcuts for buttons.
        // Example: Pressing enter in this view clicks the Button.
        button.addClickShortcut(Key.ENTER);
        view.add(textField, button);

        // Use custom CSS classes to apply styling. This is defined in
        // shared-styles.css.
        view.addClassName(CENTERED_CONTENT);

        return view;
    }

    /**
     * 
     * @return
     */
    private Div productLineSection() {
        final Div view = new Div();
        view.addClassName(CENTERED_HEADER_CONTENT);

        final Div productLineDescription = new Div();

        Grid<Product> grid = new Grid<>(Product.class);
        grid.setColumns("productName", "productVendor", "productDescription", "productCode", "quantityInStock");

        final ComboBox<String> productLinesCB = new ComboBox<>();
        productLinesCB.setItems(productLineService.productLines());
        productLinesCB.setLabel("Product Lines");
        productLinesCB.addValueChangeListener(l -> {
            ProductLineDetail pld = productLineService.productLineDetail(l.getValue());
            productLineDescription.setText(pld.textDescription);
            List<Product> products = productService.findAllByProductLine(pld.getProductLine());
            grid.setItems(products);
            products.stream().forEach(p -> System.out.println(p.toString()));
            Notification.show(pld.toString());
        });

        view.add(productLinesCB, productLineDescription, grid);

        return view;
    }

    /**
     * 
     */
    private Div mainBody() {
        final Div view = new Div();
        view.add(mainButtonBody(), productLineSection());
        view.addClassName(CENTERED_HEADER_CONTENT);
        return view;
    }

    /**
     * 
     * @return
     */
    private VerticalLayout footer() {
        final VerticalLayout div = new VerticalLayout();
        div.addClassName("footer-content");
        final H3 h3 = new H3("Footer");
        h3.addClassName(CENTERED_HEADER_CONTENT);
        div.add(h3);
        return div;
    }

    private void hold() {
        // Use TextField for standard text input
        final TextField textField = new TextField("Your name");
        textField.addThemeName("bordered");

        // Button click listeners can be defined as lambda expressions
        final Button button = new Button("Say hello", e -> Notification.show(greetService.greet(textField.getValue())));

        // Theme variants give you predefined extra styles for components.
        // Example: Primary button is more prominent look.
        button.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        // You can specify keyboard shortcuts for buttons.
        // Example: Pressing enter in this view clicks the Button.
        button.addClickShortcut(Key.ENTER);
    }

}
