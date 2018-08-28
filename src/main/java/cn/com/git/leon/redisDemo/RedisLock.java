package cn.com.git.leon.redisDemo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sirius
 * @since 2018/8/28
 */
public class RedisLock {

    @Autowired
    static Redis redis;

    public static boolean lock(String key,int expireTime){
        //1、redis setnx方法返回1则获得锁
        //setnx 如果key不存在就返回1
        long value = System.currentTimeMillis() + expireTime;
        int status = redis.setnx(key, String.valueOf(value));
        if (status == 1){
            //得到锁返回
            return true;
        }
        String oldExpireTime = redis.get(key);
        //当前时间比较如果过期则允许其它线程执行
        if (Long.valueOf(oldExpireTime) < System.currentTimeMillis()){
            //超时
            long newExpireTime = System.currentTimeMillis() + expireTime;
            long currentExpireTime = redis.getset(key, String.valueOf(newExpireTime));
            if (currentExpireTime == Long.valueOf(oldExpireTime)){
                //说明成功上锁
                return true;
            }
        }
        return false;
    }

    public static void unlock(String key){
        long oldExpireTime = Long.parseLong(redis.get(key));
        if(oldExpireTime > System.currentTimeMillis()) {
            redis.delete(key);
        }
    }
}
