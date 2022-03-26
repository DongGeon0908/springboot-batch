package com.goofy.springbootbatch.batch.basic;

import com.goofy.springbootbatch.application.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberHourJob {
    private final MemberService memberService;
    private final static int MEMBER_CREATE_RANGE = 10;

    public void run() {
        memberService.saveFakeUser(MEMBER_CREATE_RANGE);
    }
}