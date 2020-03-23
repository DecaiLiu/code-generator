package com.mybatis.generator;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * 自定义生成注释类
 *
 * @auth decai.liu
 * @date 2020/03/23
 */
public class MysqlCommentGenerator extends DefaultCommentGenerator {

    /**
     * 配置文件
     */
    private Properties properties;

    /**
     * 跳过注释
     */
    private boolean suppressAllComments = false;

    public MysqlCommentGenerator() {
        properties = new Properties();
        this.suppressAllComments = StringUtility.isTrue(properties.getProperty("suppressAllComments"));
    }

    @Override
    public void addConfigurationProperties(Properties properties) {
        this.properties.putAll(properties);
    }

    /**
     * 类注释
     *
     * @param topLevelClass
     * @param introspectedTable
     */
    @Override
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        if (this.suppressAllComments) {
            return;
        }
        String author = properties.getProperty("author");
        String dateFormat = properties.getProperty("dateFormat", "yyyy-MM-dd");
        SimpleDateFormat dateFormatter = new SimpleDateFormat(dateFormat);

        // 获取表注释
        String remarks = introspectedTable.getRemarks();

        topLevelClass.addJavaDocLine("/**");
        topLevelClass.addJavaDocLine(" * " + remarks);
        topLevelClass.addJavaDocLine(" *");
        topLevelClass.addJavaDocLine(" * @author " + author);
        topLevelClass.addJavaDocLine(" * @date " + dateFormatter.format(new Date()));
        topLevelClass.addJavaDocLine(" */");
    }

    /**
     * 字段注释
     *
     * @param field
     * @param introspectedTable
     * @param introspectedColumn
     */
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        if (this.suppressAllComments) {
            return;
        }
        // 获取列注释
        String remarks = introspectedColumn.getRemarks();
        field.addJavaDocLine("/**");
        field.addJavaDocLine(" * " + remarks);
        field.addJavaDocLine(" */");
    }

    /**
     * 实体类的静态注释 如：序列化的版本号
     *
     * @param field
     * @param introspectedTable
     */
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
//        super.addFieldComment(field, introspectedTable);
    }

    /**
     * 实体类toString方法
     *
     * @param method
     * @param introspectedTable
     */
    @Override
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
//        super.addGeneralMethodComment(method, introspectedTable);
    }

    /**
     * getter方法注释
     *
     * @param method
     * @param introspectedTable
     * @param introspectedColumn
     */
    @Override
    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
//        super.addGetterComment(method, introspectedTable, introspectedColumn);
    }

    /**
     * setter 方法注释
     *
     * @param method
     * @param introspectedTable
     * @param introspectedColumn
     */
    @Override
    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
//        super.addSetterComment(method, introspectedTable, introspectedColumn);
    }

    /**
     * 实体类对应的 mapper.xml 文件注释，一般不需要
     *
     * @param xmlElement
     */
    @Override
    public void addComment(XmlElement xmlElement) {
//        super.addComment(xmlElement);
    }
}
