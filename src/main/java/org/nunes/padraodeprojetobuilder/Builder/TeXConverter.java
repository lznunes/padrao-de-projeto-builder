package org.nunes.padraodeprojetobuilder.Builder;

class TeXConverter implements TextConverter {
    private StringBuilder result = new StringBuilder();

    @Override
    public void convertCharacter(char character) {
        result.append("\\char{" + (int) character + "}");
    }

    @Override
    public void convertParagraph(String paragraph) {
        result.append(paragraph);
    }

    public String getTeXText() {
        return result.toString();
    }
}
