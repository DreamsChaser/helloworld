package cn.com.git.leon.redisDemo;

/**
 * @author sirius
 * @since 2018/8/28
 */
public class Test {
    public static void main(String[] args) {
        //进入方法切面
        //上锁
        String key = "";
        boolean ifLock = RedisLock.lock(key, 60);
        if (ifLock) {
            try {
                //处理业务逻辑
            } catch (Exception e){

            } finally {
                RedisLock.unlock(key);
            }
        }
    }
}
