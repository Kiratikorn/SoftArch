

public class Square extends Geometrical {

    private int side;

    public Square(){
        super();
    }

    public Square(int side){
        super();
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea(){
        return side*side;
    }
}
