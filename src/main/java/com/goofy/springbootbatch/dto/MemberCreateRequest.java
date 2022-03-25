package com.goofy.springbootbatch.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MemberCreateRequest {
    private final String name;
    private final String email;
    private final String introduce;
}