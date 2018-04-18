package com.zkw.java.mockito;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.*;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-16 上午 9:49
 **/

public class LoginPresenterTest {
    /**
     * 验证方式是否被调用
     * */
    @Test
    public void testLogin() {
        UserManager mockUserManager = mock(UserManager.class);
        LoginPresenter loginPresenter = new LoginPresenter();
        loginPresenter.setUserManager(mockUserManager);
        loginPresenter.login("xiaochuang", "xiaochuang password");

        verify(mockUserManager).performLogin("xiaochuang", "xiaochuang password");
    }

    /**
     * 验证指定方法特定值
     * */
    @Test
    public void testLogin2() {
        UserManager mockUserManager = mock(UserManager.class);
        LoginPresenter loginPresenter = new LoginPresenter();
        loginPresenter.setUserManager(mockUserManager);
        loginPresenter.login("xiaochuang", "xiaochuang password");

        //先创建一个mock对象
        PasswordValidator mockValidator = mock(PasswordValidator.class);
        //当调用mockValidator的verifyPassword方法，同时传入"xiaochuang_is_handsome"时，返回true
        when(mockValidator.verifyPassword("xiaochuang_is_handsome")).thenReturn(true);
        //当调用mockValidator的verifyPassword方法，同时传入"xiaochuang_is_not_handsome"时，返回false
        when(mockValidator.verifyPassword("xiaochuang_is_not_handsome")).thenReturn(false);
        //当调用mockValidator的verifyPassword方法时，返回true，无论参数是什么
        when(mockValidator.verifyPassword(anyString())).thenReturn(true);
    }

    /**
     * 指定一个方法执行特定的动作
     * */
    @Test
    public void testLogin3() {
        UserManager mockUserManager = mock(UserManager.class);
        LoginPresenter loginPresenter = new LoginPresenter();
        loginPresenter.setUserManager(mockUserManager);
        loginPresenter.login("xiaochuang", "xiaochuang password");
        doAnswer(new Answer() {
            public Object answer(InvocationOnMock invocationOnMock) throws Throwable {
                //这里可以获得传给performLogin的参数
                Object[] arguments = invocationOnMock.getArguments();
                //callback是第三个参数
                UserManager.NetworkCallback callback = (UserManager.NetworkCallback) arguments[2];
                callback.onFailure(500, "Server error");

                return 500;
            }
        }).when(mockUserManager).performLogin(anyString(), anyString(), any(UserManager.NetworkCallback.class));
    }

    @Test
    public void test1()  {
        //  create mock
        MyClass test = mock(MyClass.class);

        // define return value for method getUniqueId()
        when(test.getUniqueId()).thenReturn(43);

        // use mock in test....
        Assert.assertEquals(test.getUniqueId(), 43);
    }
}
