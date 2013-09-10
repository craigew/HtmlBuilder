package com.servlet.builder;

public class TwoColumnTable {
    StringBuilder stringBuilder = new StringBuilder();

    public TwoColumnTable() {
        stringBuilder.append("<dl>");
    }

    public TwoColumnTable row(String label, String text) {
        stringBuilder.append("<dt class=\"twocolumn\"><label>");
        stringBuilder.append(label);
        stringBuilder.append("</label></dt>");
        stringBuilder.append("<dd class=\"twocolumn\"><p>");
        stringBuilder.append(text);
        stringBuilder.append("</p></dd>");

        return this;
    }

    public String toString() {
        stringBuilder.append("</dl>");
        return stringBuilder.toString();
    }
}
