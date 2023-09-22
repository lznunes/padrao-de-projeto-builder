package org.nunes.padraodeprojetobuilder.Builder;
/**
A interface abstrata TextConverter  define métodos para converter
 caracteres e parágrafos para a criação de partes de um objeto de produto.
*/

public interface TextConverter {
    void convertCharacter(char character);
    void convertParagraph(String paragraph);
}