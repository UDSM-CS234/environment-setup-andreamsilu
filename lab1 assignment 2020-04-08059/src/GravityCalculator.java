public class GravityCalculator {


        public static void main(String[] arguments){

            double  a =-9.81; // Earth's gravity in m/s^2

            double  vi= 0.0; //initialVelocity  starting velocity of the object

            double  t = 10.0;// fallingTime time in seconds that the object falls

            double  xi = 0.0; // Starting position in meters, the calculation will          determine the ending position in meters




           double xf = 0.5 * a * (t*t) + vi * t + xi; //final position

            System.out.println("The object's position after " + t +" seconds is "+  xf + " m.");


    }

}
