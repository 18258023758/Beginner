package com.lambda.myaction;

/**
 * 在我们自定义的函数式接口的地方使用lambda表达式
 * @author MingChenchen
 *
 */
public class WantSay {
    /**
     * 执行接口中的saySomeThing方法
     * @param action
     * @param thing
     */
    public static void excuteSay(MyActionInterface action,String thing){
        action.saySomeThing(thing);
    }

    public static void main(String[] args) {
        /*
        excuteSay(new MyActionInterface(){
            @Override
            public void saySomeThing(String str) {
                System.out.println(str);
            }
        },"Hello World");
        */

        excuteSay((String s) -> System.out.println(s),"Hello world new");

    }
}
