# 选型
- gRPC 使用Protobuf序列化方式比Json的方式序列化的时间和空间效率高
- gRPC 使用HTTP2.0 采用IO多路复用，流的处理方式，提高了处理的并发
- gRPC 跨语言特性，不和语言强绑定，是k8s的基石
# Versions
## 1.0 纯净grpc版本 pure-grpc-1.0
- 定义了TSDBProto消息，创建proto、server和client 3个模块
- 使用Any泛型处理消息类型，客户端可以发送任意List<Blob>数据给服务端
- 使用grpc-spring-boot-starter框架整合grpc和SpringBoot

https://stackoverflow.com/questions/32613667/protobuf-3-0-any-type-pack-unpack

## 1.1 通过拦截器实现日志记录和速率限制、JWT的身份验证
- basicAuth验证
- 拦截器 一元和流式 拦截打印log 没有复现onCompleted;

