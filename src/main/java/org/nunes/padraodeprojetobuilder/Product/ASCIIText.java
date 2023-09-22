package org.nunes.padraodeprojetobuilder.Product;

public class ASCIIText {
    private String asciiText;

    public ASCIIText(String asciiText) {
        this.asciiText = asciiText;
    }

    public void display() {
        System.out.println("ASCII Text:");
        System.out.println(asciiText);
    }
}