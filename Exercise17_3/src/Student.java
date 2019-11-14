import java.io.Serializable;

public class Student implements Serializable
{
   private String name;
   private int studyNumber;
   private String nationality;
   private int groupNumber;
   private MyDate birthday;

   public Student(String name, int studyNumber, String nationality,
         int groupNumber, MyDate birthday)
   {
      this.name = name;
      this.studyNumber = studyNumber;
      this.nationality = nationality;
      this.groupNumber = groupNumber;
      this.birthday = birthday.copy();
   }

   public String getName()
   {
      return name;
   }

   public int getStudyNumber()
   {
      return studyNumber;
   }

   public String getNationality()
   {
      return nationality;
   }

   public int getGroupNumber()
   {
      return groupNumber;
   }

   public MyDate getBirthday()
   {
      return birthday.copy();
   }

   public String toString()
   {
      return name + " (" + studyNumber + "), " + birthday + ", " + nationality
            + ", group " + groupNumber;
   }

}
