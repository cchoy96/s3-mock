package com.imanage.aws.s3mock;

import com.adobe.testing.s3mock.*;

/**
 * Simple endpoints for interfacing with S3 endpoints. Should be able to:
 * - create bucket w IAM control
 * - write to bucket w IAM
 * - read from bucket w IAM
 * - delete bucket
 * - list buckets
 */
public class Application {

    public static void main(final String[] args) {

        S3MockApplication s3Mock = com.adobe.testing.s3mock.S3MockApplication.start("--server.port=0", "--http.port=0");
        int httpsPort = s3Mock.getPort();
        int httpPort = s3Mock.getHttpPort();
        // do your tests
        // ...
        // shutdown server
        s3Mock.stop();
    }
}
