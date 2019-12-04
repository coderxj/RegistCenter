namespace java com.acme.rc.service

include 'Dto.thrift'
include 'Exception.thrift'

service TRegistCenter {
    //服务注册
    bool regist(1:Dto.ServerInfoParam serverInfo) throws (1:Exception.RegistCenterException ex);

    //判断一个服务是否已经注册
    bool isRegist(1:string appKey) throws (1:Exception.RegistCenterException ex);
}