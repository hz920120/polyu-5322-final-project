package com.hsj;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.Scanner;

/**
 * @see: https://mp.baomidou.com/guide/generator.html
 * @Description:代码生成器
 * @author baomidou
 * @date 2021/8/12 17:22
 */
public class CodeGenerator {
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotBlank(tip)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

//    public static void main(String[] args) {
//        // 代码生成器
//        AutoGenerator mpg = new AutoGenerator();
//
//        // 全局配置
//        GlobalConfig gc = new GlobalConfig();
//        String projectPath = System.getProperty("user.dir");
//        gc.setOutputDir(projectPath + "/src/main/java");
//        gc.setAuthor("system");
////        gc.setOpen(false);
//        gc.setBaseResultMap(true);
//        gc.setBaseColumnList(true);
//        gc.setMapperName("%sMapper");
//        gc.setXmlName("%sMapper");
//        gc.setServiceName("%sService");
//        gc.setServiceImplName("%sServiceImpl");
//        gc.setControllerName("%sController");
//
//        gc.setIdType(IdType.AUTO);
//        mpg.setGlobalConfig(gc);
//
//        // 数据源配置
//        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setDbType(DbType.MYSQL);
//        dsc.setUrl("jdbc:mysql://192.168.1.105:3306/smart-bar-dev?useSSL=false&useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&transformedBitIsBoolean=true&serverTimezone=GMT%2B8&nullCatalogMeansCurrent=true&allowPublicKeyRetrieval=true");
//        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
//        dsc.setUsername("root");
//        dsc.setPassword("925925");
//        mpg.setDataSource(dsc);
//
//        // 包配置
//        PackageConfig pc = new PackageConfig();
////        pc.setModuleName(scanner("模块名"));
//        pc.setParent("com.weihang");
//        pc.setController("controller");
//        pc.setMapper("mapper");
//        pc.setXml("mapper.xml");
//        pc.setEntity("entity");
//        pc.setService("service");
//        pc.setServiceImpl("service.impl");
//        mpg.setPackageInfo(pc);
//
//
//        // 策略配置
//        StrategyConfig strategy = new StrategyConfig();
//        strategy.setNaming(NamingStrategy.underline_to_camel);
//        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        strategy.setRestControllerStyle(true);
//        strategy.setInclude(scanner("表名"));
//        strategy.setTablePrefix("blade_"); //表前缀
//        mpg.setStrategy(strategy);
//        mpg.execute();
//    }
}
