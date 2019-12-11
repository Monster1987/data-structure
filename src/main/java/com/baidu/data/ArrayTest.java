package com.baidu.data;

import org.junit.Test;

/**
 * @Auther:zcf
 * @Date:2019/12/11
 * @Descirption:com.baidu.data
 * @version:1.0
 */
public class ArrayTest {
    //遍历数组
    public void show(int[] array){
        for(int i=0;i<array.length;i++ ){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    @Test
    //查找数据
    public void f1(){
        int[] array={1,3,5,7};

        int key=2;
        int i;
        for(i=0;i<array.length;i++){
            if(key==array[i]) break;
        }
        if(i==array.length){
            System.out.println("要查找的数"+key+"不存在");
        }else {
            System.out.println("要查找的数"+key+"的下标为："+i);
        }

    }

    @Test
    //删除数据
    public void f2(){
        int[] array={1,3,5,7,9};
        int key=5;
        System.out.println("删除数"+key+"前的数组为：");
        this.show(array);
        int i;
        for(i=0;i<array.length;i++){
            if(key==array[i]) break;
        }

        if(i==array.length){
            System.out.println("删除数"+key+"不存在");
        }else {
            for(int j=i;j<array.length-1;j++){
                array[j]=array[j+1];
            }
            array[array.length-1]=0;
            System.out.println("删除数"+key+"后的数组为：");
            this.show(array);

        }

    }
}
