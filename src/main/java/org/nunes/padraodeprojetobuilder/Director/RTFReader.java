package org.nunes.padraodeprojetobuilder.Director;

import org.nunes.padraodeprojetobuilder.Builder.TextConverter;

public class RTFReader {
    private TextConverter builder;

    public RTFReader(TextConverter builder) {
        this.builder = builder;
    }

    public void parseRTF(String rtfText) {
        // Suponhamos que estamos lendo o texto e convertendo para o formato escolhido
        for (char character : rtfText.toCharArray()) {
            if (Character.isAlphabetic(character)) {
                builder.convertCharacter(character);
            } else if (character == '\n') {
                builder.convertParagraph("\n");
            }
        }
    }
}