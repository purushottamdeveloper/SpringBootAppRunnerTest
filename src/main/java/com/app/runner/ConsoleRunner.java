package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		//Option Args
		//1. read all keys
		Set<String> optionkeys=args.getOptionNames();
		System.out.println(optionkeys);
		
		//2.one key related values
		List<String> list=args.getOptionValues("profile");
		List<String> list2=args.getOptionValues("model");
		List<String> list3=args.getOptionValues("db");
		System.out.println(list+" "+list2+" "+list3);
		
		//3.check for key exist
		System.out.println(args.containsOption("nature"));
		System.out.println(args.containsOption("db"));
		
		
		//4.--non-option
		List<String> nonop=args.getNonOptionArgs();
		System.out.println(nonop);
		
		//5.--all args
		String[] arr=args.getSourceArgs();
		System.out.println(arr);
		System.out.println(Arrays.asList(arr));
		
		
		
		
		
		
		
	}
	

}
