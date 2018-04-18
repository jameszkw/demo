package com.zkw.concurrent.synchronizedemo.justest;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-05 下午 5:09
 **/

public class AccountOperator implements Runnable {
    private Account account;

    public AccountOperator(Account account) {
        this.account = account;
    }

    public void run() {
        synchronized (this){
            account.deposit(500);
            account.withdraw(500);
            System.out.println(Thread.currentThread().getName() + ":" + account.getBalance());
        }
    }

    static class Account{
        String name;
        float amount;
        public Account(String name, float amount) {
            this.name = name;
            this.amount = amount;
        }

        //存钱
        public  void deposit(float amt) {
            amount += amt;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //取钱
        public  void withdraw(float amt) {
            amount -= amt;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public float getBalance() {
            return amount;
        }
    }

    public static void main(String[] args) {
        Account account = new Account("zhang san", 10000.0f);
        AccountOperator accountOperator = new AccountOperator(account);
        final int THREAD_NUM = 5;
        Thread thread[] = new Thread[THREAD_NUM];
        for (int i = 0; i < THREAD_NUM; i ++) {
            thread[i] = new Thread(accountOperator,"Thread"+i);
            thread[i].start();
        }
    }

}
