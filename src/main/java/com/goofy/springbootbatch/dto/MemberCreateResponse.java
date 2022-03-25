package com.goofy.springbootbatch.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class MemberCreateResponse {
    private final List<MemberCreateDetail> response;

    @Builder
    @RequiredArgsConstructor
    public static class MemberCreateDetail {
        private final String name;
        private final String email;
        private final String introduce;
    }
}