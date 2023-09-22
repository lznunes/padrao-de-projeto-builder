package org.nunes.padraodeprojetobuilder.Product;

class TextWidget {
    private String textWidget;

    public TextWidget(String textWidget) {
        this.textWidget = textWidget;
    }

    public void display() {
        System.out.println("Text Widget:");
        System.out.println(textWidget);
    }
}