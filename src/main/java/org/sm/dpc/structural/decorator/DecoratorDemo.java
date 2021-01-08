package org.sm.dpc.structural.decorator;

public class DecoratorDemo {

    public static final String OUTPUT_FILE = "DecoratorOutput.txt";

    public static void main(String[] args) {
        String content = "Text for saving.";

        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource(OUTPUT_FILE)));

        encoded.writeData(content);

        DataSource plain = new FileDataSource(OUTPUT_FILE);

        System.out.printf("Content: [%s]%n", content);
        System.out.printf("Plain read: [%s]%n", plain.readData());
        System.out.printf("Encoded read: [%s]%n", encoded.readData());
    }

}
