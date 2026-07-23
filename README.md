# UCloudStack SDK Java

[![Java Version](https://img.shields.io/badge/Java-%3E%3D%208-blue.svg)](https://www.java.com/)
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](LICENSE)

UCloudStack SDK Java 是 UCloudStack API 的 Java 客户端库。

- 网站: https://www.ucloudstack.com
- 许可证: Apache 2.0

## 安装

使用 `maven` 安装（推荐），在 `pom.xml` 中增加依赖：

```xml
<dependency>
    <groupId>com.ucloudstack</groupId>
    <artifactId>ustack-sdk-java</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

## 使用

登陆控制台后获取公私钥，替换到代码中。

```java
import com.ucloudstack.client.Client;
import com.ucloudstack.common.config.Config;
import com.ucloudstack.common.credential.Credential;
import com.ucloudstack.apis.CreateVMInstanceRequest;
import com.ucloudstack.apis.CreateVMInstanceResponse;
import com.ucloudstack.models.CreateVMInstanceRequestDisks;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Config config = new Config();
        // 替换成平台上的目标地域
        config.setRegion("my_region");

        Credential credential = new Credential(
            // 替换成平台上获取的公/私钥
            "my_public_key",
            "my_private_key"
        );

        Client client = new Client(config, credential);

        CreateVMInstanceRequest req = new CreateVMInstanceRequest();
        req.setName("sdk-example-vm");
        req.setImageId("image-xxx"); // 替换成平台上可用的镜像ID
        req.setPassword("my_vm_password");
        req.setChargeType("Dynamic");
        req.setCPU(1);
        req.setMemory(1024);

        List<CreateVMInstanceRequestDisks> disks = new ArrayList<>();
        CreateVMInstanceRequestDisks disk = new CreateVMInstanceRequestDisks();
        disk.setSize(40);
        disk.setType("CLOUD_SSD");
        disk.setIsBoot("True");
        disks.add(disk);
        req.setDisks(disks);

        try {
            CreateVMInstanceResponse resp = client.createVMInstance(req);
            System.out.println("resource id of the vm: " + resp.getVMID());
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
```

## 更多文档

- [快速开始](docs/quickstart.md)
- [通用配置](docs/configure.md)
- [错误处理](docs/error.md)
- [请求中间件](docs/middleware.md)
- [泛化调用](docs/generic.md)
