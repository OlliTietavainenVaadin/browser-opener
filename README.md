# Browser Opener

Vaadin 10+ replacement for `BrowserWindowOpener` from Vaadin 8. Wrap your 
Component with this helper and clicking the wrapped component will open
a new browser window with the specified address.

## Usage example

```
    BrowserOpener bo = new BrowserOpener();
    bo.setContent(new Button("click this button to open"));
    bo.setUrl("https://www.vaadin.com");
    add(bo);
```

## Development instructions

Starting the test/demo server:
```
mvn jetty:run
```

This deploys demo at http://localhost:8080

## Version info

0.1 : basic functionality, allows specifying URL to open. Target is always 
`_blank`.