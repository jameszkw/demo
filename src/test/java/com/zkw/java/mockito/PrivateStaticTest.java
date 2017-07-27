package com.zkw.java.mockito;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Calendar;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-17 下午 3:16
 **/
@RunWith(PowerMockRunner.class)//1 标注使用PowerRunner运行test（powermock会修改字节码）
@PrepareForTest({PrivateStatic.class}) //2 设置mock类（支持多个类，逗号分隔），这个可以设置到class上，也可以设置到method上。
public class PrivateStaticTest {
    @Before
    public void init() {
        PowerMockito.mockStatic(PrivateStatic.class);//3 告诉powermock需要mock哪个类。（感觉这里配置和②有点重合）
    }

    @Test
    public void testWebchatEnable() {
        Calendar c = Calendar.getInstance();
        c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE), 16, 35);
        // 创建spy,如果不创建的话，后面调用PrivateStatic就都是Mock类，这里创建了spy后，只有设置了mock的方法才会调用mock行为
        PowerMockito.spy(PrivateStatic.class);
        try {
            PowerMockito.doReturn(c).when(PrivateStatic.class, "getCurrentTime"); //Mock私有方法
        } catch (Exception e) {
            e.printStackTrace();
        }
        PowerMockito.when("").thenReturn("0900,1800"); //4 - Mock静态方法，返回期望值



    }
}
