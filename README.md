# UCloudStack SDK Java

[![Build Status](https://github.com/ucloud/ustack-sdk-java/workflows/build/badge.svg)](https://github.com/ucloud/ustack-sdk-java/actions)
[![CodeCov](https://codecov.io/gh/ucloud/ustack-sdk-java/branch/main/graph/badge.svg)](https://codecov.io/gh/ucloud/ustack-sdk-java)
[![Apache 2 License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](LICENSE)

UCloudStack SDK Java 是 UCloudStack API 的 Java 客户端库。

- 网站: https://www.ucloudstack.com
- 许可证: Apache 2.0

## 安装

Maven (`pom.xml`):

```xml
<dependency>
    <groupId>com.ucloudstack</groupId>
    <artifactId>ustack-sdk-java</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

## 快速开始

```java
import com.ucloudstack.client.Client;
import com.ucloudstack.common.config.Config;
import com.ucloudstack.common.credential.Credential;
import com.ucloudstack.apis.DescribeVMInstanceRequest;
import com.ucloudstack.apis.DescribeVMInstanceResponse;

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

DescribeVMInstanceResponse resp = client.describeVMInstance(req);
System.out.println(resp.getRetCode());
```

## 文档

- [快速开始](docs/quickstart.md)
- [通用配置](docs/configure.md)
- [错误处理](docs/error.md)
- [请求中间件](docs/middleware.md)
- [泛化调用](docs/generic.md)
