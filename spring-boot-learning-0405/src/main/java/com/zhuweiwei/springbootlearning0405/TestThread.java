package com.zhuweiwei.springbootlearning0405;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zww
 * @date 2020-05-08 16:12
 * @description
 */
public class TestThread {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        executorService.execute(() -> {
//            System.out.println(1 / 0);
//        });
//        executorService.submit(() -> {
//            System.out.println(1 / 0);
//        });
    }
}
