package com.example;


import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Autowired
	DemoRepository demoRepository;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/data")
    public Contact data(@RequestParam(value="name", defaultValue="World") String name) {
        return new Contact((Long)counter.incrementAndGet(),
                            String.format(template, name), " "," ");
    }

    @RequestMapping("/add")
    public Contact data1(@RequestParam(value="name", defaultValue="World") String name) {
        return new Contact((Long)counter.incrementAndGet(),
                            String.format(template, name), " "," ");
    }
    
    @RequestMapping("/update")
    public Contact data2(@RequestParam(value="name", defaultValue="World") Contact contact) {
    	demoRepository.save(contact);
        return new Contact((Long)counter.incrementAndGet(),
                            String.format(template, name), " "," ");
    }
    

    @RequestMapping("/search")
    //List<Demo>
    public Contact data3(@RequestParam(value="name", defaultValue="World") String name) {
        return new Contact((Long)counter.incrementAndGet(),
                            String.format(template, name), " "," ");
    }
    
    @RequestMapping("/name")
    public List<Contact> findByName(@RequestParam(value="name") String name)
    {
    	return demoRepository.findByName(name);
    }
}
