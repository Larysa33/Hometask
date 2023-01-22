package by.teachmeskills.hometask10.document;

import java.util.Date;
import java.util.Objects;

/*
Контракт на поставку товаров. Содержит поля:
    Номер документа
    Тип товаров
    Количество товаров
    Дата документа
 */
public class SupplyContract extends Document {

    private String goodsType;
    private int goodsAmount;

    public SupplyContract(Date documentDate, String documentNumber, String goodsType, int goodsAmount) {
        super(documentDate, documentNumber);
        this.goodsType = goodsType;
        this.goodsAmount = goodsAmount;
    }

    public SupplyContract() {
    }

    @Override
    public String toString() {
        return "SupplyGoodsContract{" +
                "goodsType='" + goodsType + '\'' +
                ", goodsAmount=" + goodsAmount + ", " +
                super.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SupplyContract)) return false;
        if (!super.equals(o)) return false;
        SupplyContract that = (SupplyContract) o;
        return goodsAmount == that.goodsAmount && goodsType.equals(that.goodsType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), goodsType, goodsAmount);
    }
}
