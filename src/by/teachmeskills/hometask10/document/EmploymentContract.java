package by.teachmeskills.hometask10.document;
import java.util.Date;
import java.util.Objects;

/*
Контракт с сотрудником. Содержит поля:
    Номер документа
    Дата документа
    Дата окончания контракта
    Имя сотрудника
 */
public class EmploymentContract extends Document {
        private Date endOfContractDate;
        private String employeeName;

        public EmploymentContract(Date documentDate, String documentNumber, Date endOfContractDate, String employeeName) {
            super(documentDate, documentNumber);
            this.endOfContractDate = endOfContractDate;
            this.employeeName = employeeName;
        }

        public EmploymentContract() {
        }

        @Override
        public String toString() {
            return "ContractWithEmployee{" +
                    "endOfContractDate=" + endOfContractDate +
                    ", employeeName='" + employeeName + "', " +
                    super.toString() +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof EmploymentContract)) return false;
            if (!super.equals(o)) return false;
            EmploymentContract that = (EmploymentContract) o;
            return endOfContractDate.equals(that.endOfContractDate) && employeeName.equals(that.employeeName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), endOfContractDate, employeeName);
        }
}
