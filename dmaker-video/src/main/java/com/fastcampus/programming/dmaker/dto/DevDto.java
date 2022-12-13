package com.fastcampus.programming.dmaker.dto;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Slf4j
//@Data
public class DevDto {
    @NonNull
    String name;
    Integer age;
    LocalDateTime startAt;

    public void printLog() {
        log.info(getName());
    }
}
