package cn.bonc.springcloud1.service.feign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiImpl implements SchedualServiceHi {

	public String sayHiFromClientOne(String name) {
		
		return  "sorry "+name;
	}

}
