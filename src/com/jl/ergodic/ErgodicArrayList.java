package com.jl.ergodic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ErgodicArrayList
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/24 21:07
 * @Version 1.0
 */
public class ErgodicArrayList {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        //foreach循环
        for(String i : list){
            System.out.println("for循环,value:"+i);
        }

        for(int i=0;i<=list.size();i++){
            System.out.println("for循环2，value:"+i);
        }

        //将list转换为数组 进行遍历
        String[] strings = new String[list.size()];
        list.toArray(strings);
        for(int i=0;i<=strings.length-1;i++){
            System.out.println("转换成数组,value:"+strings[i]);
        }

        //利用迭代器
        Iterator<String> iterator = list.iterator();
        for(;iterator.hasNext();){
            System.out.println("迭代器,value:"+iterator.next());
        }
    }
}
