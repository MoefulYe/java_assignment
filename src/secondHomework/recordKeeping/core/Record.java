package secondHomework.recordKeeping.core;

import java.util.Date;

class Record {
    private String recordType;
    private double curBalance;
    private double amountOfMoney;
    private String comment;
    private Date date;

    void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    String getRecordType() {
        return recordType;
    }

    void setCurBalance(double curBalance) {
        this.curBalance = curBalance;
    }

    double getCurBalance() {
        return curBalance;
    }

    void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    double getAmountOfMoney() {
        return amountOfMoney;
    }

    void setComment(String comment) {
        this.comment = comment;
    }

    String getComment() {
        return comment;
    }

    void setDate(Date date) {
        this.date = date;
    }

    Date getDate() {
        return date;
    }
}
