class cylinder {
    private int radius;
   private int height;
   public cylinder(int cyheight,int cyradius){
       height = cyheight;
       radius = cyradius;
   }

    public void setRadius(int r) {
        this.radius = r;
    }
    public int getRadius() {
        return radius;
    }
    public void setHeight(int h){
        this.height = h;
    }
    public int getHeight() {
        return height;
    }
}
public class pract_set_accessmodi {
    public static void main(String[] args) {
        cylinder cy = new cylinder(2,3);
//        cy.setHeight(3);
//        cy.setRadius(4);
        System.out.println("Height of cylinder is "+ cy.getHeight());
        System.out.println("radius of cylinder is " + cy.getRadius());

    }
}
