package com.acme.registcenterserver.storage;

import com.acme.rc.Exception.RegistCenterException;
import com.acme.registcenterserver.storage.domain.ServerDomain;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * @author acme
 * @date 2019/11/25 10:16 AM
 */
@Repository
public class MemoryStorageImpl implements IStorage{
    //存放服务注册信息，主键是appKey
    private final Map<String, ServerDomain> serverMap = new ConcurrentHashMap<>();

    @Override
    public void saveServer(ServerDomain domain) throws RegistCenterException {
        if(serverMap.containsKey(domain.getAppKey())){
            return;
        }
        serverMap.put(domain.getAppKey(), domain);
    }

    @Override
    public ServerDomain getServer(String appKey) {
        return serverMap.getOrDefault(appKey, null);
    }

    @Override
    public void deleteServer(String appKey) {
        serverMap.remove(appKey);
    }

    @Override
    public void updateServer(ServerDomain domain) {
        if (serverMap.containsKey(domain.getAppKey())) {
            serverMap.put(domain.getAppKey(), domain);
        }
    }
}
