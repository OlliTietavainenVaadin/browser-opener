import { html, LitElement, css } from "lit";
import "@polymer/polymer/polymer-legacy.js";

class BrowserOpener extends LitElement {
  render() {
    return html`
      <a id="content" @click="${this.navigate}" href="${this.url}"></a>
    `;
  }

  static get is() {
    return "browser-opener";
  }

  static get properties() {
    return {
      url: String,
      windowName: String,
    };
  }
  navigate(event) {
    event.preventDefault();
    window.open(this.url, this.windowName);
  }
}
customElements.define(BrowserOpener.is, BrowserOpener);
