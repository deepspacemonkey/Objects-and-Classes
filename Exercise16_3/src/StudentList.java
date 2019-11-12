import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentList implements Serializable
{
   private ArrayList<Student> list;

   public StudentList()
   {
      list = new ArrayList<Student>();
   }

   public int size()
   {
      return list.size();
   }

   public void add(Student student)
   {
      list.add(student);
   }

   public void remove(int index)
   {
      list.remove(index);
   }

   public Student get(int index)
   {
      return list.get(index);
   }

   public StudentList getByGroup(int groupNumber)
   {
      StudentList groupList = new StudentList();
      for (int i = 0; i < list.size(); i++)
      {
         if (list.get(i).getGroupNumber() == groupNumber)
         {
            groupList.add(list.get(i));
         }
      }
      return groupList;
   }

   public StudentList[] splitByGroup()
   {
      int[] groups = getGroupNumbers();
      StudentList[] split = new StudentList[groups.length];
      for (int i = 0; i < groups.length; i++)
      {
         split[i] = getByGroup(groups[i]);
      }
      return split;
   }

   public StudentList getByNationality(String nationality)
   {
      StudentList nationalityList = new StudentList();
      for (int i = 0; i < list.size(); i++)
      {
         if (list.get(i).getNationality().equalsIgnoreCase(nationality))
         {
            nationalityList.add(list.get(i));
         }
      }
      return nationalityList;
   }

   public StudentList[] splitByNationality()
   {
      String[] nationalities = getNationalites();
      StudentList[] split = new StudentList[nationalities.length];
      for (int i = 0; i < nationalities.length; i++)
      {
         split[i] = getByNationality(nationalities[i]);
      }
      return split;
   }

   public StudentList getByStarsign(String starsign)
   {
      StudentList starsignList = new StudentList();
      for (int i = 0; i < list.size(); i++)
      {
         if (list.get(i).getBirthday().starsign().equalsIgnoreCase(starsign))
         {
            starsignList.add(list.get(i));
         }
      }
      return starsignList;
   }

   public StudentList[] splitByStarsign()
   {
      String[] starsigns = MyDate.STARSIGNS;
      StudentList[] split = new StudentList[starsigns.length];
      for (int i = 0; i < starsigns.length; i++)
      {
         split[i] = getByStarsign(starsigns[i]);
      }
      return split;
   }

   public int[] getGroupNumbers()
   {
      ArrayList<Integer> groupList = new ArrayList<>();
      for (int i = 0; i < list.size(); i++)
      {
         int group = list.get(i).getGroupNumber();
         if (!groupList.contains(group))
         {
            groupList.add(group);
         }
      }
      int[] array = new int[groupList.size()];
      for (int i = 0; i < groupList.size(); i++)
      {
         array[i] = groupList.get(i);
      }
      Arrays.sort(array);
      return array;
   }

   public String[] getNationalites()
   {
      ArrayList<String> nationalityList = new ArrayList<>();
      for (int i = 0; i < list.size(); i++)
      {
         String nationality = list.get(i).getNationality();
         if (!nationalityList.contains(nationality))
         {
            nationalityList.add(nationality);
         }
      }
      String[] array = new String[nationalityList.size()];
      for (int i = 0; i < nationalityList.size(); i++)
      {
         array[i] = nationalityList.get(i);
      }
      Arrays.sort(array);
      return array;
   }

   public void sortByName()
   {
      ArrayList<Student> sorted = new ArrayList<>();
      while (list.size() > 0)
      {
         int minIndex = 0;
         for (int i = 0; i < list.size(); i++)
         {
            if (list.get(i).getName().compareTo(list.get(minIndex).getName()) < 0)
            {
               minIndex = i;
            }
         }
         sorted.add(list.get(minIndex));
         list.remove(minIndex);
      }
      list = sorted;
   }

   public void sortByGroup()
   {
      this.sortByName();
      ArrayList<Student> sorted = new ArrayList<>();
      while (list.size() > 0)
      {
         int minIndex = 0;
         for (int i = 0; i < list.size(); i++)
         {
            if (list.get(i).getGroupNumber() < list.get(minIndex).getGroupNumber())
            {
               minIndex = i;
            }
         }
         sorted.add(list.get(minIndex));
         list.remove(minIndex);
      }
      list = sorted;
   }
   public void sortByBirthday()
   {
      this.sortByName();
      ArrayList<Student> sorted = new ArrayList<>();
      while (list.size() > 0)
      {
         int minIndex = 0;
         for (int i = 0; i < list.size(); i++)
         {
            MyDate d1 = list.get(i).getBirthday();
            d1.set(d1.getDay(), d1.getMonth(), 2000);
            MyDate d2 = list.get(minIndex).getBirthday();
            d2.set(d2.getDay(), d2.getMonth(), 2000);
            if (d1.isBefore(d2))
            {
               minIndex = i;
            }
         }
         sorted.add(list.get(minIndex));
         list.remove(minIndex);
      }
      list = sorted;
   }

   public void sortByAge()
   {
      this.sortByName();
      ArrayList<Student> sorted = new ArrayList<>();
      while (list.size() > 0)
      {
         int minIndex = 0;
         for (int i = 0; i < list.size(); i++)
         {
            if (list.get(minIndex).getBirthday().isBefore(list.get(i).getBirthday()))
            {
               minIndex = i;
            }
         }
         sorted.add(list.get(minIndex));
         list.remove(minIndex);
      }
      list = sorted;
   }

   public String toString()
   {
      String s = "";
      for (int i = 0; i < list.size(); i++)
      {
         s += list.get(i);
         if (i < list.size() - 1)
            s += "\n";
      }
      return s;
   }

}
