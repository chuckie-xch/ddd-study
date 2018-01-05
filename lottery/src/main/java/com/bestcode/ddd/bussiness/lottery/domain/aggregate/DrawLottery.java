package com.bestcode.ddd.bussiness.lottery.domain.aggregate;

import com.bestcode.ddd.bussiness.lottery.domain.valobj.AwardPool;
import com.bestcode.ddd.bussiness.lottery.domain.valobj.DrawLotteryContext;

import java.util.List;

/**
 * 抽奖聚合根
 *
 * @author xch
 * @version 1.00
 * @date 2018-01-05
 */
public class DrawLottery {

    private int lotteryId; // 抽奖Id
    private List<AwardPool> awardPools; // 奖池列表

    public int getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(int lotteryId) {
        if (lotteryId < 0) {
            throw new IllegalArgumentException("非法的抽奖id");
        }
        this.lotteryId = lotteryId;
    }

    public List<AwardPool> getAwardPools() {
        return awardPools;
    }

    public void setAwardPools(List<AwardPool> awardPools) {
        this.awardPools = awardPools;
    }

    /**
     * 根据抽奖入参context选择奖池
     * @param context
     * @return
     */
    public AwardPool chooseAwardPool(DrawLotteryContext context) {
        if (context.getMtCityInfo() != null) {
            return chooseAwardPoolByCityInfo(awardPools, context.getMtCityInfo());
        } else {
            return chooseAwardPoolByScore(awardPools, context.getGameScore());
        }
    }

    private AwardPool chooseAwardPoolByScore(List<AwardPool> awardPools, int gameScore) {
        return null;
    }

    private AwardPool chooseAwardPoolByCityInfo(List<AwardPool> awardPools, String mtCityInfo) {
        return null;
    }

}
