/*
Write a Human class with 6 fields.
Think up and implement 10 different constructors for it.
Each constructor should make sense.

 */
package Level10;

/**
 *
 * @author Cam
 */
public class HumanClassConstructors {
    public static void main(String[] args) 
    {
    
    }

    public static class Human 
    {
        private int age;
        private String name;
        private String job;
        private int KidCount;
        private int FriendCount;
        private String MomName;
    
        public Human(int age)
        {
            this.age = age;           
        }
        
        public Human(String name)
        {
            this.name = name;
        }
        
        public Human(String job,int age)
        {
            this.job = job;
            this.age = age;
        }
        
        public Human (String name, int kidcount, int FriendCount)
        {
            this.KidCount= kidcount;
            this.name = name;
            this.FriendCount = FriendCount;
        }
        
        public Human(String name, String MomName)
        {
            this.name = name;
            this.MomName = MomName;
        }
        
        public Human(String name, String MomName, String job)
        {
            this.name = name;
            this.job = job;
            this.MomName = MomName;
        }
        
        public Human(String name, int kidcount, int FriendCount, String MomName)
        {
            this.name = name;
            this.KidCount = kidcount;
            this.FriendCount = FriendCount;
            this.MomName = MomName;
        }
        
        public Human(String name, String MomName, int age)
        {
            this.name = name;
            this.MomName = MomName;
            this.age = age;
        }
        
        public Human(int age, String job)
        {
            this.age = age;
            this.job = job;
        }
        
        public Human(String job, int age, String MomName)
        {
            this.job = job;
            this.age = age;
            this.MomName = MomName;
        }
    }

}
