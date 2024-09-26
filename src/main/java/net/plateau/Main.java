/**
 * @author lucheshidi
 * @apiNote maven
 * @since 2024.9
 * Copyright lucheshidi
 */

package net.plateau;

import org.apache.log4j.Logger;

import java.awt.*;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        //记录debug日志
        logger.debug("Test [DEBUG] from log4j,");
        //记录info日志
        logger.info("Test [INFO] from log4j");
        //记录warn日志
        logger.warn("Test [WARN] from log4j");
        //记录error日志
        logger.error("Test [ERROR] from log4j");

        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                super.run();
                logger.warn("Plateau Launcher will be EXIT!");
            }
        });

        //定义窗口基本特征
        JFrame main_window = new JFrame("Plateau Craft Launcher");//定义一个窗体对象main_window
        JPanel games, marketplace, online, settings, download;
        JLabel games_lab, marketplace_lab, online_lab, settings_lab, download_lab;
        //JPanel 和 JLabel 必须一起用, 否则成屎山代码
        JTabbedPane jtbp = new JTabbedPane();//创建一个选项卡面板布局
        //开始定义
        //JLabel:
        games_lab = new JLabel("Choose a version to launch");
        marketplace_lab = new JLabel("Marketplace");
        online_lab = new JLabel("My Friends");
        settings_lab = new JLabel("Settings");
        download_lab = new JLabel("Download game resources");
        //JPanel:
        games = new JPanel();
        marketplace = new JPanel();
        online = new JPanel();
        settings = new JPanel();
        download = new JPanel();

        games.setLayout(new BorderLayout());//设置为BorderLayout布局管理器
        marketplace.setLayout(new BorderLayout());
        online.setLayout(new BorderLayout());
        settings.setLayout(new BorderLayout());
        download.setLayout(new BorderLayout());

        games.add(games_lab);
        marketplace.add(marketplace_lab);
        online.add(online_lab);
        settings.add(settings_lab);
        download.add(download_lab);

        jtbp.addTab("Games", games);//添加选项卡进选项卡面板
        jtbp.addTab("Marketplace", marketplace);
        jtbp.addTab("online", online);
        jtbp.addTab("Settings", settings);
        jtbp.addTab("Download", download);

        main_window.setContentPane(jtbp);
        main_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_window.setVisible(true);

        main_window.setSize(900,500);//窗体屏幕长和宽
        main_window.setLocationRelativeTo(null);//窗口置于屏幕中央
        //f.setLocation(300, 300);//窗口位置
        //f.setResizable(false);//设置窗体是否可以调整大小
        main_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点击窗口的关闭按钮时，程序关闭
        //否则程序仍然在后台运行
        main_window.setVisible(true);//设置窗体可见，否则看不见界面
        main_window.setLayout(new FlowLayout());//创建一个新的流布局管理器，
        //具有指定的对齐方式以及指定的水平和垂直间隙

    }

}
