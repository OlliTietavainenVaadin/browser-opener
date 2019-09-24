import '@polymer/polymer/polymer-legacy.js';
import { html } from '@polymer/polymer/lib/utils/html-tag.js';
import { PolymerElement } from '@polymer/polymer/polymer-element.js';
class BrowserOpener extends PolymerElement {
  static get template() {
    return html`
   <a id="content" on-click="navigate" href\$="[[url]]"></a> 
`;
  }

  static get is() {
      return 'browser-opener';
  }

  static get properties() {
      return {
          url: String,
          windowName: String
      };
  }
  navigate(event) {
      event.preventDefault();
      window.open(this.url, this.windowName);
  }
}
customElements.define(BrowserOpener.is, BrowserOpener);

