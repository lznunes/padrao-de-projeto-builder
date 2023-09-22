package org.nunes.padraodeprojetobuilder.Builder;

class TextWidgetConverter implements TextConverter {
    private StringBuilder result = new StringBuilder();

    @Override
    public void convertCharacter(char character) {
        result.append("<Character>" + character + "</Character>");
    }

    @Override
    public void convertParagraph(String paragraph) {
        result.append("<Paragraph>" + paragraph + "</Paragraph>");
    }

    public String getTextWidget() {
        return result.toString();
    }
}
