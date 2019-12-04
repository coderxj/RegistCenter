package com.acme.registcenterserver.service;

import com.acme.rc.Dto.ServerInfoParam;
import com.acme.rc.Exception.RegistCenterException;

/**
 * @author acme
 * @date 2019/11/25 10:12 AM
 */
public interface IRegistCenter {
    boolean regist(ServerInfoParam serverInfo) throws RegistCenterException;
    boolean isRegist(String appKey) throws RegistCenterException;
}
