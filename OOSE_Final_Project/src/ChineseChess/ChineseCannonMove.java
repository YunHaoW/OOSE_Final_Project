package ChineseChess;

import Framework.AbstractChess;
import Framework.MoveStrategy;

public class ChineseCannonMove implements MoveStrategy {

  public boolean CanMove(AbstractChess chess, int XDisplacement, int YDisplacement) {
    // TODO Auto-generated method stub
    if(XDisplacement != 0 && YDisplacement != 0) {
      return false;
    } else {
      return true;
    }
    
  }

}
