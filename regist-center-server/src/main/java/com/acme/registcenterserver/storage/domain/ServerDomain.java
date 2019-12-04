package com.acme.registcenterserver.storage.domain;

import lombok.Data;

import java.util.List;

/**
 * @author acme
 * @date 2019/11/25 10:18 AM
 */
@Data
public class ServerDomain {
    String appKey;
    String appName;
    List<String> managers;
    Long createTime;
    Long updateTime;
}
