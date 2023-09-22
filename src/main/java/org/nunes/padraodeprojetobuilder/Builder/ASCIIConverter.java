package org.nunes.padraodeprojetobuilder.Builder;

public class ASCIIConverter implements TextConverter {
    private StringBuilder result = new StringBuilder();

    @Override
    public void convertCharacter(char character) {
        result.append((int) character);
    }

    @Override
    public void convertParagraph(String paragraph) {
        result.append(paragraph);
    }

    public String getASCIIText() {
        return result.toString();
    }
}