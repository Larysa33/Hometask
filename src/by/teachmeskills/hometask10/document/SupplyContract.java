package by.teachmeskills.hometask10.document;

import java.util.Date;

/*
Контракт на поставку товаров. Содержит поля:
    Номер документа
    Тип товаров
    Количество товаров
    Дата документа
 */
public class SupplyContract extends document {
    private String goodsType;
    private int goodsCount;

    public SupplyContract() {
    }

    public SupplyContract(String numberOfDocument, Date dateOfDocument, String goodsType, int goodsCount) {
        super(numberOfDocument, dateOfDocument);
        this.goodsType = goodsType;
        this.goodsCount = goodsCount;
    }

    @Override
    public String getInfo() {
        return goodsType + " Supply Contract № " + super.numberOfDocument + " of "  + super.dateOfDocument + ". " +
                "Amount: " + goodsCount;
    }
}
