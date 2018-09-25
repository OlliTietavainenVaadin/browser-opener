package org.vaadin.olli;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {
        BrowserOpener bo = new BrowserOpener();
        bo.setContent(new Button("click this button to open"));
        bo.setUrl("https://www.vaadin.com");
        add(bo);
    }
}
