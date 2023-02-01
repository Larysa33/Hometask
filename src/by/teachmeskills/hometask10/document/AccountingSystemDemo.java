package by.teachmeskills.hometask10.document;

import java.util.Arrays;
import java.util.Date;

public class AccountingSystemDemo {
    public static void main(String[] args) throws WrongDocumentFormatException {
        Date date = new Date();
        Document[] documents = {
                new SupplyContract(date, "555abc1a2b", "type1", 100),
                new EmploymentContract(date, "456", date, "Employee name"),
                new Invoice(date, "555abc", 120, "1")};
        Register document = new Document();
        try {
            document.saveDocument(documents);
        } catch (WrongDocumentFormatException e) {
            System.out.println(e);
        }
        document.getDocumentInformation(documents[0]); //как вывести массив целиком?
    }
}
