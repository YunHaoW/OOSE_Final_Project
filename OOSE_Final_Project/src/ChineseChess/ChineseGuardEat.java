package ChineseChess;

import java.util.List;

import Framework.AbstractChess;
import Framework.EatStrategy;

public class ChineseGuardEat implements EatStrategy {

  @Override
  public boolean CanEat(AbstractChess initiative, List<AbstractChess> passive, int XDisplacement, int YDisplacement) {
    // TODO Auto-generated method stub
    if (Math.sqrt(XDisplacement * XDisplacement + YDisplacement * YDisplacement) == Math.sqrt(2)) {
      return true;
    } else {
      return false;
    }
    
  }

}
