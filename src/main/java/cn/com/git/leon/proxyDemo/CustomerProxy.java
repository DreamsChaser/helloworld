package cn.com.git.leon.proxyDemo;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author sirius
 * @since 2018/9/16
 */
public class CustomerProxy implements Serializable{

    private static final long serialVersionUID = 1L;

    public static Object newProxyInstance(Class<?> interfaces) throws Exception {
        //动态生成java代码
        Method[] methods = interfaces.getMethods();
        StringBuilder sb = new StringBuilder(700);
        sb.append("package cn.com.git.leon.proxyDemo;\n\n");
        sb.append("public class Proxy_0 implements " +  interfaces.getSimpleName() + "\n");
        sb.append("{\n");
        sb.append("\t" + interfaces.getSimpleName() + " interfaces;\n\n");
        sb.append("\tpublic Proxy_0(" + interfaces.getSimpleName() +  " interfaces)\n");
        sb.append("\t{\n");
        sb.append("\t\tthis.interfaces = interfaces;\n");
        sb.append("\t}\n\n");
        //生成方法
        for (Method m : methods) {
            sb.append("\tpublic " + m.getReturnType() + " " + m.getName() + "()\n");
            sb.append("\t{\n");
            sb.append("\t\tSystem.out.println(\"Before Hello World!\");\n");
            sb.append("\t\tinterfaces." + m.getName() + "();\n");
            sb.append("\t\tSystem.out.println(\"After Hello World!\");\n");
            sb.append("\t}\n");
        }
        sb.append("}");
        //生成.java文件
        String fileDir = System.getProperty("user.dir");
        String fileName = fileDir + "\\src\\main\\java\\cn\\com\\git\\leon\\proxyDemo\\Proxy_0.java";
        File javaFile = new File(fileName);
        Writer writer = new FileWriter(javaFile);
        writer.write(sb.toString());
        writer.close();
        //编译java代码
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager sjfm = compiler.getStandardFileManager(null, null, null);
        Iterable<? extends JavaFileObject> iter = sjfm.getJavaFileObjects(fileName);
        JavaCompiler.CompilationTask ct = compiler.getTask(null, sjfm, null, null, null, iter);
        ct.call();
        sjfm.close();
        //将生成的.class文件载入内存，默认的ClassLoader只能载入CLASSPATH下的.class文件
        URL[] urls = new URL[] {(new URL("file:\\" + System.getProperty("user.dir") + "\\src"))};
        URLClassLoader ul = new URLClassLoader(urls);
        Class<?> c = ul.loadClass("cn.com.git.leon.proxyDemo");
        //反射生成代理类
//        Constructor<?> constructor = c.getConstructor(HelloWorld.class);
//        HelloWorld helloWorldImpl = new HelloWorldImpl();
//        Object obj = constructor.newInstance(helloWorldImpl);
        /** 使用完毕删除生成的代理.java文件和.class文件，这样就看不到动态生成的内容了 */
        /*File classFile = new File(fileDir + "\\src\\com\\xrq\\proxy\\StaticProxy.class");
        javaFile.delete();
        classFile.delete();*/
        return null;
    }
}
