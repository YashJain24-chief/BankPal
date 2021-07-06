package com.android.bankpal.CustomClasses;

public class Transaction {
    private String fromUser;
    private String ToUser;
    private int amountTransferred;
    private int status;

    public Transaction(String fromUser, String toUser, int amountTransferred, int status) {
        this.fromUser = fromUser;
        ToUser = toUser;
        this.amountTransferred = amountTransferred;
        this.status = status;
    }

    public String getFromUser() {
        return fromUser;
    }

    public String getToUser() {
        return ToUser;
    }

    public int getAmountTransferred() {
        return amountTransferred;
    }

    public int getStatus() {
        return status;
    }

}
