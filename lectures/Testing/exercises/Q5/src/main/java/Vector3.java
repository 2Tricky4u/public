
/**
 * Write the specification here
 */
public final class Vector3 {
    private final double x, y, z, length;

    public Vector3(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
        this.length = Math.sqrt(x*x + y*y + z*z);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getLength() {
        return length;
    }

    public boolean isZero() {
        return length == 0;
    }

    public double dot(Vector3 v) {
        return (v.x*x + v.y*y + v.z*z);
    }

    public Vector3 cross(Vector3 v) {
        double nx = y*v.z - z*v.y;
        double ny= -(x*v.z - z*v.x);
        double nz= x*v.y - y*v.x;
        return new Vector3(nx,ny,nz);
    }

    public Vector3 normalize(){
        return new Vector3(x/length,y/length,z/length);
    }

    public Vector3 scale(double n){
        return new Vector3(n*x, n*y, n*z);
    }

    @Override
    public boolean equals(Object obj) {
        if(!obj.getClass().equals(Vector3.class)) return false;
        Vector3 v = (Vector3) obj;
        return x == v.getX() && y == v.getY() && z == v.getZ();
    }
}
