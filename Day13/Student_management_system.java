package DAY13;
class student{
    int sid;
    String Sname;
    void studentDetails(int sid,String Sname){
        this.sid=sid;
        this.Sname=Sname;
        System.out.println("Sname:"+Sname+" "+"Id:"+sid);
    }
}
class mentor extends student{
    int mid;
    String Mname;
    void mentorDetails(int mid,String Mname){
        this.mid=mid;
        this.Mname=Mname;
        System.out.println("Mname:"+Mname+" "+"M.Id:"+mid);
    }
}
class hod extends mentor{
    int hid;
    String Hname;
    void hodDetails(int hid,String Hname){
        this.hid=hid;
        this.Hname=Hname;
        System.out.println("HName:"+Hname+" "+"H.Id:"+hid);
    }
}
public class Student_management_system {
    public static void main(String[] args){
        student s=new student();
        mentor m=new mentor();
        hod h=new hod();
        h.studentDetails(1,"Vivash");
        h.mentorDetails(1,"Vicky");
    }
}
