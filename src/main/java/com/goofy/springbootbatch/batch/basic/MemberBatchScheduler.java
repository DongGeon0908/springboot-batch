package com.goofy.springbootbatch.batch.basic;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class MemberBatchScheduler {
    private final MemberHourJob memberHourJob;

    /**
     * VPN Member 삽입을 매분 진행한다.
     **/
    @Scheduled(cron = "0 * * * * *")
    public void runMemberHourJob() {
        log.info("[Member Hour Job]");
        memberHourJob.run();
    }
}