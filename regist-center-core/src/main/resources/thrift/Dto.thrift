namespace java com.acme.rc.Dto
include 'Enums.thrift'

/*
服务注册信息
* */
struct ServerInfoParam{
    //服务唯一标识
    1:string appKey;
    //服务名称，可选可重名
    2:string appName;
    //服务负责人
    3:list<string> managers;
}
