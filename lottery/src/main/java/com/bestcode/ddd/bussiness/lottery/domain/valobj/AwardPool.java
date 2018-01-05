package com.bestcode.ddd.bussiness.lottery.domain.valobj;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 奖池
 *
 * @author xch
 * @version 1.00
 * @date 2018-01-05
 */
public class AwardPool {

    private String cityIds;   // 奖池支持的城市
    private String scores;  // 奖池支持的得分
    private int userGroupType;  // 奖池匹配的用户类型
    private List<Award> awards; // 奖池中包含的奖品

    // 当前奖池是否与城市匹配
    public boolean matchedCity(int city) {
        return true;
    }

    // 当前奖池是否与用户得分匹配
    public boolean matchedScore(int score) {
        return true;
    }

    // 根据概率选择奖池
    public Award randomGetAward() {
        int sumOfProbablity = 0;
        for (Award award: awards) {
            sumOfProbablity += award.getAwardProbablity();
        }
        int randomNumber = ThreadLocalRandom.current().nextInt(sumOfProbablity);
        int range = 0;
        for(Award award: awards) {
            range += award.getProbablity();
            if(randomNumber<range) {
                return award;
            }
        }
        return null;
    }




}
