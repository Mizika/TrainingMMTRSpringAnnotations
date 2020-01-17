package mmtr.springAnnotation.dictionary;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("mmtr.springAnnotation.dictionary")
@PropertySource("classpath:dic.properties")
public class SpringConf { }
