package com.acme.registcenterserver.storage;

import com.acme.rc.Exception.RegistCenterException;
import com.acme.registcenterserver.storage.domain.ServerDomain;

import java.util.List;

/**
 * @author acme
 * @date 2019/11/25 10:21 AM
 */
public interface IStorage {
    void saveServer(ServerDomain domain) throws RegistCenterException;
    ServerDomain getServer(String appKey);
    void deleteServer(String appKey);
    void updateServer(ServerDomain domain);
}
