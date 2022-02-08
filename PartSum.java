public class PartSum{

  public boolean partialSum(int start,int[] arr,int targetValue){
    if(targetValue == 0){
      return true;
    }else{
      for(int x=start; x<arr.length; x++){
        targetValue -= partialSum(x, arr, targetValue - arr[x]);
      }
      
    }
  }



}
