public class Rectangle {
    private int width;
    private int height;
    
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    
    @Override
    public boolean equals(Object object){
        if (this == object){
            return true;
        } 
        if (object == null) return false;
        if (getClass() != object.getClass()) return false;
        // 두 객체의 클래스(타입)이 엄격하게 같은지 검사
        Rectangle rectangle = (Rectangle) object;
        return this.width ==rectangle.width && this.height == rectangle.height;
    }
    
    @Override
    public String toString(){
        return "Reactangle{width="+this.width+", height="+this.height+"}";
    }
}
