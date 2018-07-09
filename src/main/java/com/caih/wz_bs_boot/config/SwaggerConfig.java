package com.caih.wz_bs_boot.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by weijianfu on 2018/6/9.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 可以定义多个组
     * 访问http://localhost:8080/swagger-ui.html时右上角可以通过下拉菜单选择不同的组
     * 这个是demoController的API说明
     */
    @SuppressWarnings("unchecked")
    @Bean
    public Docket demoApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("demo")
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .pathMapping("/")
                .select()
                .paths(Predicates.or(PathSelectors.regex("/demo/.*")))//过滤的接口
                .build()
                .apiInfo(
                        new ApiInfo("DemoController相关接口",//大标题
                                "DemoController接口整体说明：",//小标题
                                "1.0",//版本
                                "服务条款",
                                new Contact("weijianfu", "URL", "EMail"),//作者信息
                                "中国-东盟信息港股份有限公司",//链接显示文字
                                "http://www.cainfoharbor.com/"//网站链接
                        )
                );
    }





}