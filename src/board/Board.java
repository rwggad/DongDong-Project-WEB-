package board;

public class Board {
    private int boardID;
    private int boardKind;
    private String boardTitle;
    private String boardWriter;
    private String boardContent;
    private String boardDate;
    private int boardCount;
    private int isDelete;

    public int getBoardID() {
        return boardID;
    }

    public void setBoardID(int boardID) {
        this.boardID = boardID;
    }

    public int getBoardKind() { return boardKind; }

    public void setBoardKind(int boardKind) { this.boardKind = boardKind; }

    public String getBoardTitle() {
        return boardTitle;
    }

    public String getBoardWriter() {
        return boardWriter;
    }

    public void setBoardWriter(String boardWriter) {
        this.boardWriter = boardWriter;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }

    public String getBoardDate() {
        return boardDate;
    }

    public void setBoardDate(String boardDate) {
        this.boardDate = boardDate;
    }


    public int getBoardCount() { return boardCount; }

    public void setBoardCount(int boardCount) { this.boardCount = boardCount; }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
