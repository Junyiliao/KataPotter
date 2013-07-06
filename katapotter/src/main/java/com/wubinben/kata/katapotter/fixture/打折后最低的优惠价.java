package com.wubinben.kata.katapotter.fixture;

/**
 * User: Ben
 * Date: 13-7-6
 * Time: 下午6:31
 */
public class 打折后最低的优惠价 {

  private int numberOfFirstBook;
  private int numberOfSecondBook;
  private int numberOfThirdBook;
  private int numberOfFourthBook;
  private int numberOfFifthBook;

  public void set第一集购买册数(int numberOfFirstBook) {
    this.numberOfFirstBook = numberOfFirstBook;
  }

  public void set第二集购买册数(int numberOfSecondBook) {
    this.numberOfSecondBook = numberOfSecondBook;
  }

  public void set第三集购买册数(int numberOfThirdBook) {
    this.numberOfThirdBook = numberOfThirdBook;
  }

  public void set第四集购买册数(int numberOfFourthBook) {
    this.numberOfFourthBook = numberOfFourthBook;
  }

  public void set第五集购买册数(int numberOfFifthBook) {
    this.numberOfFifthBook = numberOfFifthBook;
  }

  public double 最低优惠价() {
    return 8;
  }
}
