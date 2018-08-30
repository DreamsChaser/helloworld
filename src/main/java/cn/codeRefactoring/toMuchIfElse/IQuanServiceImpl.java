package cn.codeRefactoring.toMuchIfElse;

/**
 * @author sirius
 * @since 2018/8/30
 */
public class IQuanServiceImpl implements IQuanService{

    @Override
    public void addQuan(QuanProductDTO quanProductDTO) {
        if (quanProductDTO.equals("01")){
            //积分券校验
        }else if (quanProductDTO.getType().equals("02")) {
            //level2券校验
        }else if (quanProductDTO.getType().equals("03")) {
            //理财券校验
        }
    }
}
