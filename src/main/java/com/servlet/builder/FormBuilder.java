package com.servlet.builder;

import java.io.PrintWriter;

public class FormBuilder {

    private StringBuilder stringBuilder = new StringBuilder();

    public FormBuilder() {
        stringBuilder.append("<form>");
    }

    public FormBuilder title(String text) {
        div("title",text);
        return this;
    }

    public FormBuilder paragraph(String text) {
        div("paragraph",text);
        return this;
    }

    public FormBuilder twoColumnTable(TwoColumnTable twoColumnTable) {
        stringBuilder.append(twoColumnTable.toString());
        return this;
    }

    public void toString(PrintWriter printWriter) {
        endForm();
        printWriter.println(stringBuilder.toString());
    }

    public String toString() {
        endForm();
        return stringBuilder.toString();
    }

    private void endForm() {
        stringBuilder.append("</form>");
    }

    private void div(String style,String text){
        stringBuilder.append("<div class=\"").append(style).append("\">");
        stringBuilder.append(text);
        stringBuilder.append("</div>");
    }


}
