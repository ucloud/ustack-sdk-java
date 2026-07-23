package com.ucloudstack.common.credential;

import static org.junit.Assert.*;

import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.exception.OpenAPIException;
import com.ucloudstack.common.request.Request;

import org.junit.Assert;
import org.junit.Test;

public class CredentialTest {

    private static final String pubKey = "openapisomeone@example.com1296235120854146120";
    private static final String priKey = "46f09bb9fab4f12dfc160dae12273d5332b5debe";

    static class DemoRequest extends Request {

        DemoRequest() {
            super();
        }

        @OpenAPIParam("Region")
        private String region;

        @OpenAPIParam("Limit")
        private Integer limit;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public Integer getLimit() {
            return limit;
        }

        public void setLimit(Integer limit) {
            this.limit = limit;
        }
    }

    @Test
    public void verifyAc() throws OpenAPIException {
        Credential cred = new Credential(pubKey, priKey);
        Assert.assertEquals(pubKey, cred.getPublicKey());
        Assert.assertEquals(priKey, cred.getPrivateKey());

        cred.setPublicKey(pubKey);
        cred.setPrivateKey(priKey);
        Assert.assertEquals(pubKey, cred.getPublicKey());
        Assert.assertEquals(priKey, cred.getPrivateKey());

        DemoRequest request = new DemoRequest();
        request.setAction("DescribeUHostInstance");
        request.setRegion("cn-bj2");
        request.setLimit(10);

        assertEquals("21225896d287a006487c7007267161244953666c", cred.verifyAc(request));
    }

    static class DoubleRequest extends Request {
        DoubleRequest() {
            super();
        }

        @OpenAPIParam("Proportion")
        private Double proportion;

        @OpenAPIParam("Region")
        private String region;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public void setProportion(Double proportion) {
            this.proportion = proportion;
        }

        public Double getProportion() {
            return proportion;
        }
    }

    @Test
    public void verifyAcDoubleTailingZero() throws OpenAPIException {
        Credential cred = new Credential(pubKey, priKey);
        Assert.assertEquals(pubKey, cred.getPublicKey());
        Assert.assertEquals(priKey, cred.getPrivateKey());

        cred.setPublicKey(pubKey);
        cred.setPrivateKey(priKey);
        Assert.assertEquals(pubKey, cred.getPublicKey());
        Assert.assertEquals(priKey, cred.getPrivateKey());

        DoubleRequest request = new DoubleRequest();
        request.setAction("DescribeUHostInstance");
        request.setRegion("cn-bj2");
        request.setProportion(35.0);

        String ac0 = cred.verifyAc(request);

        // You can calculate sign by:
        // openapi sign --private-key 46f09bb9fab4f12dfc160dae12273d5332b5debe \
        //    --param Action=DescribeUHostInstance --param Region=cn-bj2 \
        //    --param Proportion=35 \
        //    --param PublicKey=openapisomeone@example.com1296235120854146121
        assertEquals("e026f17a8613fc3e9eace5a6d7e5dc4528b22c89", ac0);
    }

    @Test
    public void verifyAcDoubleNoneTailingZero() throws OpenAPIException {
        Credential cred = new Credential(pubKey, priKey);
        Assert.assertEquals(pubKey, cred.getPublicKey());
        Assert.assertEquals(priKey, cred.getPrivateKey());

        cred.setPublicKey(pubKey);
        cred.setPrivateKey(priKey);
        Assert.assertEquals(pubKey, cred.getPublicKey());
        Assert.assertEquals(priKey, cred.getPrivateKey());

        DoubleRequest request = new DoubleRequest();
        request.setAction("DescribeUHostInstance");
        request.setRegion("cn-bj2");
        request.setProportion(65.722);

        String ac0 = cred.verifyAc(request);

        // You can calculate sign by:
        // openapi sign --private-key 46f09bb9fab4f12dfc160dae12273d5332b5debe \
        //    --param Action=DescribeUHostInstance --param Region=cn-bj2 \
        //    --param Proportion=65.722 \
        //    --param PublicKey=openapisomeone@example.com1296235120854146121
        assertEquals("f5763a30443d793499454e893f9469e7f38fe724", ac0);
    }
}
