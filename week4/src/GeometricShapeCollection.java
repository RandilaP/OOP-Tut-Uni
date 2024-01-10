import java.util.ArrayList;

public class GeometricShapeCollection implements ShapeCollection{
    private ArrayList<GeometricObject> shapeList;
    private int numObjects;

    public GeometricShapeCollection(int listLength){
        this.numObjects = listLength;
        shapeList = new ArrayList<GeometricObject>();
    }

    public void addShape(GeometricObject shape){
        if(shapeList.size() < numObjects){
            shapeList.add(shape);
        }
        else{
            System.out.println("List is full!");
        }
    }

    public void printShapeList(){
        for(int i = 0; i < shapeList.size(); i++){
            if(shapeList.get(i).getShape().equals("Circle")){
                System.out.println("Circle: " + shapeList.get(i).getArea());
            }
            else if(shapeList.get(i).getShape().equals("Rectangle")){
                System.out.println("Rectangle: " + shapeList.get(i).getArea());
            }
            else{
                System.out.println("Unknown shape!");
            }
        }
    }

    public void runMenu(){
        System.out.println("1. Add circle");
        System.out.println("2. Add rectangle");
        System.out.println("3. Print shape list");
        System.out.println("4. Exit");
    }
}
