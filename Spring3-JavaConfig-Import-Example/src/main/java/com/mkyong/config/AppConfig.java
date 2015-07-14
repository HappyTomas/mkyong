package com.mkyong.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ CustomerConfig.class, SchedulerConfig.class })
public class AppConfig {

}


/* xml config style is like this

	<beans xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="http://www.springframework.org/schema/beans
		http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">
	 
		<import resource="common/Spring-Common.xml"/>
	        <import resource="connection/Spring-Connection.xml"/>
	        <import resource="moduleA/Spring-ModuleA.xml"/>
	 
	</beans>

*/