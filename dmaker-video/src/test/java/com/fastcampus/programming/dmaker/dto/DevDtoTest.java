package com.fastcampus.programming.dmaker.dto;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DevDtoTest {
    @Test
    void test() {
        /*
        DevDto devDto = new DevDto();
        devDto.setName("simpson");
        devDto.setAge(21);
        devDto.setStartAt(LocalDateTime.now());
        */
        final DevDto devDto = DevDto.builder()
                .name("test").build();
        System.out.println(devDto);
        devDto.printLog();
    }
}