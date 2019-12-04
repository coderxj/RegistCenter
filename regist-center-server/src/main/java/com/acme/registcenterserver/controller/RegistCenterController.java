package com.acme.registcenterserver.controller;

import com.acme.rc.Dto.ServerInfoParam;
import com.acme.rc.Exception.RegistCenterException;
import com.acme.registcenterserver.controller.vo.ServerInfoVo;
import com.acme.registcenterserver.service.RegistCenterImpl;
import com.acme.registcenterserver.storage.domain.ServerDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author acme
 * @date 2019/12/1 8:36 PM
 */
@RestController
@RequestMapping("/regist")
public class RegistCenterController {

    @Autowired
    private RegistCenterImpl registCenter;

    @PostMapping
    public Object regist(@RequestBody ServerInfoVo serverInfoVo) throws RegistCenterException {
        registCenter.regist(buildServerDomain(serverInfoVo));
        return new HashMap<Object, Object>(){{put("status", "success");}};
    }

    private ServerInfoParam buildServerDomain(ServerInfoVo serverInfoVo){
        ServerInfoParam serverInfoParam = new ServerInfoParam();
        serverInfoParam.setAppKey(serverInfoVo.getAppKey());
        serverInfoParam.setAppName(serverInfoVo.getAppName());
        serverInfoParam.setManagers(serverInfoVo.getManagers());
        return serverInfoParam;
    }
}
