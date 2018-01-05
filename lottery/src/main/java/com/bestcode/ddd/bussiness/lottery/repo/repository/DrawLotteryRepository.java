package com.bestcode.ddd.bussiness.lottery.repo.repository;

import com.bestcode.ddd.bussiness.lottery.domain.aggregate.DrawLottery;
import com.bestcode.ddd.bussiness.lottery.repo.cache.DrawLotteryCacheAccessObj;
import com.bestcode.ddd.bussiness.lottery.repo.dao.AwardDao;
import com.bestcode.ddd.bussiness.lottery.repo.dao.AwardPoolDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 资源库访问对象-抽奖资源库
 * 资源库对外的整体访问由Repository提供，它聚合了各个资源库的数据信息，同时也承担了资源存储的逻辑（例如缓存更新机制等）。
 * @author xch
 * @version 1.00
 * @date 2018-01-05
 */
@Repository
public class DrawLotteryRepository {

    @Autowired
    private AwardDao awardDao;
    @Autowired
    private AwardPoolDao awardPoolDao;
    @Autowired
    private DrawLotteryCacheAccessObj drawLotteryCacheAccessObj;

    public DrawLottery getDrawLotteryById(int lotteryId) {
        DrawLottery drawLottery = drawLotteryCacheAccessObj.get(lotteryId);
        if (drawLottery != null) {
            return drawLottery;
        }
        drawLottery = getDrawLotteyFromDB(lotteryId);
        drawLotteryCacheAccessObj.add(lotteryId, drawLottery);
        return drawLottery;
    }

    private DrawLottery getDrawLotteyFromDB(int lotteryId) {
        return drawLotteryCacheAccessObj.get(lotteryId);
    }


}
