package com.goofy.springbootbatch.application;

import com.goofy.springbootbatch.dto.MemberCreateResponse;
import com.goofy.springbootbatch.entity.Member;
import com.goofy.springbootbatch.infrastructure.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public MemberCreateResponse saveFakeUser(int range) {
        log.info("[SAVE] saveFakeUser");
        return new MemberCreateResponse(
                memberRepository.saveAll(
                                IntStream.range(0, range)
                                        .mapToObj(i -> Member.builder()
                                                .name("배치봇 " + LocalDateTime.now() + "i")
                                                .email("이메일 " + LocalDateTime.now() + "i")
                                                .introduce("자기소개 " + LocalDateTime.now() + "i")
                                                .build()
                                        ).collect(Collectors.toList())
                        ).stream()
                        .map(member -> {
                            return MemberCreateResponse.MemberCreateDetail.builder().build();
                        })
                        .collect(Collectors.toList())
        );
    }
}