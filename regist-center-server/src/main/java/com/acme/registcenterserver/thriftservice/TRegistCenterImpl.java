package com.acme.registcenterserver.thriftservice;

import com.acme.rc.Dto.ServerInfoParam;
import com.acme.rc.Exception.RegistCenterException;
import com.acme.rc.service.TRegistCenter;
import com.acme.registcenterserver.service.IRegistCenter;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author acme
 * @date 2019/11/25 9:53 AM
 */
@Service
public class TRegistCenterImpl implements TRegistCenter.Iface{

    @Autowired
    private IRegistCenter registCenter;

    @Override
    public boolean regist(ServerInfoParam serverInfo) throws RegistCenterException, TException {
        return registCenter.regist(serverInfo);
    }

    @Override
    public boolean isRegist(String appKey) throws RegistCenterException, TException {
        return registCenter.isRegist(appKey);
    }
}
