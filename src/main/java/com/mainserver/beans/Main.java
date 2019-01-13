package com.mainserver.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext(
                        "beans.xml"
                );

        ctx.getBean(UiAdapter.class);
    }

}
