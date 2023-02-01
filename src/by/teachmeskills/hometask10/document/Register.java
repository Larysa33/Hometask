package by.teachmeskills.hometask10.document;

public interface Register {
    /* Задание 1. Необходимо создать свои классы исключений на каждую ситуацию:
    -Проверить содержит ли номер документа последовательность abc.
    -Проверить начинается ли номер документа с последовательности 555.
    -Проверить заканчивается ли номер документа на последовательность 1a2b.
    Если номер документа не удовлетворяет условию - то "бросить"
исключение.
    В методе класса, в котором будут вызываться эти методы для
демонстрации работы, перехватить исключение конструкцией try-catch и
в блоке catch вывести сообщение для пользователя (сообщение на
консоль).
*/
    String DOCUMENT_STARTS_WITH = "555";
    String DOCUMENT_ENDS_WITH = "1a2b";
    String DOCUMENT_CONTAINS = "abc";
    String DOCUMENT_IS_NOT_SAVED = "Can't save Document №";

    default void saveDocument(Document[] documents) throws WrongDocumentFormatException {
        for (Document document : documents) {
            if (!document.getDocumentNumber().startsWith(DOCUMENT_STARTS_WITH)) {
                throw new WrongDocumentFormatException(DOCUMENT_IS_NOT_SAVED + document.getDocumentNumber()
                        + ". Document number should starts with 555 sequence");
            } else if (!document.getDocumentNumber().contains(DOCUMENT_CONTAINS)) {
                throw new WrongDocumentFormatException(DOCUMENT_IS_NOT_SAVED + document.getDocumentNumber()
                        + ". Document number should contains abc sequence");
            } else if (!document.getDocumentNumber().endsWith(DOCUMENT_ENDS_WITH)) {
                throw new WrongDocumentFormatException(DOCUMENT_IS_NOT_SAVED + document.getDocumentNumber()
                        + ". Document number should ends with 1a2b");
            } else {
                System.out.println(document);
            }
        }
    }

    void getDocumentInformation(Document document);
}
