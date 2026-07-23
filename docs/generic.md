# 泛化调用

如何调用 SDK 尚未支持的 API ？可以使用泛化调用方式。

**NOTE** 如果没有必须使用的理由，不建议使用泛化方式调用 API，因为无法享受 OpenAPI 提供的兼容性保证。

## 调用方式

```java
package cn.openapi.example;

import cn.openapi.common.client.DefaultClient;
import cn.openapi.common.config.Config;
import cn.openapi.common.credential.Credential;
import cn.openapi.common.exception.OpenAPIException;
import cn.openapi.common.request.Request;
import cn.openapi.common.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Config config = new Config();
        config.setRegion("cn-bj2");

        config.setLogger(logger);
        Credential credential =
                new Credential(System.getenv("UCLOUD_PUBLIC_KEY"), System.getenv("UCLOUD_PRIVATE_KEY"));
        DefaultClient client = new DefaultClient(config, credential);

        Request request = new Request();
        request.setAction("GetRegion");

        Response response = null;
        try {
            response = client.invoke(request, Response.class);
        } catch (OpenAPIException e) {
            e.printStackTrace();
        }
        System.out.println(response);
    }
}

```
