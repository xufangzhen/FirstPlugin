package com.xfz.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * @author xufangzhen
 * @dat 2019/9/3
 * 功能模块：
 */
public class PrintPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        System.out.println("first gradle plugin ==============");
    }
}
