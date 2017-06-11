
import com.office.OfficeChair;
import com.home.Bedroom;
static import com.Chair.height;
class Launcher {
    static public void main(String ags[]) {
        Bedroom b = new Bedroom();
        OfficeChair c = new OfficeChair();
        c.seat();
        System.out.println(c.height);

        Ether e = new Ether(); //while Ether is in the default package and same package with Launcher,
        //this line compiles with javac. // dont understand the mystery of "class in default package cannot
        //be used by another class."
    }
}