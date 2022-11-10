public class FieldStartUp {
    char[][] field = new char[3][3];

    public FieldStartUp(char[][] field) {
        this.field = field;
    }


    public char getTopLeft() {
        return this.field[0][0];
    }

    public char getTopCenter() {
        return this.field[1][0];
    }
    
    public char getTopRight() {
        return this.field[2][0];
    }
    
    public char getMiddleLeft() {
        return this.field[0][1];
    }
    
    public char getMiddleCenter() {
        return this.field[1][1];
    }
    
    public char getMiddleRight() {
        return this.field[2][1];
    }
    
    public char getBottomLeft() {
        return this.field[0][2];
    }
    
    public char getBottomMiddle() {
        return this.field[1][2];
    }
    
    public char getBottomRight() {
        return this.field[2][2];
    }
}
