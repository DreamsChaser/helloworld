package cn.com.git.leon.redisDemo;

/**
 * @author sirius
 * @since 2018/8/28
 */
public abstract class Redis {

    public abstract int setnx(String key,String value);

    public abstract int getset(String key,String value);

    public abstract String get(String key);

    public abstract int delete(String key);
}
