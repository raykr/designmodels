package com.swroom.constructor.facade;

/**
 * 贷款类（外观类）
 * Created by jingz on 2017/2/1.
 */
public class Mortgage {

    private Bank bank;
    private Credit credit;
    private Loan loan;

    public Mortgage() {
        this.bank = new Bank();
        this.credit = new Credit();
        this.loan = new Loan();
    }

    /**
     * 面向外部调用的判断方法，封装各子系统的判断
     * @return
     */
    public boolean isEligible(Customer c, int amount) {

        boolean eligible = true;

        if (!bank.hasSufficentSavings(c, amount))
            eligible = false;
        else if (!credit.hasGoodCredit(c))
            eligible = false;
        else if (!loan.hasNoBadLoans(c))
            eligible = false;

        return eligible;
    }
}
