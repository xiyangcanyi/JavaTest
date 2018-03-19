package shiyan3.stu;

public class StuCard {
    private long StudentId;
    private String name;
    private String gender;
    private String major;
    private int grade;
    private String birth;
public StuCard( long StudentId,String name,String gender,String major,int grade,String birth)
{

    this.StudentId=StudentId;
    this.name=name;
    this.gender=gender;
    this.major=major;
    this.grade=grade;
    this.birth=birth;
}
public void  display(){
    System.out.println("学号："+StudentId);
    System.out.println("姓名："+name);
    System.out.println("性别："+gender);
    System.out.println("专业："+major);
    System.out.println("年级："+grade);
    System.out.println("籍贯："+birth);

}


}
