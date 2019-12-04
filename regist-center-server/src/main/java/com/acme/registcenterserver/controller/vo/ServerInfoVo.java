package com.acme.registcenterserver.controller.vo;

import lombok.Data;

import java.util.List;

/**
 * @author acme
 * @date 2019/12/1 9:00 PM
 */
@Data
public class ServerInfoVo {
    String appKey;
    String appName;
    List<String> managers;
}
