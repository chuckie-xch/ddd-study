package com.bestcode.ddd.bussiness.lottery.domain.valobj;

/**
 * 奖品
 *
 * @author xch
 * @version 1.00
 * @date 2018-01-05
 */
public class Award {

    private  int awardId;
    private  int probablity;
    private int awardProbablity;


    public int getAwardId() {
        return awardId;
    }

    public void setAwardId(int awardId) {
        this.awardId = awardId;
    }

    public int getProbablity() {
        return probablity;
    }

    public void setProbablity(int probablity) {
        this.probablity = probablity;
    }

    public int getAwardProbablity() {
        return awardProbablity;
    }

    public void setAwardProbablity(int awardProbablity) {
        this.awardProbablity = awardProbablity;
    }
}
