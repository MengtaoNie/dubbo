package com.hisun.app;

import com.hisun.app.pojo.Address;
import com.hisun.app.pojo.User;
import org.junit.Assert;
import org.junit.Test;

//对象拷贝
public class test {
    @Test
    public void copy() {
        Address address = new Address("杭州","中国");
        User user = new User("大山",address);
        //调用构造函数时进行深拷贝
        User copyUser = new User(user.getName(),new Address(address.getCity(),address.getCountry()));
        //修改源对象的值
        user.getAddress().setCity("深圳");
        //检查两个对象的值是否不相同
        Assert.assertNotSame(user.getAddress().getCity(),copyUser.getAddress().getCity());
        System.out.println(user);
        System.out.println(copyUser);
    }
}
