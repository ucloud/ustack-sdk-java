# 快速开始

## 安装

Maven (`pom.xml`):

```xml
<dependency>
    <groupId>com.ucloudstack</groupId>
    <artifactId>ustack-sdk-java</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

## 初次使用

SDK 使用 PublicKey / PrivateKey 作为鉴权方式，密钥可从以下途径获取：

- [账号密钥管理](https://console.ucloudstack.com/uaccount/api_manage)

下面是一个查询云主机列表的示例：

```java
package com.ucloudstack.example;

import com.ucloudstack.client.Client;
import com.ucloudstack.common.config.Config;
import com.ucloudstack.common.credential.Credential;
import com.ucloudstack.common.exception.UCloudStackException;
import com.ucloudstack.apis.DescribeVMInstanceRequest;
import com.ucloudstack.apis.DescribeVMInstanceResponse;

public class Main {
    public static void main(String[] args) {
        Config config = new Config();
        config.setRegion("cn-bj2");

        Credential credential = new Credential(
            System.getenv("UCLOUD_PUBLIC_KEY"),
            System.getenv("UCLOUD_PRIVATE_KEY")
        );

        Client client = new Client(config, credential);

        DescribeVMInstanceRequest req = new DescribeVMInstanceRequest();
        req.setLimit(10);
        req.setOffset(0);

        try {
            DescribeVMInstanceResponse resp = client.describeVMInstance(req);
            System.out.println("RetCode: " + resp.getRetCode());
        } catch (UCloudStackException e) {
            e.printStackTrace();
        }
    }
}
```

将上述代码中 `Region`、`PublicKey`、`PrivateKey` 替换成自己的配置即可。

## 更多用法

- [通用配置](configure.md)，了解如何配置 SDK，如日志、重试、服务访问端点等
- [错误处理](error.md)，了解如何处理不同类型的 SDK 异常
- [请求中间件](middleware.md)，了解如何拦截请求并添加额外逻辑
- [泛化调用](generic.md)，如何调用 SDK 尚未支持的 API
- [API 接口文档](https://docs.ucloudstack.com/api/summary/README)
