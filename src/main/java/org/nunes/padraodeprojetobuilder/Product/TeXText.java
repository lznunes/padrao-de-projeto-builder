package org.nunes.padraodeprojetobuilder.Product;

class TeXText {
    private String texText;

    public TeXText(String texText) {
        this.texText = texText;
    }

    public void display() {
        System.out.println("TeX Text:");
        System.out.println(texText);
    }
}