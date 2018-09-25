package org.vaadin.olli;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("browser-opener")
@HtmlImport("browser-opener.html")
public class BrowserOpener extends PolymerTemplate<BrowserOpener.BrowserOpenerModel> {

    @Id
    Anchor content;

    public void setUrl(String url) {
        getModel().setUrl(url);
    }

    public void setContent(Component component) {
        this.content.removeAll();
        this.content.add(component);
    }

    public interface BrowserOpenerModel extends TemplateModel {
        String getUrl();

        void setUrl(String url);
    }
}
