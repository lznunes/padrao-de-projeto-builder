package org.nunes.padraodeprojetobuilder;

import org.nunes.padraodeprojetobuilder.Builder.ASCIIConverter;
import org.nunes.padraodeprojetobuilder.Director.RTFReader;
import org.nunes.padraodeprojetobuilder.Product.ASCIIText;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PadraoDeProjetoBuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadraoDeProjetoBuilderApplication.class, args);
		ASCIIConverter asciiConverter = new ASCIIConverter();
		RTFReader rtfReader = new RTFReader(asciiConverter);
		rtfReader.parseRTF("Exemplo de texto em ASCII\nConversão de texto para diferentes formatos.");

		ASCIIText asciiText = new ASCIIText(asciiConverter.getASCIIText());
		asciiText.display();
	}

}
