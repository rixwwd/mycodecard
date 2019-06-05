package com.example.fn;

public class Response {
  private String template;
  private String title;
  private String subtitle;
  private String bodytext;
  private String icon;
  private String backgroundColor;

  public Response() {
  }

  public Response(String template, String title, String subtitle, String bodtext, String icon, String backgroundColor) {
    this.template = template;
    this.title = title;
    this.subtitle = subtitle;
    this.bodytext = bodtext;
    this.icon = icon;
    this.backgroundColor = backgroundColor;

  }

  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public String getBodytext() {
    return bodytext;
  }

  public void setBodytext(String bodytext) {
    this.bodytext = bodytext;
  }

  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }
}
