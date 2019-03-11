package 三轮.B_JavaCore.f_innerClass;

/**
 * @author sirius
 * @since 2019/3/8
 */
public class MemberInnerClass {

    private String privateStr;

    public String publicStr;

    public class MemberInner{

        private String privateStr1;

        public String publicStr2;

        public void innerMethod(){
            System.out.println(privateStr + publicStr);
        }
    }

    /**
     * 私有成员内部类无法访问
     */
    private class privateMemberInner{

    }

    public void outMethod() {
    }
}
