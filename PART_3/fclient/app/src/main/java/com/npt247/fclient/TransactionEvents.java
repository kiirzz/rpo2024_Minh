package com.npt247.fclient;

public interface TransactionEvents {
    String enterPin(int ptc, String amount);
    void transactionResult(boolean result);

}
