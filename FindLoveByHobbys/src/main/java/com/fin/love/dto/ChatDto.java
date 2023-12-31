package com.fin.love.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatDto {
    // 메시지 타입 : 입장, 채팅
    public enum MessageType {
        //
        ENTER, TALK, OUT
    }

    private MessageType type;
    private String roomId;
    private String sender;
    private String message;
    private String time;
}
