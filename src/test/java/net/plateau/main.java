package net.plateau;

import org.apache.log4j.Logger;
import org.apache.log4j.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    //定义一个Logger对象
    static Logger logger=Logger.getLogger(main.class);

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try {
            System.out.println("请输入一个数");
            int num1=input.nextInt();//InputMismatchException  Exception
            System.out.println("再输入一个数");
            int num2=input.nextInt();//InputMismatchException
            int result=num1/num2;//ArithmeticException
            //使用logger对象输出结果，该结果会保存到日志文件中
            logger.debug("结果是"+result);
        }catch(InputMismatchException ex) {
            logger.error("只能输入数字");
        }catch(ArithmeticException ex) {
            logger.error("除数不能为0");
        }catch (Exception e) {
            logger.error("其它异常");
        }finally {
            logger.debug("程序结束");
        }
    }
}