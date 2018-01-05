package com.bestcode.ddd.bussiness.lottery.domain.valobj;

/**
 * 抽奖入参上下文
 * @author xch
 * @version 1.00
 * @date 2018-01-05
 */
public class DrawLotteryContext {

    private String mtCityInfo;
    private int gameScore;

    public int getGameScore() {
        return gameScore;
    }

    public void setGameScore(int gameScore) {
        this.gameScore = gameScore;
    }

    public String getMtCityInfo() {
        return mtCityInfo;
    }

    public void setMtCityInfo(String mtCityInfo) {
        this.mtCityInfo = mtCityInfo;
    }
}

