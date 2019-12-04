package com.acme.registcenterserver.service;

import com.acme.rc.Dto.ServerInfoParam;
import com.acme.rc.Exception.RegistCenterException;
import com.acme.registcenterserver.storage.MemoryStorageImpl;
import com.acme.registcenterserver.storage.domain.ServerDomain;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author acme
 * @date 2019/11/25 10:13 AM
 */
@Slf4j
@Service
public class RegistCenterImpl implements IRegistCenter {

    @Autowired
    private MemoryStorageImpl memoryStorage;

    @Override
    public boolean regist(ServerInfoParam serverInfo) throws RegistCenterException {
        log.info("regist, serverInfo:{}", serverInfo);
        memoryStorage.saveServer(buildServerDomain(serverInfo));
        return true;
    }

    @Override
    public boolean isRegist(String appKey) throws RegistCenterException {
        return memoryStorage.getServer(appKey) != null;
    }

    private ServerDomain buildServerDomain(ServerInfoParam serverInfo){
        ServerDomain domain = new ServerDomain();
        domain.setAppKey(serverInfo.getAppKey());
        domain.setAppName(serverInfo.getAppName());
        domain.setCreateTime(System.currentTimeMillis());
        domain.setUpdateTime(System.currentTimeMillis());
        return domain;
    }
}
