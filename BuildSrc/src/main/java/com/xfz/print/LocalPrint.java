package com.xfz.print;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * @author xufangzhen
 * @dat 2019/9/3
 * 功能模块：
 */
public class LocalPrint implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        System.out.println("local print plugin ==============");
    }
}
