package mercado_api_master.estoquePao.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//
//import com.google.common.base.Predicate;
//
//import springfox.documentation.RequestHandler;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import static springfox.documentation.builders.RequestHandlerSelectors.*;
//
//@Configuration
//@EnableSwagger2
public class SwaggerConfig<REquestHandler> extends WebMvcConfigurationSupport{
//
//    private static final String BASE_PACKAGE = ("mercado_api_master"); 
//    		 //.estoquePao.controller"
//    private static final String API_TITLE = "mercado_api_master";
//    private static final String API_DESCRIPTION = "projeto mercado_api_master";
//    private static final String CONTACT_NAME = "Loveneykens philogene";
//    private static final String CONTACT_GITHUB = "https://gtihub.com/LoveneykensPhilogene";
//    private static final String CONTACT_EMAIL = "loveneykens@gmail.com";
//    
//    
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//          .apiInfo(apiInfo())		
//          .select()
//          .paths(PathSelectors.any())
//          .apis(apis())
//          .build();
//    }
//    
//    private Predicate<RequestHandler>apis(){
//    	return RequestHandlerSelectors.basePackage( BASE_PACKAGE);
//    }
//    
//    private ApiInfo apiInfo() {
//    	return new ApiInfoBuilder()
//    			.title(API_TITLE)
//    			.description(API_DESCRIPTION)
//    			.contact(new Contact(CONTACT_NAME,CONTACT_GITHUB,CONTACT_EMAIL))
//                .build();
//    }
//    
//    @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("swagger-ui.html")
//                .addResourceLocations("classpath:/META-INF/resources/webjars/");
//
//        registry.addResourceHandler("/target/classes**")
//                .addResourceLocations("classpath:/META-INF/resources/webjars/");
////                .addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }
    
}


//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(basePackage(BASE_PACKAGE))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(buildApiInfo());
//    }
//
//	private ApiInfo buildApiInfo() {
//        return new ApiInfoBuilder()
//                .title(API_TITLE)
//                .description(API_DESCRIPTION)
//                .version("3.0.0")
//                .contact(new Contact(CONTACT_NAME, CONTACT_GITHUB, CONTACT_EMAIL))
//                .build();
//    }
//}
