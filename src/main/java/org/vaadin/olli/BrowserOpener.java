package org.vaadin.olli;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * Wrapper component that makes other components links that open browser windows.
 */
@Tag("browser-opener")
@JsModule("./browser-opener.js")
public class BrowserOpener extends PolymerTemplate<BrowserOpener.BrowserOpenerModel> {

    @Id
    Anchor content;

    public BrowserOpener() {
        getModel().setWindowName("_blank");
    }

    /**
     * Set the address to open.
     *
     * @param url URL address BrowserOpener should navigate to
     */
    public void setUrl(String url) {
        getModel().setUrl(url);
    }

    /**
     * Name of the window to open. Defaults to @code{_blank}, which opens a new tab.
     *
     * @param windowName name of the window
     */
    public void setWindowName(String windowName) {
        getModel().setWindowName(windowName);
    }

    /**
     * Set the component to wrap. Clicking this component will navigate to the url specified in `setUrl`
     *
     * @param component The component to wrap.
     */
    public void setContent(Component component) {
        this.content.removeAll();
        this.content.add(component);
    }

    public interface BrowserOpenerModel extends TemplateModel {
        String getUrl();

        void setUrl(String url);

        String getWindowName();

        void setWindowName(String windowName);
    }
}
