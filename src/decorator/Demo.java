package decorator;

import decorator.decorators.CompressionDecorator;
import decorator.decorators.DataSource;
import decorator.decorators.DataSourceDecorator;
import decorator.decorators.EncryptionDecorator;
import decorator.decorators.FileDataSource;

public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        String fileDataSource = "out/OutputDemo.txt";

        DataSourceDecorator encoded = new CompressionDecorator(
            new EncryptionDecorator(
                new FileDataSource(fileDataSource)));
        encoded.writeData(salaryRecords);

        DataSource plain = new FileDataSource(fileDataSource);

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
