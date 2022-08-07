package com.banking.account.cmd.api.command;

public interface CommandHandler {
    void handle(OpenAcountCommand command);
    void handle(DepositFundsCommand command);
    void handle(WithdrawFundsCommand command);
    void handle(CloseAccountCommand command);
}
