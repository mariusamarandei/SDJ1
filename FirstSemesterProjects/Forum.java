import java.util.ArrayList;

public class Forum
{
   int i;
   private String name;
   ArrayList<Post> postList= new ArrayList<Post>();
   public static int postCount=0;
   
   
   public Forum(String name)
   {
      this.name=name;
      
   }
   
   public String getName()
   {
      return name;
   }
   
   public void addPost(Post post)
   
   {
      
      postList.add(post);
      postCount++;
   }
   
   public void removePost(Post post)
   {
      postList.remove(post);
      postCount--;
   }
   
   public static int getPostCount()
   {
      return postCount;
   }
   
   public ArrayList<Post> getPostsBy ( String memberName)
   {
      ArrayList<Post> byNameList= new ArrayList<Post>();
      
      for(i=0;i<postCount;i++)
      {
         if (memberName==postList.get(i).getMember().getName())
           byNameList.add(postList.get(i)); 
            
      }
      return byNameList;
   }

}