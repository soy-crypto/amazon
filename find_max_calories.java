Find Maximum Calories
👩‍🎓 NEW GRAD
📚
RELATED PROBLEMS

A user is using the Amazon fitness tracker, and they are engaged in a jumping exercise routine. The user is positioned on the ground, and there are n stones, each placed at different heights. The height of the ith stone is represented by height[i] meters.

The goal is to maximize the calorie burn during this exercise, and the calories burned when jumping from the ith stone to the jth stone is calculated as (height[i] - height[j])^2.

The user intends to practice jumping on each stone exactly once but can choose the order in which they jump. Since the user is looking to optimize their calorie burn for this single session, the task is to determine the maximum amount of calories that can be burned during the exercise.

Formally, given an array height of size n, representing the height of each stone, find the maximum amount of calories the user can burn.

Note that the user can jump from any stone to any stone, and the ground's height is 0 and once user jumps to stone from ground, he/she can never go back to ground.

Function Description

Complete the function findMaximumCalories in the editor below.

findMaximumCalories has the following parameters:

int height[n]: the height of each stone



public long findMaximumCalories(int[] height) 
{
  //Base Check
  if(height == null)
  {
    return 0;
  }

  //Init
  long value;

  //Compute
  /** sort the give array */
  Arrays.sort(height);

  /** compute the maxmum calories */
  int len = height.length;
  int max = height[len - 1] * height[len - 1];
  int i = 0, j = len - 1;
  while(true)
  {
    //tc
    if(i >= j)
    {
      break;
    }

    //current pair
    max += Math.pow((height[i] - height[j]), 2) + Math.pow((height[i + 1] - height[j]), 2);

    //next pair
    i++;
    j--;
    
  }
  
  /** update value */
  value = max;

  //Return
  return value;
}
