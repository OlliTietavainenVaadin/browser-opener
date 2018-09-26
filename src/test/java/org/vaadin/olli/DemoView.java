package org.vaadin.olli;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {

        BrowserOpener bo = new BrowserOpener();
        bo.setContent(new Button("click this button to open a new window"));
        bo.setUrl("https://www.vaadin.com");

        BrowserOpener bo2 = new BrowserOpener();
        bo2.setContent(new Button("click this button open page in this window"));
        bo2.setUrl("https://www.google.com");
        bo2.setWindowName("_self");
        VerticalLayout vl = new VerticalLayout(bo, bo2);
        add(vl);

    }
}
