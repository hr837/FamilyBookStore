package com.duang.book.service;

import io.micrometer.common.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.Map;

@Service
public class MyWebSocketHandler extends TextWebSocketHandler {

    final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        WebSocketMessage<String> msg = new TextMessage("Hello,you say:" + message);
        session.sendMessage(msg);
    }

    /**
     * 连接建立后执行
     */
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        // 通过session获取uri,然后解析查询参数
        UriComponents uriComponents = UriComponentsBuilder.fromUri(session.getUri()).build();
        Map<String, String> queryParams = uriComponents.getQueryParams().toSingleValueMap();
        String userId = queryParams.get("userId");
        String token = queryParams.get("token");
        if (StringUtils.isEmpty(userId) || StringUtils.isEmpty(token)) {
            session.close();
            return;
        }
        // TODO 验证token

        logger.info("Socket建立连接,Query参数：{},sessionId:{},", uriComponents.getQuery(), session.getId());
        WebSocketMessage<String> msg = new TextMessage("Welcome!");
        session.sendMessage(msg);
    }
}
