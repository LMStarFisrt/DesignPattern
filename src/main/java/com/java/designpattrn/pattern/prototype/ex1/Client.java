package com.java.designpattrn.pattern.prototype.ex1;

import java.util.Random;

/**
 * @author dadisdad
 * @date 2018/3/21
 */
public class Client {

    private volatile static int MAX_COUNT = 6;

    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }

    public static void sendMail(Mail mail) {
        System.out.println("标题： " + mail.getSubject() + "\t" + mail.getAppellation() + "\t 收件人：" + mail.getReceiver() + "\t...发送成功");
    }

    public static void main(String[] args) {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        String name = "";
        mail.setTail("xx银行版权所有");
        while (i < MAX_COUNT) {
            Mail cloneMail = mail.clone();
            name = getRandString(5);
            cloneMail.setAppellation(name + " 先生（女士）");
            cloneMail.setReceiver(name + "@" + getRandString(8) + ".com");
            sendMail(cloneMail);
            i++;
        }

    }

}
