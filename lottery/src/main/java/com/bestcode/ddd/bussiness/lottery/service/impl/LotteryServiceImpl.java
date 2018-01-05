package com.bestcode.ddd.bussiness.lottery.service.impl;

import com.bestcode.ddd.bussiness.lottery.domain.aggregate.DrawLottery;
import com.bestcode.ddd.bussiness.lottery.facade.UserCityInfoFacade;
import com.bestcode.ddd.bussiness.lottery.repo.repository.DrawLotteryRepository;
import com.bestcode.ddd.bussiness.lottery.service.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 抽奖服务
 *
 * @author xch
 * @version 1.00
 * @date 2018-01-05
 */
@Service
public class LotteryServiceImpl implements LotteryService{

    @Autowired
    private DrawLotteryRepository drawLotteryRepository;

    @Autowired
    private UserCityInfoFacade userCityInfoFacade;

}
