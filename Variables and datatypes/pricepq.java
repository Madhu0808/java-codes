import java.util.*;;
public class pricepq {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        float pencil = Sc.nextFloat();
        float pen = Sc.nextFloat();
        float eraser = Sc.nextFloat();
        float Total= (pencil+pen+eraser);
        System.out.println("Total price is:" +Total);
        float newtotal =  Total + (0.18f * Total); 
        System.out.println("newtotal after gst is:" +newtotal);
    }
}