package by.teachmeskills.hometask10.document;
import java.util.Date;
import java.util.Objects;

/*
Финансовая накладная. Содержит поля:
Итоговая сумма за месяц
Дата документа
Номер документа
Код департамента
*/
public class Invoice extends Document {
        private double totalMonthAmount;
        private String departmentCode;

        public Invoice(Date documentDate, String documentNumber, double totalMonthAmount, String departmentCode) {
            super(documentDate, documentNumber);
            this.totalMonthAmount = totalMonthAmount;
            this.departmentCode = departmentCode;
        }

        public Invoice() {
        }

        @Override
        public String toString() {
            return "FinancialInvoice{" +
                    "totalMonthAmount=" + totalMonthAmount +
                    ", departmentCode='" + departmentCode + "', " +
                    super.toString() +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Invoice)) return false;
            if (!super.equals(o)) return false;
            Invoice that = (Invoice) o;
            return Double.compare(that.totalMonthAmount, totalMonthAmount) == 0
                    && departmentCode.equals(that.departmentCode);
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), totalMonthAmount, departmentCode);
        }
}
