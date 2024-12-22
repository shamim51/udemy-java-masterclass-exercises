package section_7.point_33;

public class Point {
    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;

    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }


    //d =√[(x2 – x1)2 + (y2 – y1)2]
    public double distance(){

        double distance = Math.sqrt((this.x*this.x) + (this.y*this.y));
        return distance;
    }

    public double distance(Point point){
        int distanceOfX =  this.x - point.getX();
        int distanceOfY = this.y - point.getY();


        double distance = Math.sqrt(distanceOfX*distanceOfX + distanceOfY*distanceOfY);

        return distance;
    }

    public double distance(int x, int y){
        int distanceOfX =  this.x - x;
        int distanceOfY = this.y - y;


        double distance = Math.sqrt(distanceOfX*distanceOfX + distanceOfY*distanceOfY);

        return distance;
    }
}
