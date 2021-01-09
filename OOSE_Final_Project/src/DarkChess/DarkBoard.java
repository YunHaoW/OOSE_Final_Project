package DarkChess;

import java.util.ArrayList;
import java.util.List;

import Framework.AbstractChess;
import Framework.Board;

public class DarkBoard extends Board {
    

    //private String boardPath = "D:\\chessGame\\OOSE_Final_Project\\OOSE_Final_Project\\src\\image\\board3.png";

    private List<AbstractChess> chesses = new ArrayList<AbstractChess>();

    private String boardPath = "E:\\netWork\\OOSE_Final_Project\\OOSE_Final_Project\\src\\image\\board3.png";

    
    public DarkBoard() {
        super(900, 461, 4, 8);
        // TODO Auto-generated constructor stub
    }
    
    public String getBoardPath() {
        return this.boardPath;
    }
    
    public int getWidth() {
        return super.getWidth();
    }
    
    public int getLength() {
        return super.getLength();
    }
    
}
