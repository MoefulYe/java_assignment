package secondHomework.recordKeeping.main;

import secondHomework.recordKeeping.core.Account;
import secondHomework.recordKeeping.core.illegalInputException;

public class MainProcess {
    public static void main(String[] args) throws illegalInputException {
        Account account = new Account();
        account.init();
    }
}
