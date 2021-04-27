public class ProfNames
{
  //Method by Tomas Oh, Period 2
  public int countNames(String[][]nameArray, String lastName)
  {
    int count = 0;
    for(int row = 0; row < nameArray.length; row++)
    {
      for(int col = 0; col < nameArray[0].length; col++)
      {
        if(nameArray[row][col].substring(0, lastName.length()).equals(lastName))
        {
         count++;
        }
      }
    }
   return count;
  }
}