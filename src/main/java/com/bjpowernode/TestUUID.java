package com.bjpowernode;

import java.util.UUID;

public class TestUUID {

    private String id;
    public static void main(String[] args) {
        /**
         * 以后我们不怎么使用id来做主键，因此，他每次自增的时候都需要找到最大值，当数据过多的时候
         * 就要花费很多的时候去查询最大值
         * 因此，我们使用字符串来做主键
         * 但是你怎么确保字符串是唯一的呢？
         * 因此诞生了UUID
         *   这一串数值是由UUID是基于当前时间、计数器(counter)和硬件标识(通常为无线网卡的MAC地址)等数据计算生成的
         *   时间是每台主机的唯一标识起决定性的作用
         *
         */
       UUID uuid =  UUID.randomUUID();
      String str =  uuid.toString();
        System.out.println(str);
    }
}
